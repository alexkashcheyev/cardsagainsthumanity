package com.github.alexkashcheyev.cardsagainsthumanity.web

import com.github.alexkashcheyev.cardsagainsthumanity.model.WhiteCard

open class PlayerPublicState(
        val id: Long,
        val name: String,
        val points: Long,
        val isCzar: Boolean,
        val sentCards: Array<WhiteCard>
)