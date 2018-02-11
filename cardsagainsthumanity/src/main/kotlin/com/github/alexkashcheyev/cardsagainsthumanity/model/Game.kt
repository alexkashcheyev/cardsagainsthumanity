package com.github.alexkashcheyev.cardsagainsthumanity.model

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class Game(
        val id: Long = 0,
        val blackDeck: LinkedList<BlackCard> = LinkedList<BlackCard>(),
        val whiteDeck: LinkedList<WhiteCard> = LinkedList<WhiteCard>(),
        val players: HashMap<Long, Player> = HashMap<Long, Player>(),

        var firstSubmission: Date? = null,
        var state: GameState = GameState.LOBBY,
        var blackCard: BlackCard? = null,
        var czar: Player? = null,
        var lastWinner: Player? = null
) {
}