package com.github.alexkashcheyev.cardsagainsthumanity.model

enum class GameState {
    LOBBY,          // ожидание игроков
    ROUND_START,    // начало раунда
    ROUND_COURT,    // царский суд
    ROUND_NEXT,     // ожидание следующего раунда
    OVER            // игра окончена
}