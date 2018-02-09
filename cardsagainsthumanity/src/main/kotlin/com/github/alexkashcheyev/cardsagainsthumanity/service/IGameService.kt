package com.github.alexkashcheyev.cardsagainsthumanity.service

import com.github.alexkashcheyev.cardsagainsthumanity.model.Game
import com.github.alexkashcheyev.cardsagainsthumanity.model.Player
import com.github.alexkashcheyev.cardsagainsthumanity.model.WhiteCard
import com.github.alexkashcheyev.cardsagainsthumanity.web.ClientState
import com.github.alexkashcheyev.cardsagainsthumanity.web.MonitorState

interface IGameService {
    fun createGame(): Long
    fun joinGame(gameId: Long, playerName: String): Long
    fun startGame(gameId: Long, playerId: Long)
    fun sendCards(gameId: Long, playerId: Long, cardIds: Array<Long>)
    fun chooseWinner(gameId: Long, playerId: Long, winnerId: Long)

    fun getClientState(gameId: Long, playerId: Long): ClientState
    fun getMonitorState(gameId: Long): MonitorState
}