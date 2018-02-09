package com.github.alexkashcheyev.cardsagainsthumanity.web

import com.github.alexkashcheyev.cardsagainsthumanity.model.WhiteCard

class PlayerPrivateState(
        id: Long,
        name: String,
        points: Long,
        isCzar: Boolean,
        sentCards: Array<WhiteCard>,

        val whiteCards: Array<WhiteCard>
): PlayerPublicState(id, name, points, isCzar, sentCards)