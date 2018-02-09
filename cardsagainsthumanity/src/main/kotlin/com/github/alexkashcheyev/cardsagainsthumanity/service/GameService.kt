package com.github.alexkashcheyev.cardsagainsthumanity.service

import com.github.alexkashcheyev.cardsagainsthumanity.model.Game
import com.github.alexkashcheyev.cardsagainsthumanity.model.GameState
import com.github.alexkashcheyev.cardsagainsthumanity.model.Player
import com.github.alexkashcheyev.cardsagainsthumanity.repository.GameRepository
import com.github.alexkashcheyev.cardsagainsthumanity.web.ClientState
import com.github.alexkashcheyev.cardsagainsthumanity.web.MonitorState
import com.github.alexkashcheyev.cardsagainsthumanity.web.PlayerPrivateState
import com.github.alexkashcheyev.cardsagainsthumanity.web.PlayerPublicState
import org.springframework.stereotype.Service
import java.util.*
import java.util.Collections.shuffle

@Service
class GameService (private val gameRepository: GameRepository): IGameService {

    override fun createGame(): Long {
        return gameRepository.create().id
    }

    override fun joinGame(gameId: Long, playerName: String): Long {
        val game = gameRepository.getById(gameId)

        for (p in game.players.values) {
            if (p.name == playerName.trim()) {
                return -1
            }
        }

        val playerId = when {
            game.players.isEmpty() -> 1;
            else -> game.players.size + 1L
        }

        val player = Player(id = playerId, name = playerName.trim(), game = game)
        game.players[playerId] = player

        if (playerId == 1L) {
            game.czar = player
        }

        return player.id
    }

    override fun startGame(gameId: Long, playerId: Long) {
        val game = gameRepository.getById(gameId)

        if (game.czar?.id != playerId) {
            throw IllegalArgumentException("Peasant is trying to start the game")
        }

        shuffleCards(game.blackDeck)
        shuffleCards(game.whiteDeck)

        tryStartRound(game)
    }

    override fun sendCards(gameId: Long, playerId: Long, cardIds: Array<Long>) {
        val game = gameRepository.getById(gameId)
        val player = game.players[playerId] ?: throw NullPointerException("There is no such player")
        player.isAlive = true

        for (id in cardIds) {
            player.sentCards.add(player.whiteCards.remove(id) ?: throw NullPointerException("There is no such card"))
        }

        var alivePlayersSentCards = true
        for (p in game.players.values) {
            alivePlayersSentCards = alivePlayersSentCards && p.isAlive && p.sentCards.size > 0
        }

        if (alivePlayersSentCards) {
            game.state = GameState.ROUND_COURT
        }

        if (game.firstSubmission == null) {
            game.firstSubmission = Date()

            val t = Thread(TimeoutRoundFinisher(game))
            t.start()
        }
    }

    override fun chooseWinner(gameId: Long, playerId: Long, winnerId: Long) {
        val game = gameRepository.getById(gameId)

        if (game.czar?.id != playerId) {
            throw IllegalArgumentException("Peasant is trying to choose the winner")
        }

        val winner = game.players[winnerId] ?: throw  NullPointerException("There is no such player")

        winner.points++

        setNextCzar(game)

        if (game.czar == null) {
            game.state = GameState.OVER
        } else {
            game.state = GameState.ROUND_NEXT
        }
    }

    override fun getClientState(gameId: Long, playerId: Long): ClientState {
        val game = gameRepository.getById(gameId)
        val player = game.players[playerId] ?: throw NullPointerException("There is no such player")


        val res = ClientState(
                gameState = game.state,
                gameId = gameId,
                me = PlayerPrivateState(
                        id = playerId,
                        name = player.name,
                        points = player.points,
                        isCzar = player.isCzar,
                        sentCards = player.sentCards.toTypedArray(),
                        whiteCards = player.whiteCards.values.toTypedArray()
                ),
                others = getPlayersPublicStates(game, playerId)
        )

        return res
    }

    override fun getMonitorState(gameId: Long): MonitorState {
        val game = gameRepository.getById(gameId)

        val res = MonitorState(
                gameState = game.state,
                gameId = gameId,
                blackCard = game.blackCard,
                winnerId = game.lastWinner?.id ?: -1,
                players = getPlayersPublicStates(game)
        )

        return res
    }

    private fun <EntryType>shuffleCards(queue: LinkedList<EntryType>) {
        val temp = ArrayList<EntryType>(queue)
        shuffle(temp)
        queue.clear()
        queue.addAll(temp)
    }

    private fun tryStartRound(game: Game) {
        if (startRound(game)) {
            game.state = GameState.ROUND_START
        } else {
            val newGame = gameRepository.create()

            for (p in game.players.values) {
                if (newGame.czar == null) {
                    newGame.czar = p
                }
                newGame.players.put(p.id, Player(
                        id = p.id,
                        game = newGame,
                        name = p.name
                ))
            }

            game.state = GameState.OVER
            game.newGameId = newGame.id
        }
    }

    private fun startRound(game: Game): Boolean {
        if (game.blackDeck.isEmpty()) {
            return false
        }

        game.blackCard = game.blackDeck.remove()

        for (p in game.players.values) {
            p.sentCards.clear()
            while(p.whiteCards.size < PLAYER_CARD_COUNT()) {
                if (game.whiteDeck.isEmpty()) {
                    return false
                }

                val card = game.whiteDeck.remove()
                p.whiteCards.put(card.id, card)
            }
        }

        return true
    }

    private fun setNextCzar(game: Game) {
        if (game.czar == null) throw NullPointerException("Czar is null")
        val czar = game.czar!!
        game.czar = null
        var i = czar.id + 1

        while (i != czar.id && game.czar != null) {
            i++

            if (i >= game.players.size) {
                i = 1
            }

            if (game.players[i] != null && game.players[i]!!.isAlive) {
                game.czar = game.players[i]
            }
        }
    }

    private fun getPlayersPublicStates(game: Game, playerId: Long = -1): Array<PlayerPublicState> {

        val others = ArrayList<PlayerPublicState>()

        for (p in game.players.values) {
            if (p.id != playerId) {
                others.add(PlayerPublicState(
                        id = p.id,
                        name = p.name,
                        points = p.points,
                        isCzar = p.isCzar,
                        sentCards = p.sentCards.toTypedArray()
                ))
            }
        }

        return others.toTypedArray()
    }

    class TimeoutRoundFinisher(private val game: Game): Runnable {
        override fun run() {
            Thread.sleep(ROUND_TIMEOUT())

            if (game.state == GameState.ROUND_START) {
                game.state = GameState.ROUND_COURT
            }
        }
    }

}