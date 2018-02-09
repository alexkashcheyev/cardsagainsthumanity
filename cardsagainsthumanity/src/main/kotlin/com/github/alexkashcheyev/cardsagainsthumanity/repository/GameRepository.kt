package com.github.alexkashcheyev.cardsagainsthumanity.repository

import com.github.alexkashcheyev.cardsagainsthumanity.model.Game
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Repository
import java.util.*

@Repository
@Scope("singleton")
class GameRepository(private val cardRepository: ICardRepository) : IGameRepository {

    private val games: HashMap<Long, Game> = HashMap<Long, Game>();
    private val cleanupSchedule: Queue<CleanupScheduleEntry> = LinkedList<CleanupScheduleEntry>()

    private val CLEANUP_TIMEOUT = 24 * 60 * 60 * 1000;

    override fun create(): Game {
        val id = when {
            games.isEmpty() -> 1
            else -> games.keys.last() + 1
        }

        val currentDate = Date()

        cleanup(currentDate)
        scheduleCleanup(currentDate, id)
        return createGame(id)
    }

    override fun getById(id: Long): Game {
        return games[id] ?: throw ArrayIndexOutOfBoundsException("There is no game with given id")
    }

    private fun cleanup(currentDate: Date) {
        if (cleanupSchedule.isEmpty()) return

        while (currentDate >= cleanupSchedule.element().scheduledAt) {
            val entry = cleanupSchedule.remove()
            games.remove(entry.id)
        }
    }

    private fun scheduleCleanup(currentDate: Date, id: Long) {
        val removalDate = Date(currentDate.time + CLEANUP_TIMEOUT)
        val entry = CleanupScheduleEntry(removalDate, id)

        cleanupSchedule.add(entry)
    }

    private fun createGame(id: Long): Game {
        val game = Game(id = id)

        game.whiteDeck.addAll(cardRepository.getWhiteCards())
        game.blackDeck.addAll(cardRepository.getBlackCards())

        games.put(id, game)

        return game
    }

    class CleanupScheduleEntry (
        val scheduledAt: Date,
        val id: Long
    )

}