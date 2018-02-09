package com.github.alexkashcheyev.cardsagainsthumanity.model

class Player(
        private val game: Game,
        val name: String,
        val id: Long,
        val whiteCards: HashMap<Long, WhiteCard> = HashMap<Long, WhiteCard>(),
        val sentCards: ArrayList<WhiteCard> = ArrayList<WhiteCard>(),

        var points: Long = 0,
        var isAlive: Boolean = true
) {
    val gameId: Long
        get() = this.game.id

    val isCzar: Boolean
        get() = this == this.game.czar
}