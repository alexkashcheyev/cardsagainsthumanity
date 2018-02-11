package com.github.alexkashcheyev.cardsagainsthumanity.web

import com.github.alexkashcheyev.cardsagainsthumanity.model.BlackCard
import com.github.alexkashcheyev.cardsagainsthumanity.model.Game
import com.github.alexkashcheyev.cardsagainsthumanity.model.GameState
import com.github.alexkashcheyev.cardsagainsthumanity.model.Player

class ClientState(
    val gameState: GameState,
    val gameId: Long,
    val blackCard: BlackCard?,
    val me: PlayerPrivateState,
    val others: Array<PlayerPublicState>
)