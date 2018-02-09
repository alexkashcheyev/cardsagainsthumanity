package com.github.alexkashcheyev.cardsagainsthumanity.repository

import com.github.alexkashcheyev.cardsagainsthumanity.model.BlackCard
import com.github.alexkashcheyev.cardsagainsthumanity.model.GrammaticCase
import com.github.alexkashcheyev.cardsagainsthumanity.model.WhiteCard
import org.springframework.stereotype.Repository

@Repository
class CardRepository(): ICardRepository {

    private val whiteCards = listOf(
            // page 1
            WhiteCard(
                    id = 1,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "шляпа Боярского"),
                            Pair(GrammaticCase.GENITIVE,        "шляпы Боярского"),
                            Pair(GrammaticCase.DATIVE,          "шляпе Боярского"),
                            Pair(GrammaticCase.ACCUSATIVE,      "шляпу Боярского"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "шляпой Боярского"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "шляпе Боярского")
                    )
            ),
            WhiteCard(
                    id = 2,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "средневековое порно"),
                            Pair(GrammaticCase.GENITIVE,        "средневекового порно"),
                            Pair(GrammaticCase.DATIVE,          "средневековому порно"),
                            Pair(GrammaticCase.ACCUSATIVE,      "средневековое порно"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "средневековым порно"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "средневековом порно")
                    )
            ),
            WhiteCard(
                    id = 3,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "белый человек"),
                            Pair(GrammaticCase.GENITIVE,        "белого человека"),
                            Pair(GrammaticCase.DATIVE,          "белому человеку"),
                            Pair(GrammaticCase.ACCUSATIVE,      "белого человека"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "белым человеком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "белом человеке")
                    )
            ),
            WhiteCard(
                    id = 4,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "приход"),
                            Pair(GrammaticCase.GENITIVE,        "прихода"),
                            Pair(GrammaticCase.DATIVE,          "приходу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "приход"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "приходом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "приходе")
                    )
            ),
            WhiteCard(
                    id = 5,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "изгнание геев"),
                            Pair(GrammaticCase.GENITIVE,        "изгнания геев"),
                            Pair(GrammaticCase.DATIVE,          "изгнанию геев"),
                            Pair(GrammaticCase.ACCUSATIVE,      "изгнание геев"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "изгнанием геев"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "изгнании геев")
                    )
            ),
            WhiteCard(
                    id = 6,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "карлики, гадящие в цветочный горшок"),
                            Pair(GrammaticCase.GENITIVE,        "карликов, гадящих в цветочный горшок"),
                            Pair(GrammaticCase.DATIVE,          "карликам, гадящим в цветочный горшок"),
                            Pair(GrammaticCase.ACCUSATIVE,      "карликов, гадящих в цветочный горшок"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "карликами, гадящими в цветочный горшок"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "карликах, гадящих в цветочный горшок")
                    )
            ),
            WhiteCard(
                    id = 7,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Гитлер"),
                            Pair(GrammaticCase.GENITIVE,        "Гитлера"),
                            Pair(GrammaticCase.DATIVE,          "Гитлеру"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Гитлера"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Гитлером"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Гитлере")
                    )
            ),
            WhiteCard(
                    id = 8,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "книжка «Колдовство для чайников»"),
                            Pair(GrammaticCase.GENITIVE,        "книжки «Колдовство для чайников»"),
                            Pair(GrammaticCase.DATIVE,          "книжке «Колдовство для чайников»"),
                            Pair(GrammaticCase.ACCUSATIVE,      "книжку «Колдовство для чайников»"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "книжкой «Колдовство для чайников»"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "книжке «Колдовство для чайников»")
                    )
            ),
            WhiteCard(
                    id = 9,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "неудавшийся день рождения"),
                            Pair(GrammaticCase.GENITIVE,        "неудавшиегося дня рождения"),
                            Pair(GrammaticCase.DATIVE,          "неудавшемуся дню рождения"),
                            Pair(GrammaticCase.ACCUSATIVE,      "неудавшийся день рождения"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "неудавшимся днём рождения"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "неудавшемся дне рождения")
                    )
            ),
            WhiteCard(
                    id = 10,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "щеночки"),
                            Pair(GrammaticCase.GENITIVE,        "щеночков"),
                            Pair(GrammaticCase.DATIVE,          "щеночкам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "щеночков"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "щеночками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "щеночках")
                    )
            ),
            WhiteCard(
                    id = 11,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "багажник полный трупов"),
                            Pair(GrammaticCase.GENITIVE,        "багажника полного трупов"),
                            Pair(GrammaticCase.DATIVE,          "багажнику полному трупов"),
                            Pair(GrammaticCase.ACCUSATIVE,      "багажник полный трупов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "багажником полным трупов"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "багажнике полном трупов")
                    )
            ),
            WhiteCard(
                    id = 12,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "парни, которые забывают перезвонить"),
                            Pair(GrammaticCase.GENITIVE,        "парней, которые забывают перезвонить"),
                            Pair(GrammaticCase.DATIVE,          "парням, которые забывают перезвонить"),
                            Pair(GrammaticCase.ACCUSATIVE,      "парней, которые забывают перезвонить"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "парнями, которые забывают перезвонить"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "парнях, которые забывают перезвонить")
                    )
            ),
            WhiteCard(
                    id = 13,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "тест на беременность"),
                            Pair(GrammaticCase.GENITIVE,        "теста на беременность"),
                            Pair(GrammaticCase.DATIVE,          "тесту на беременность"),
                            Pair(GrammaticCase.ACCUSATIVE,      "тест на беременность"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "тестом на беременность"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "тесте на беременность")
                    )
            ),
            WhiteCard(
                    id = 14,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "внезапная смерть"),
                            Pair(GrammaticCase.GENITIVE,        "внезапной смерти"),
                            Pair(GrammaticCase.DATIVE,          "внезапной смерти"),
                            Pair(GrammaticCase.ACCUSATIVE,      "внезапную смерть"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "внезапной смертью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "внезапной смерти")
                    )
            ),
            WhiteCard(
                    id = 15,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "брань Стивена Хокинга"),
                            Pair(GrammaticCase.GENITIVE,        "брани Стивена Хокинга"),
                            Pair(GrammaticCase.DATIVE,          "брани Стивена Хокинга"),
                            Pair(GrammaticCase.ACCUSATIVE,      "брань Стивена Хокинга"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "бранью Стивена Хокинга"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "брани Стивена Хокинга")
                    )
            ),
            // Card 16 is "Гореть в аду", skipping
            WhiteCard(
                    id = 17,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "жизнь полная тоски"),
                            Pair(GrammaticCase.GENITIVE,        "жизни полной тоски"),
                            Pair(GrammaticCase.DATIVE,          "жизни полной тоски"),
                            Pair(GrammaticCase.ACCUSATIVE,      "жизнь полную тоски"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "жизнью полной тоски"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "жизни полной тоски")
                    )
            ),
            WhiteCard(
                    id = 18,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "каменный стояк"),
                            Pair(GrammaticCase.GENITIVE,        "каменного стояка"),
                            Pair(GrammaticCase.DATIVE,          "каменному стояку"),
                            Pair(GrammaticCase.ACCUSATIVE,      "каменный стояк"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "каменным стояком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "каменном стояке")
                    )
            ),
            WhiteCard(
                    id = 19,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "СПИД"),
                            Pair(GrammaticCase.GENITIVE,        "СПИДа"),
                            Pair(GrammaticCase.DATIVE,          "СПИДу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "СПИД"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "СПИДом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "СПИДе")
                    )
            ),
            WhiteCard(
                    id = 20,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "однополые танцы на льду"),
                            Pair(GrammaticCase.GENITIVE,        "однополых танцев на льду"),
                            Pair(GrammaticCase.DATIVE,          "однополым танцам на льду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "однополые танцы на льду"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "однополыми танцами на льду"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "однополых танцах на льду")
                    )
            )
    )

    private val blackCards = listOf(
            BlackCard(
                    id = 1,
                    text = "__? для этого есть приложение.",
                    cases = arrayListOf(GrammaticCase.NOMINATIVE)
            ),
            BlackCard(
                    id = 2,
                    text = "Что мешает мне уснуть? - __.",
                    cases = arrayListOf(GrammaticCase.NOMINATIVE)
            ),
            BlackCard(
                    id = 3,
                    text = "Чем пахнет? - __.",
                    cases = arrayListOf(GrammaticCase.INSTRUMENTAL)
            ),
            BlackCard(
                    id = 4,
                    text = "У меня куча проблем, но _ не одна из них",
                    cases = arrayListOf(GrammaticCase.NOMINATIVE)
            ),
            BlackCard(
                    id = 5,
                    text = "Она такая от рождения. Может, дело в _.",
                    cases = arrayListOf(GrammaticCase.PREPOSITIONAL)
            ),
            BlackCard(
                    id = 6,
                    text = "Какая будет следующая игрушка в «Хэппи Мил»? - __.",
                    cases = arrayListOf(GrammaticCase.NOMINATIVE)
            ),
            BlackCard(
                    id = 7,
                    text = "Антропологи обнаружили племя, боготворящее _.",
                    cases = arrayListOf(GrammaticCase.ACCUSATIVE)
            ),
            BlackCard(
                    id = 8,
                    text = "Жаль, что детишки теперь увлекаются только _.",
                    cases = arrayListOf(GrammaticCase.INSTRUMENTAL)
            ),
            BlackCard(
                    id = 9,
                    text = "Пикассо, будучи в ударе, написал сотни полотен _.",
                    cases = arrayListOf(GrammaticCase.GENITIVE)
            ),
            BlackCard(
                    id = 10,
                    text = "Альтернативная медицина основана на целебной силе _.",
                    cases = arrayListOf(GrammaticCase.GENITIVE)
            ),
            BlackCard(
                    id = 11,
                    text = "И награда Академии в номинации «__» присуждается _.",
                    cases = arrayListOf(GrammaticCase.NOMINATIVE, GrammaticCase.DATIVE)
            ),
            BlackCard(
                    id = 12,
                    text = "Чем закончились мои последние отношения? - __.",
                    cases = arrayListOf(GrammaticCase.INSTRUMENTAL)
            ),
            BlackCard(
                    id = 13,
                    text = "В новом реалити-шоу звёзды живут вместе с _.",
                    cases = arrayListOf(GrammaticCase.PREPOSITIONAL)
            ),
            BlackCard(
                    id = 14,
                    text = "Я пью, чтобы забыть _.",
                    cases = arrayListOf(GrammaticCase.ACCUSATIVE)
            ),
            BlackCard(
                    id = 15,
                    text = "Извините, профессор, но я не смог сделать домашку из-за _.",
                    cases = arrayListOf(GrammaticCase.GENITIVE)
            ),
            BlackCard(
                    id = 16,
                    text = "Тайное увлечение Бэтмена - _.",
                    cases = arrayListOf(GrammaticCase.NOMINATIVE)
            ),
            BlackCard(
                    id = 17,
                    text = "И да наступит конец. И да померкнет свет. И снизойдёт на Землю _.",
                    cases = arrayListOf(GrammaticCase.NOMINATIVE)
            ),
            BlackCard(
                    id = 18,
                    text = "Лучшие друзья девушек - это _.",
                    cases = arrayListOf(GrammaticCase.NOMINATIVE)
            ),
            BlackCard(
                    id = 19,
                    text = "Службы безопасности ввели запрет на _ в самолетах.",
                    cases = arrayListOf(GrammaticCase.ACCUSATIVE)
            ),
            BlackCard(
                    id = 20,
                    text = "__. Вот о такой смерти я мечтаю",
                    cases = arrayListOf(GrammaticCase.NOMINATIVE)
            )
    )

    override fun getWhiteCards(): List<WhiteCard> {
        return whiteCards
    }

    override fun getBlackCards(): List<BlackCard> {
        return blackCards
    }

}