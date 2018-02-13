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
            ),
            WhiteCard(
                    id = 21,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Дом-2"),
                            Pair(GrammaticCase.GENITIVE,        "Дома-2"),
                            Pair(GrammaticCase.DATIVE,          "Дому-2"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Дом-2"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Домом-2"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Доме-2")
                    )
            ),
            WhiteCard(
                    id = 22,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Ранетки"),
                            Pair(GrammaticCase.GENITIVE,        "Ранеток"),
                            Pair(GrammaticCase.DATIVE,          "Ранеткам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Ранеток"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Ранетками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Ранетках")
                    )
            ),
            WhiteCard(
                    id = 23,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "яйца птеродактиля"),
                            Pair(GrammaticCase.GENITIVE,        "яиц птеродактиля"),
                            Pair(GrammaticCase.DATIVE,          "яйцам птеродактиля"),
                            Pair(GrammaticCase.ACCUSATIVE,      "яйца птеродактиля"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "яйцами птеродактиля"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "яйцах птеродактиля")
                    )
            ),
            WhiteCard(
                    id = 24,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "рэкет"),
                            Pair(GrammaticCase.GENITIVE,        "рэкета"),
                            Pair(GrammaticCase.DATIVE,          "рэкету"),
                            Pair(GrammaticCase.ACCUSATIVE,      "рэкет"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "рэкетом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "рэкете")
                    )
            ),
            WhiteCard(
                    id = 25,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "менструация"),
                            Pair(GrammaticCase.GENITIVE,        "менструации"),
                            Pair(GrammaticCase.DATIVE,          "менструации"),
                            Pair(GrammaticCase.ACCUSATIVE,      "менструацию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "менструацией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "менструации")
                    )
            ),
            WhiteCard(
                    id = 26,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "любезности"),
                            Pair(GrammaticCase.GENITIVE,        "любезностей"),
                            Pair(GrammaticCase.DATIVE,          "любезностям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "любезности"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "любезностями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "любезностях")
                    )
            ),
            WhiteCard(
                    id = 27,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "дизентерия"),
                            Pair(GrammaticCase.GENITIVE,        "дизентерии"),
                            Pair(GrammaticCase.DATIVE,          "дизентерии"),
                            Pair(GrammaticCase.ACCUSATIVE,      "дизентерию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "дизентерией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "дизентерии")
                    )
            ),
            WhiteCard(
                    id = 28,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "укол морфия"),
                            Pair(GrammaticCase.GENITIVE,        "укола морфия"),
                            Pair(GrammaticCase.DATIVE,          "уколу морфия"),
                            Pair(GrammaticCase.ACCUSATIVE,      "укол морфия"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "уколом морфия"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "уколе морфия")
                    )
            ),
            WhiteCard(
                    id = 29,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "запретный плод"),
                            Pair(GrammaticCase.GENITIVE,        "запретного плода"),
                            Pair(GrammaticCase.DATIVE,          "запретному плоду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "запретный плод"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "запретным плодом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "запретном плоде")
                    )
            ),
            WhiteCard(
                    id = 30,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Единая Россия"),
                            Pair(GrammaticCase.GENITIVE,        "Единой России"),
                            Pair(GrammaticCase.DATIVE,          "Единой России"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Единую Россию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Единой Россией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Единой России")
                    )
            ),
            WhiteCard(
                    id = 31,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Большой Взрыв"),
                            Pair(GrammaticCase.GENITIVE,        "Большого Взрыва"),
                            Pair(GrammaticCase.DATIVE,          "Большому Взрыву"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Большой Взрыв"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Большим Взрывом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Большом Взрыве")
                    )
            ),
            WhiteCard(
                    id = 32,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "анальные шарики"),
                            Pair(GrammaticCase.GENITIVE,        "анальных шариков"),
                            Pair(GrammaticCase.DATIVE,          "анальным шарикам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "анальные шарики"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "анальными шариками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "анальных шариках")
                    )
            ),
            WhiteCard(
                    id = 33,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "калеки"),
                            Pair(GrammaticCase.GENITIVE,        "калек"),
                            Pair(GrammaticCase.DATIVE,          "калекам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "калек"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "калеками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "калеках")
                    )
            ),
            WhiteCard(
                    id = 34,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "люди"),
                            Pair(GrammaticCase.GENITIVE,        "людей"),
                            Pair(GrammaticCase.DATIVE,          "людям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "людей"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "людьми"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "людях")
                    )
            ),
            WhiteCard(
                    id = 35,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "случайный секс"),
                            Pair(GrammaticCase.GENITIVE,        "случайного секса"),
                            Pair(GrammaticCase.DATIVE,          "случайному сексу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "случайный секс"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "случайным сексом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "случайном сексе")
                    )
            ),
            WhiteCard(
                    id = 36,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Ким Чен Ир"),
                            Pair(GrammaticCase.GENITIVE,        "Ким Чен Ира"),
                            Pair(GrammaticCase.DATIVE,          "Ким Чен Иру"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Ким Чен Ира"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Ким Чен Иром"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Ким Чен Ире")
                    )
            ),
            WhiteCard(
                    id = 37,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "скрытая угроза"),
                            Pair(GrammaticCase.GENITIVE,        "скрытой угрозы"),
                            Pair(GrammaticCase.DATIVE,          "скрытой угрозе"),
                            Pair(GrammaticCase.ACCUSATIVE,      "скрытую угрозу"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "скрытой угрозой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "скрытой угрозе")
                    )
            ),
            WhiteCard(
                    id = 38,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "колхоз"),
                            Pair(GrammaticCase.GENITIVE,        "колхоза"),
                            Pair(GrammaticCase.DATIVE,          "колхозу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "колхоз"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "колхозом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "колхозе")
                    )
            ),
            WhiteCard(
                    id = 39,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Валуев, заваливший медведя"),
                            Pair(GrammaticCase.GENITIVE,        "Валуева, завалившего медведя"),
                            Pair(GrammaticCase.DATIVE,          "Валуеву, завалившему медведя"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Валуева, завалившего медведя"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Валуевым, завалившим медведя"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Валуеве, завалившем медведя")
                    )
            ),
            WhiteCard(
                    id = 40,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "рабочий ротик"),
                            Pair(GrammaticCase.GENITIVE,        "рабочего ротика"),
                            Pair(GrammaticCase.DATIVE,          "рабочему ротику"),
                            Pair(GrammaticCase.ACCUSATIVE,      "рабочий ротик"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "рабочим ротиком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "рабочем ротике")
                    )
            ),
            WhiteCard(
                    id = 41,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "незапланированная беременность"),
                            Pair(GrammaticCase.GENITIVE,        "незапланированной беременности"),
                            Pair(GrammaticCase.DATIVE,          "незапланированной беременности"),
                            Pair(GrammaticCase.ACCUSATIVE,      "незапланированную беременность"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "незапланированной беременностью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "незапланированной беременности")
                    )
            ),
            WhiteCard(
                    id = 42,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "евреи"),
                            Pair(GrammaticCase.GENITIVE,        "евреев"),
                            Pair(GrammaticCase.DATIVE,          "евреям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "евреев"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "евреями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "евреях")
                    )
            ),
            WhiteCard(
                    id = 43,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "харизма"),
                            Pair(GrammaticCase.GENITIVE,        "харизмы"),
                            Pair(GrammaticCase.DATIVE,          "харизме"),
                            Pair(GrammaticCase.ACCUSATIVE,      "харизму"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "харизмой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "харизме")
                    )
            ),
            WhiteCard(
                    id = 44,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "жирухи на пилоне"),
                            Pair(GrammaticCase.GENITIVE,        "жирух на пилоне"),
                            Pair(GrammaticCase.DATIVE,          "жирухам на пилоне"),
                            Pair(GrammaticCase.ACCUSATIVE,      "жирух на пилоне"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "жирухами на пилоне"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "жирухах на пилоне")
                    )
            ),
            WhiteCard(
                    id = 45,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "групповуха пьяных панд"),
                            Pair(GrammaticCase.GENITIVE,        "групповухи пьяных панд"),
                            Pair(GrammaticCase.DATIVE,          "групповухе пьяных панд"),
                            Pair(GrammaticCase.ACCUSATIVE,      "групповуху пьяных панд"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "групповухой пьяных панд"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "групповухе пьяных панд")
                    )
            ),
            // 46 - расстёгивать лифчик. Будет существительным
            WhiteCard(
                    id = 46,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "расстёгивание лифчика"),
                            Pair(GrammaticCase.GENITIVE,        "расстёгивания лифчика"),
                            Pair(GrammaticCase.DATIVE,          "расстёгиванию лифчика"),
                            Pair(GrammaticCase.ACCUSATIVE,      "расстёгивание лифчика"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "расстёгиванием лифчика"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "расстёгивании лифчика")
                    )
            ),
            WhiteCard(
                    id = 47,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пальба вслепую"),
                            Pair(GrammaticCase.GENITIVE,        "пальбы вслепую"),
                            Pair(GrammaticCase.DATIVE,          "пальбе вслепую"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пальбу вслепую"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пальбой вслепую"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пальбе вслепую")
                    )
            ),
            WhiteCard(
                    id = 48,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Борис Ельцин"),
                            Pair(GrammaticCase.GENITIVE,        "Бориса Ельцина"),
                            Pair(GrammaticCase.DATIVE,          "Борису Ельцину"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Бориса Ельцина"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Борисом Ельциным"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Борисе Ельцине")
                    )
            ),
            WhiteCard(
                    id = 49,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "голос Моргана Фримена"),
                            Pair(GrammaticCase.GENITIVE,        "голоса Моргана Фримена"),
                            Pair(GrammaticCase.DATIVE,          "голосу Моргана Фримена"),
                            Pair(GrammaticCase.ACCUSATIVE,      "голос Моргана Фримена"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "голосом Моргана Фримена"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "голосе Моргана Фримена")
                    )
            ),
            WhiteCard(
                    id = 50,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "дикие русские пляски"),
                            Pair(GrammaticCase.GENITIVE,        "диких русских плясок"),
                            Pair(GrammaticCase.DATIVE,          "диким русским пляскам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "дикие русские пляски"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "дикими русскими плясками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "диких русских плясках")
                    )
            ),
            WhiteCard(
                    id = 51,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сессия"),
                            Pair(GrammaticCase.GENITIVE,        "сессии"),
                            Pair(GrammaticCase.DATIVE,          "сессии"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сессию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сессией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сессии")
                    )
            ),
            WhiteCard(
                    id = 52,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "анекдоты о мёртвых младенцах"),
                            Pair(GrammaticCase.GENITIVE,        "анекдотов о мёртвых младенцах"),
                            Pair(GrammaticCase.DATIVE,          "анекдотам о мёртвых младенцах"),
                            Pair(GrammaticCase.ACCUSATIVE,      "анекдоты о мёртвых младенцах"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "анекдотами о мёртвых младенцах"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "анекдотах о мёртвых младенцах")
                    )
            ),
            WhiteCard(
                    id = 53,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "онанизм"),
                            Pair(GrammaticCase.GENITIVE,        "онанизма"),
                            Pair(GrammaticCase.DATIVE,          "онанизму"),
                            Pair(GrammaticCase.ACCUSATIVE,      "онанизм"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "онанизмом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "онанизме")
                    )
            ),
            WhiteCard(
                    id = 54,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "гормон роста"),
                            Pair(GrammaticCase.GENITIVE,        "гормона роста"),
                            Pair(GrammaticCase.DATIVE,          "гормону роста"),
                            Pair(GrammaticCase.ACCUSATIVE,      "гормон роста"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "гормоном роста"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "гормоне роста")
                    )
            ),
            WhiteCard(
                    id = 55,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "инцест"),
                            Pair(GrammaticCase.GENITIVE,        "инцеста"),
                            Pair(GrammaticCase.DATIVE,          "инцесту"),
                            Pair(GrammaticCase.ACCUSATIVE,      "инцест"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "инцестом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "инцесте")
                    )
            ),
            WhiteCard(
                    id = 56,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "снятие скальпа"),
                            Pair(GrammaticCase.GENITIVE,        "снятия скальпа"),
                            Pair(GrammaticCase.DATIVE,          "снятию скальпа"),
                            Pair(GrammaticCase.ACCUSATIVE,      "снятие скальпа"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "снятием скальпа"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "снятии скальпа")
                    )
            ),
            WhiteCard(
                    id = 57,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "горячий супчик"),
                            Pair(GrammaticCase.GENITIVE,        "горячего супчика"),
                            Pair(GrammaticCase.DATIVE,          "горячему супчику"),
                            Pair(GrammaticCase.ACCUSATIVE,      "горячий супчик"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "горячим супчиком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "горячем супчике")
                    )
            ),
            WhiteCard(
                    id = 58,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "жидкий стул"),
                            Pair(GrammaticCase.GENITIVE,        "жидкого стула"),
                            Pair(GrammaticCase.DATIVE,          "жидкому стулу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "жидкий стул"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "жидким стулом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "жидком стуле")
                    )
            ),
            WhiteCard(
                    id = 59,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "нацизм"),
                            Pair(GrammaticCase.GENITIVE,        "нацизма"),
                            Pair(GrammaticCase.DATIVE,          "нацизму"),
                            Pair(GrammaticCase.ACCUSATIVE,      "нацизм"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "нацизмом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "нацизме")
                    )
            ),
            WhiteCard(
                    id = 60,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Том Круз"),
                            Pair(GrammaticCase.GENITIVE,        "Тома Круза"),
                            Pair(GrammaticCase.DATIVE,          "Тому Крузу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Тома Круза"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Томом Крузом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Томе Крузе")
                    )
            ),
            WhiteCard(
                    id = 61,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "безбашенные туземцы"),
                            Pair(GrammaticCase.GENITIVE,        "безбашенных туземцев"),
                            Pair(GrammaticCase.DATIVE,          "безбашенным туземцам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "безбашенных туземцев"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "безбашенными туземцами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "безбашенных туземцах")
                    )
            ),
            WhiteCard(
                    id = 62,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "лезгинка"),
                            Pair(GrammaticCase.GENITIVE,        "лезгинки"),
                            Pair(GrammaticCase.DATIVE,          "лезгинке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "лезгинку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "лезгинкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "лезгинке")
                    )
            ),
            // Катсан, пропитанный кошачьими ссаками - звучит как-то по-детски
            WhiteCard(
                    id = 63,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "использованный наполнитель для кошачьего туалета"),
                            Pair(GrammaticCase.GENITIVE,        "использованного наполнителя для кошачьего туалета"),
                            Pair(GrammaticCase.DATIVE,          "использованному наполнителю для кошачьего туалета"),
                            Pair(GrammaticCase.ACCUSATIVE,      "использованный наполнитель для кошачьего туалета"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "использованным наполнителем для кошачьего туалета"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "использованном наполнителе для кошачьего туалета")
                    )
            ),
            WhiteCard(
                    id = 64,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "новогодний оливье"),
                            Pair(GrammaticCase.GENITIVE,        "новогоднего оливье"),
                            Pair(GrammaticCase.DATIVE,          "новогоднему оливье"),
                            Pair(GrammaticCase.ACCUSATIVE,      "новогодний оливье"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "новогодним оливье"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "новогоднем оливье")
                    )
            ),
            WhiteCard(
                    id = 65,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "постоянство времени"),
                            Pair(GrammaticCase.GENITIVE,        "постоянства времени"),
                            Pair(GrammaticCase.DATIVE,          "постоянству времени"),
                            Pair(GrammaticCase.ACCUSATIVE,      "постоянство времени"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "постоянством времени"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "постоянстве времени")
                    )
            ),
            WhiteCard(
                    id = 66,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "полезные советы"),
                            Pair(GrammaticCase.GENITIVE,        "полезных советов"),
                            Pair(GrammaticCase.DATIVE,          "полезным советам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "полезные советы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "полезными советами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "полезных советах")
                    )
            ),
            WhiteCard(
                    id = 67,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "непроизвольное мочеиспускание"),
                            Pair(GrammaticCase.GENITIVE,        "непроизвольного мочеиспускания"),
                            Pair(GrammaticCase.DATIVE,          "непроизвольному мочеиспусканию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "непроизвольное мочеиспускание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "непроизвольным мочеиспусканием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "непроизвольном мочеиспускании  ")
                    )
            ),
            WhiteCard(
                    id = 68,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "хук правой"),
                            Pair(GrammaticCase.GENITIVE,        "хука правой"),
                            Pair(GrammaticCase.DATIVE,          "хуку правой"),
                            Pair(GrammaticCase.ACCUSATIVE,      "хук правой"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "хуком правой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "хуке правой")
                    )
            ),
            WhiteCard(
                    id = 69,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мыльные пузыри"),
                            Pair(GrammaticCase.GENITIVE,        "мыльных пузырей"),
                            Pair(GrammaticCase.DATIVE,          "мыльным пузырям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мыльные пузыри"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мыльными пузырями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мыльных пузырях")
                    )
            ),
            WhiteCard(
                    id = 70,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "даун"),
                            Pair(GrammaticCase.GENITIVE,        "дауна"),
                            Pair(GrammaticCase.DATIVE,          "дауну"),
                            Pair(GrammaticCase.ACCUSATIVE,      "дауна"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "дауном"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "дауне")
                    )
            ),
            WhiteCard(
                    id = 71,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ожирение"),
                            Pair(GrammaticCase.GENITIVE,        "ожирения"),
                            Pair(GrammaticCase.DATIVE,          "ожирению"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ожирение"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ожирении"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ожирении")
                    )
            ),
            WhiteCard(
                    id = 72,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "оскорбительное высокомерие"),
                            Pair(GrammaticCase.GENITIVE,        "оскорбительного высокомерия"),
                            Pair(GrammaticCase.DATIVE,          "оскорбительному высокомерию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "оскорбительное высокомерие"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "оскорбительным высокомерием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "оскорбительном высокомерии")
                    )
            ),
            WhiteCard(
                    id = 73,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "депрессия"),
                            Pair(GrammaticCase.GENITIVE,        "депрессии"),
                            Pair(GrammaticCase.DATIVE,          "депрессии"),
                            Pair(GrammaticCase.ACCUSATIVE,      "депрессию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "депрессией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "депрессии")
                    )
            ),
            WhiteCard(
                    id = 74,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "овсянка"),
                            Pair(GrammaticCase.GENITIVE,        "овсянки"),
                            Pair(GrammaticCase.DATIVE,          "овсянке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "овсянку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "овсянкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "овсянке")
                    )
            ),
            WhiteCard(
                    id = 75,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "отбросы общества"),
                            Pair(GrammaticCase.GENITIVE,        "отбросов общества"),
                            Pair(GrammaticCase.DATIVE,          "отбросам общества"),
                            Pair(GrammaticCase.ACCUSATIVE,      "отбросы общества"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "отбросами общества"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "отбросах общества")
                    )
            ),
            WhiteCard(
                    id = 76,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "американская мечта"),
                            Pair(GrammaticCase.GENITIVE,        "американской мечты"),
                            Pair(GrammaticCase.DATIVE,          "американской мечте"),
                            Pair(GrammaticCase.ACCUSATIVE,      "американскую мечту"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "американской мечтой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "американской мечте")
                    )
            ),
            WhiteCard(
                    id = 77,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "школьные спектакли"),
                            Pair(GrammaticCase.GENITIVE,        "школьных спектаклей"),
                            Pair(GrammaticCase.DATIVE,          "школьным спектаклям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "школьные спектакли"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "школьными спектаклями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "школьных спектаклях")
                    )
            ),
            WhiteCard(
                    id = 78,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пубертатный период"),
                            Pair(GrammaticCase.GENITIVE,        "пубертатного периода"),
                            Pair(GrammaticCase.DATIVE,          "пубертатному периоду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пубертатный период"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пубертатным периодом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пубертатном периоде")
                    )
            ),
            WhiteCard(
                    id = 79,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сотрясение яичек"),
                            Pair(GrammaticCase.GENITIVE,        "сотрясения яичек"),
                            Pair(GrammaticCase.DATIVE,          "сотрясению яичек"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сотрясение яичек"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сотрясением яичек"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сотрясении яичек")
                    )
            ),
            WhiteCard(
                    id = 80,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "неведомая ёбаная хуйня"),
                            Pair(GrammaticCase.GENITIVE,        "неведомой ёбаной хуйни"),
                            Pair(GrammaticCase.DATIVE,          "неведомой ёбаной хуйне"),
                            Pair(GrammaticCase.ACCUSATIVE,      "неведомую ёбаную хуйню"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "неведомой ёбаной хуйнёй"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "неведомой ёбаной хуйне")
                    )
            ),
            WhiteCard(
                    id = 81,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "The Prodigy"),
                            Pair(GrammaticCase.GENITIVE,        "The Prodigy"),
                            Pair(GrammaticCase.DATIVE,          "The Prodigy"),
                            Pair(GrammaticCase.ACCUSATIVE,      "The Prodigy"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "The Prodigy"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "The Prodigy")
                    )
            ),
            WhiteCard(
                    id = 82,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "виндсёрфинг"),
                            Pair(GrammaticCase.GENITIVE,        "виндсёрфинга"),
                            Pair(GrammaticCase.DATIVE,          "виндсёрфингу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "виндсёрфинг"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "виндсёрфингом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "виндсёрфинге")
                    )
            ),
            WhiteCard(
                    id = 83,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Ку-клукс-клан"),
                            Pair(GrammaticCase.GENITIVE,        "Ку-клукс-клана"),
                            Pair(GrammaticCase.DATIVE,          "Ку-клукс-клану"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Ку-клукс-клан"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Ку-клукс-кланом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Ку-клукс-клане")
                    )
            ),
            WhiteCard(
                    id = 84,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пилоты-камикадзе"),
                            Pair(GrammaticCase.GENITIVE,        "пилотов-камикадзе"),
                            Pair(GrammaticCase.DATIVE,          "пилотам-камикадзе"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пилотов-камикадзе"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пилотами-камикадзе"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пилотах-камикадзе")
                    )
            ),
            WhiteCard(
                    id = 85,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ужасающие последствия лазерной эпиляции"),
                            Pair(GrammaticCase.GENITIVE,        "ужасающих последствий лазерной эпиляции"),
                            Pair(GrammaticCase.DATIVE,          "ужасающим последствиям лазерной эпиляции"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ужасающие последствия лазерной эпиляции"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ужасающими последствиями лазерной эпиляции"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ужасающих последствиях лазерной эпиляции")
                    )
            ),
            WhiteCard(
                    id = 86,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "амфетамин"),
                            Pair(GrammaticCase.GENITIVE,        "амфетамина"),
                            Pair(GrammaticCase.DATIVE,          "амфетамину"),
                            Pair(GrammaticCase.ACCUSATIVE,      "амфетамин"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "амфетамином"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "амфетамине")
                    )
            ),
            WhiteCard(
                    id = 87,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "игра в гляделки"),
                            Pair(GrammaticCase.GENITIVE,        "игры в гляделки"),
                            Pair(GrammaticCase.DATIVE,          "игре в гляделки"),
                            Pair(GrammaticCase.ACCUSATIVE,      "игру в гляделки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "игрой в гляделки"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "игре в гляделки")
                    )
            ),
            WhiteCard(
                    id = 88,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "грязные делишки"),
                            Pair(GrammaticCase.GENITIVE,        "грязных делишек"),
                            Pair(GrammaticCase.DATIVE,          "грязным делишкам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "грязные делишки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "грязными делишками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "грязных делишках")
                    )
            ),
            // 89 - хуй, пизда, Джигурда - как это склонять?
            WhiteCard(
                    id = 90,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "рукоблудие"),
                            Pair(GrammaticCase.GENITIVE,        "рукоблудия"),
                            Pair(GrammaticCase.DATIVE,          "рукоблудию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "рукоблудие"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "рукоблудием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "рукоблудии")
                    )
            ),
            WhiteCard(
                    id = 91,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "течка"),
                            Pair(GrammaticCase.GENITIVE,        "течки"),
                            Pair(GrammaticCase.DATIVE,          "течке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "течку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "течкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "течке")
                    )
            ),
            WhiteCard(
                    id = 92,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "«Охота» крепкое"),
                            Pair(GrammaticCase.GENITIVE,        "«Охоты» крепкого"),
                            Pair(GrammaticCase.DATIVE,          "«Охоте» крепкому"),
                            Pair(GrammaticCase.ACCUSATIVE,      "«Охоту» крепкое"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "«Охотой» крепким"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "«Охоте» крепком")
                    )
            ),
            WhiteCard(
                    id = 93,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пара мощных волын"),
                            Pair(GrammaticCase.GENITIVE,        "пары мощных волын"),
                            Pair(GrammaticCase.DATIVE,          "паре мощных волын"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пару мощных волын"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "парой мощных волын"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "паре мощных волын")
                    )
            ),
            // Моя любимая карта
            WhiteCard(
                    id = 94,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "соло на флейте"),
                            Pair(GrammaticCase.GENITIVE,        "соло на флейте"),
                            Pair(GrammaticCase.DATIVE,          "соло на флейте"),
                            Pair(GrammaticCase.ACCUSATIVE,      "соло на флейте"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "соло на флейте"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "соло на флейте")
                    )
            ),
            WhiteCard(
                    id = 95,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "гомики"),
                            Pair(GrammaticCase.GENITIVE,        "гомиков"),
                            Pair(GrammaticCase.DATIVE,          "гомикам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "гомиков"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "гомиками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "гомиках")
                    )
            ),
            WhiteCard(
                    id = 96,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пещерный человек на роликах"),
                            Pair(GrammaticCase.GENITIVE,        "пещерного человека на роликах"),
                            Pair(GrammaticCase.DATIVE,          "пещерному человеку на роликах"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пещерного человека на роликах"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пещерным человеком на роликах"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пещерном человеке на роликах")
                    )
            ),
            WhiteCard(
                    id = 97,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сквернословие"),
                            Pair(GrammaticCase.GENITIVE,        "сквернословие"),
                            Pair(GrammaticCase.DATIVE,          "сквернословие"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сквернословие"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сквернословие"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сквернословие")
                    )
            ),
            WhiteCard(
                    id = 98,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "полезные вещи из «Магазина на диване»"),
                            Pair(GrammaticCase.GENITIVE,        "полезных вещей из «Магазина на диване»"),
                            Pair(GrammaticCase.DATIVE,          "полезным вещам из «Магазина на диване»"),
                            Pair(GrammaticCase.ACCUSATIVE,      "полезные вещи из «Магазина на диване»"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "полезными вещами из «Магазина на диване»"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "полезных вещах из «Магазина на диване»")
                    )
            ),
            WhiteCard(
                    id = 99,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "раздутое эго"),
                            Pair(GrammaticCase.GENITIVE,        "раздутого эго"),
                            Pair(GrammaticCase.DATIVE,          "раздутому эго"),
                            Pair(GrammaticCase.ACCUSATIVE,      "раздутое эго"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "раздутым эго"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "раздутом эго")
                    )
            ),
            WhiteCard(
                    id = 100,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "петтинг"),
                            Pair(GrammaticCase.GENITIVE,        "петтинга"),
                            Pair(GrammaticCase.DATIVE,          "петтингу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "петтинг"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "петтингом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "петтинге")
                    )
            ),
            WhiteCard(
                    id = 101,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "аборт с помощью вантуза"),
                            Pair(GrammaticCase.GENITIVE,        "аборта с помощью вантуза"),
                            Pair(GrammaticCase.DATIVE,          "аборту с помощью вантуза"),
                            Pair(GrammaticCase.ACCUSATIVE,      "аборт с помощью вантуза"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "абортом с помощью вантуза"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "аборте с помощью вантуза")
                    )
            ),
            WhiteCard(
                    id = 102,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "стояние в очереди"),
                            Pair(GrammaticCase.GENITIVE,        "стояния в очереди"),
                            Pair(GrammaticCase.DATIVE,          "стоянию в очереди"),
                            Pair(GrammaticCase.ACCUSATIVE,      "стояние в очереди"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "стоянием в очереди"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "стоянии в очереди")
                    )
            ),
            WhiteCard(
                    id = 103,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "крошки на бороде"),
                            Pair(GrammaticCase.GENITIVE,        "крошек на бороде"),
                            Pair(GrammaticCase.DATIVE,          "крошкам на бороде"),
                            Pair(GrammaticCase.ACCUSATIVE,      "крошки на бороде"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "крошками на бороде"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "крошках на бороде")
                    )
            ),
            WhiteCard(
                    id = 104,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "милая неряшливость"),
                            Pair(GrammaticCase.GENITIVE,        "милой неряшливости"),
                            Pair(GrammaticCase.DATIVE,          "милой неряшливости"),
                            Pair(GrammaticCase.ACCUSATIVE,      "милую неряшливость"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "милой неряшливостью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "милой неряшливости")
                    )
            ),
            WhiteCard(
                    id = 105,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "нашествие динозавров"),
                            Pair(GrammaticCase.GENITIVE,        "нашествия динозавров"),
                            Pair(GrammaticCase.DATIVE,          "нашествию динозавров"),
                            Pair(GrammaticCase.ACCUSATIVE,      "нашествие динозавров"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "нашествием динозавров"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "нашествии динозавров")
                    )
            ),
            WhiteCard(
                    id = 106,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "коллекция экстравагантных секс-игрушек"),
                            Pair(GrammaticCase.GENITIVE,        "коллекции экстравагантных секс-игрушек"),
                            Pair(GrammaticCase.DATIVE,          "коллекции экстравагантных секс-игрушек"),
                            Pair(GrammaticCase.ACCUSATIVE,      "коллекцию экстравагантных секс-игрушек"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "коллекцией экстравагантных секс-игрушек"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "коллекции экстравагантных секс-игрушек")
                    )
            ),
            WhiteCard(
                    id = 107,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "осиное гнездо"),
                            Pair(GrammaticCase.GENITIVE,        "осиного гнезда"),
                            Pair(GrammaticCase.DATIVE,          "осиному гнезду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "осиное гнездо"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "осиным гнездом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "осином гнезде")
                    )
            ),
            WhiteCard(
                    id = 108,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "алкогольное отравление"),
                            Pair(GrammaticCase.GENITIVE,        "алкогольного отравления"),
                            Pair(GrammaticCase.DATIVE,          "алкогольному отравлению"),
                            Pair(GrammaticCase.ACCUSATIVE,      "алкогольное отравление"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "алкогольным отравлением"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "алкогольном отравлении")
                    )
            ),
            // 109 - нюхать клей
            WhiteCard(
                    id = 110,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "гигантский Чупа-Чупс"),
                            Pair(GrammaticCase.GENITIVE,        "гигантского Чупа-Чупса"),
                            Pair(GrammaticCase.DATIVE,          "гигантскому Чупа-Чупсу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "гигантский Чупа-Чупс"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "гигантским Чупа-Чупсом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "гигантском Чупа-Чупсе")
                    )
            ),
            WhiteCard(
                    id = 111,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "лоботомия киркой"),
                            Pair(GrammaticCase.GENITIVE,        "лоботомии киркой"),
                            Pair(GrammaticCase.DATIVE,          "лоботомии киркой"),
                            Pair(GrammaticCase.ACCUSATIVE,      "лоботомию киркой"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "лоботомией киркой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "лоботомии киркой")
                    )
            ),
            WhiteCard(
                    id = 112,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "богатство"),
                            Pair(GrammaticCase.GENITIVE,        "богатства"),
                            Pair(GrammaticCase.DATIVE,          "богатству"),
                            Pair(GrammaticCase.ACCUSATIVE,      "богатство"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "богатством"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "богатстве")
                    )
            ),
            WhiteCard(
                    id = 113,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "секс по дружбе"),
                            Pair(GrammaticCase.GENITIVE,        "секса по дружбе"),
                            Pair(GrammaticCase.DATIVE,          "сексу по дружбе"),
                            Pair(GrammaticCase.ACCUSATIVE,      "секс по дружбе"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сексом по дружбе"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сексе по дружбе")
                    )
            ),
            WhiteCard(
                    id = 114,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "робот-ловелас"),
                            Pair(GrammaticCase.GENITIVE,        "робота-ловеласа"),
                            Pair(GrammaticCase.DATIVE,          "роботу-ловеласу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "робота-ловеласа"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "роботом-ловеласом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "роботе-ловеласе")
                    )
            ),
            WhiteCard(
                    id = 115,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "женские права"),
                            Pair(GrammaticCase.GENITIVE,        "женских прав"),
                            Pair(GrammaticCase.DATIVE,          "женским правам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "женские права"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "женскими правами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "женских правах")
                    )
            ),
            WhiteCard(
                    id = 116,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "активный отдых"),
                            Pair(GrammaticCase.GENITIVE,        "активного отдыха"),
                            Pair(GrammaticCase.DATIVE,          "активному отдыху"),
                            Pair(GrammaticCase.ACCUSATIVE,      "активный отдых"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "активным отдыхом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "активном отдыхе")
                    )
            ),
            WhiteCard(
                    id = 117,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "путь к сердцу мужчины"),
                            Pair(GrammaticCase.GENITIVE,        "пути к сердцу мужчины"),
                            Pair(GrammaticCase.DATIVE,          "пути к сердцу мужчины"),
                            Pair(GrammaticCase.ACCUSATIVE,      "путь к сердцу мужчины"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "путём к сердцу мужчины"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пути к сердцу мужчины")
                    )
            ),
            WhiteCard(
                    id = 118,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "клитор"),
                            Pair(GrammaticCase.GENITIVE,        "клитора"),
                            Pair(GrammaticCase.DATIVE,          "клитору"),
                            Pair(GrammaticCase.ACCUSATIVE,      "клитор"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "клитором"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "клиторе")
                    )
            ),
            WhiteCard(
                    id = 119,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Никита Михалков"),
                            Pair(GrammaticCase.GENITIVE,        "Никиты Михалкова"),
                            Pair(GrammaticCase.DATIVE,          "Никите Михалкову"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Никиту Михалкова"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Никитой Михалковым"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Никите Михалкове")
                    )
            ),
            WhiteCard(
                    id = 120,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "невидимый барьер"),
                            Pair(GrammaticCase.GENITIVE,        "невидимого барьера"),
                            Pair(GrammaticCase.DATIVE,          "невидимому барьеру"),
                            Pair(GrammaticCase.ACCUSATIVE,      "невидимый барьер"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "невидимым барьером"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "невидимом барьере")
                    )
            ),
            WhiteCard(
                    id = 121,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Новодворская"),
                            Pair(GrammaticCase.GENITIVE,        "Новодворской"),
                            Pair(GrammaticCase.DATIVE,          "Новодворской"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Новодворскую"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Новодворской"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Новодворской")
                    )
            ),
            WhiteCard(
                    id = 122,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "бои подушками"),
                            Pair(GrammaticCase.GENITIVE,        "боёв подушками"),
                            Pair(GrammaticCase.DATIVE,          "боям подушками"),
                            Pair(GrammaticCase.ACCUSATIVE,      "бои подушками"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "боями подушками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "боях подушками")
                    )
            ),
            WhiteCard(
                    id = 123,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "дрожжи"),
                            Pair(GrammaticCase.GENITIVE,        "дрожжей"),
                            Pair(GrammaticCase.DATIVE,          "дрожжам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "дрожжи"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "дрожжами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "дрожжах")
                    )
            ),
            WhiteCard(
                    id = 124,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "полная обнажёнка"),
                            Pair(GrammaticCase.GENITIVE,        "полной обнажёнки"),
                            Pair(GrammaticCase.DATIVE,          "полной обнажёнке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "полную обнажёнку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "полной обнажёнкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "полной обнажёнке")
                    )
            ),
            WhiteCard(
                    id = 125,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "купание красного хуя"),
                            Pair(GrammaticCase.GENITIVE,        "купания красного хуя"),
                            Pair(GrammaticCase.DATIVE,          "купанию красного хуя"),
                            Pair(GrammaticCase.ACCUSATIVE,      "купание красного хуя"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "купанием красного хуя"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "купании красного хуя")
                    )
            ),
            WhiteCard(
                    id = 126,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "твистер"),
                            Pair(GrammaticCase.GENITIVE,        "твистера"),
                            Pair(GrammaticCase.DATIVE,          "твистеру"),
                            Pair(GrammaticCase.ACCUSATIVE,      "твистер"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "твистером"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "твистере")
                    )
            ),
            WhiteCard(
                    id = 127,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Майкл Джексон"),
                            Pair(GrammaticCase.GENITIVE,        "Майкла Джексона"),
                            Pair(GrammaticCase.DATIVE,          "Майклу Джексону"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Майкла Джексона"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Майклом Джексоном"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Майкле Джексоне")
                    )
            ),
            WhiteCard(
                    id = 128,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "командная игра"),
                            Pair(GrammaticCase.GENITIVE,        "командной игры"),
                            Pair(GrammaticCase.DATIVE,          "командной игре"),
                            Pair(GrammaticCase.ACCUSATIVE,      "командную игру"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "командной игрой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "командной игре")
                    )
            ),
            WhiteCard(
                    id = 129,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Гарри Поттер и Орден Пениса"),
                            Pair(GrammaticCase.GENITIVE,        "Гарри Поттера и Ордена Пениса"),
                            Pair(GrammaticCase.DATIVE,          "Гарри Поттеру и Ордену Пениса"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Гарри Поттера и Орден Пениса"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Гарри Поттером и Орденом Пениса"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Гарри Поттере и Ордене Пениса")
                    )
            ),
            WhiteCard(
                    id = 130,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "типичная мексиканская кухня"),
                            Pair(GrammaticCase.GENITIVE,        "типичной мексиканской кухни"),
                            Pair(GrammaticCase.DATIVE,          "типичной мексиканской кухне"),
                            Pair(GrammaticCase.ACCUSATIVE,      "типичную мексиканскую кухню"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "типичной мексиканской кухней"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "типичной мексиканской кухне")
                    )
            ),
            // 131 - секс-чат. Заменю на Чатрулет
            WhiteCard(
                    id = 131,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Чатрулет"),
                            Pair(GrammaticCase.GENITIVE,        "Чатрулета"),
                            Pair(GrammaticCase.DATIVE,          "Чатрулету"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Чатрулет"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Чатрулетом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Чатрулете")
                    )
            ),
            WhiteCard(
                    id = 132,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "бабуля"),
                            Pair(GrammaticCase.GENITIVE,        "бабули"),
                            Pair(GrammaticCase.DATIVE,          "бабуле"),
                            Pair(GrammaticCase.ACCUSATIVE,      "бабулю"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "бабулей"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "бабуле")
                    )
            ),
            WhiteCard(
                    id = 133,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "осталые страны"),
                            Pair(GrammaticCase.GENITIVE,        "осталых стран"),
                            Pair(GrammaticCase.DATIVE,          "осталым странам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "осталые страны"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "осталыми странами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "осталых странах")
                    )
            ),
            // 134 - лизать вещи, чтобы они становились твоими
            WhiteCard(
                    id = 135,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Чингисхан"),
                            Pair(GrammaticCase.GENITIVE,        "Чингисхана"),
                            Pair(GrammaticCase.DATIVE,          "Чингисхану"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Чингисхана"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Чингисханом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Чингисхане")
                    )
            ),
            WhiteCard(
                    id = 136,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Мексиканские гастарбайтеры"),
                            Pair(GrammaticCase.GENITIVE,        "Мексиканских гастарбайтеров"),
                            Pair(GrammaticCase.DATIVE,          "Мексиканским гастарбайтерам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Мексиканских гастарбайтеров"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Мексиканскими гастарбайтерами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Мексиканских гастарбайтерах")
                    )
            ),
            WhiteCard(
                    id = 137,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Робокоп"),
                            Pair(GrammaticCase.GENITIVE,        "Робокопа"),
                            Pair(GrammaticCase.DATIVE,          "Робокопу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Робокопа"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Робокопом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Робокопе")
                    )
            ),
            WhiteCard(
                    id = 138,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мытьё пупка"),
                            Pair(GrammaticCase.GENITIVE,        "мытьё пупка"),
                            Pair(GrammaticCase.DATIVE,          "мытью пупка"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мытьё пупка"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мытьём пупка"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мытье пупка")
                    )
            ),
            WhiteCard(
                    id = 139,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "порно-звёзды"),
                            Pair(GrammaticCase.GENITIVE,        "порно-звёзд"),
                            Pair(GrammaticCase.DATIVE,          "порно-звёздам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "порно-звёзд"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "порно-звёздами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "порно-звёздах")
                    )
            ),
            // 140 - Закон и порядок. Склонения и грамматика будут двусмысленными
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
                    cases = arrayListOf(GrammaticCase.INSTRUMENTAL)
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