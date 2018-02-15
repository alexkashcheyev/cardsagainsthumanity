package com.github.alexkashcheyev.cardsagainsthumanity.repository

import com.github.alexkashcheyev.cardsagainsthumanity.model.BlackCard
import com.github.alexkashcheyev.cardsagainsthumanity.model.WhiteCard

interface ICardRepository {
    fun getWhiteCards(): List<WhiteCard>
    fun getBlackCards(): List<BlackCard>
    fun getHaikuCard(): BlackCard
}