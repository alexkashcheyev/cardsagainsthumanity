package com.github.alexkashcheyev.cardsagainsthumanity.repository

import com.github.alexkashcheyev.cardsagainsthumanity.model.Game


interface IGameRepository {
    fun create(): Game

    fun getById(id: Long): Game
}