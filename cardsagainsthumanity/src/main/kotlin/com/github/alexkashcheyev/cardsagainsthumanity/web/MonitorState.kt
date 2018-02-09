package com.github.alexkashcheyev.cardsagainsthumanity.web

import com.github.alexkashcheyev.cardsagainsthumanity.model.BlackCard
import com.github.alexkashcheyev.cardsagainsthumanity.model.GameState

class MonitorState (
        val gameState: GameState,
        val gameId: Long,
        val blackCard: BlackCard?,
        val players: Array<PlayerPublicState>,
        val winnerId: Long
)