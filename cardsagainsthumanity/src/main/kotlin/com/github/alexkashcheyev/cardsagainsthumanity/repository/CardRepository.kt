package com.github.alexkashcheyev.cardsagainsthumanity.repository

import com.github.alexkashcheyev.cardsagainsthumanity.model.BlackCard
import com.github.alexkashcheyev.cardsagainsthumanity.model.GrammaticCase
import com.github.alexkashcheyev.cardsagainsthumanity.model.WhiteCard
import org.springframework.stereotype.Repository

@Repository
class CardRepository(): ICardRepository {

    private val whiteCards = listOf(
            WhiteCard(
                    id = 1,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ведро рыбьих голов"),
                            Pair(GrammaticCase.GENITIVE,        "ведра рыбьих голов"),
                            Pair(GrammaticCase.DATIVE,          "ведру рыбьих голов"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ведро рыбьих голов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ведром рыбьих голов"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ведре рыбьих голов")
                    )
            ),
            WhiteCard(
                    id = 2,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "тишина"),
                            Pair(GrammaticCase.GENITIVE,        "тишины"),
                            Pair(GrammaticCase.DATIVE,          "тишине"),
                            Pair(GrammaticCase.ACCUSATIVE,      "тишину"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "тишиной"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "тишине")
                    )
            ),
            WhiteCard(
                    id = 3,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "фестиваль колбасы"),
                            Pair(GrammaticCase.GENITIVE,        "фестиваля колбасы"),
                            Pair(GrammaticCase.DATIVE,          "фестивалю колбасы"),
                            Pair(GrammaticCase.ACCUSATIVE,      "фестиваль колбасы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "фестивалем колбасы"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "фестивале колбасы")
                    )
            ),
            WhiteCard(
                    id = 4,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "голод"),
                            Pair(GrammaticCase.GENITIVE,        "голода"),
                            Pair(GrammaticCase.DATIVE,          "голоду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "голод"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "голодом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "голоде")
                    )
            ),
            WhiteCard(
                    id = 5,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "плотоядная бактерия"),
                            Pair(GrammaticCase.GENITIVE,        "плотоядной бактерии"),
                            Pair(GrammaticCase.DATIVE,          "плотоядной бактерии"),
                            Pair(GrammaticCase.ACCUSATIVE,      "плотоядную бактерию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "плотоядной бактерией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "плотоядной бактерии")
                    )
            ),
            // летающие змеи в совокуплении
            WhiteCard(
                    id = 6,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "совокупляющиеся летающие змеи"),
                            Pair(GrammaticCase.GENITIVE,        "совокупляющихся летающих змей"),
                            Pair(GrammaticCase.DATIVE,          "совокупляющимся летающим змеям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "совокупляющихся летающих змей"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "совокупляющимися летающими змеями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "совокупляющихся летающих змеях")
                    )
            ),
            WhiteCard(
                    id = 7,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "проблемы стран Первого мира"),
                            Pair(GrammaticCase.GENITIVE,        "проблем стран Первого мира"),
                            Pair(GrammaticCase.DATIVE,          "проблемам стран Первого мира"),
                            Pair(GrammaticCase.ACCUSATIVE,      "проблемы стран Первого мира"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "проблемами стран Первого мира"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "проблемах стран Первого мира")
                    )
            ),
            WhiteCard(
                    id = 8,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "эротическая переписка"),
                            Pair(GrammaticCase.GENITIVE,        "эротической переписки"),
                            Pair(GrammaticCase.DATIVE,          "эротической переписке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "эротическую переписку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "эротической перепиской"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "эротической переписке")
                    )
            ),
            WhiteCard(
                    id = 9,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "группа «Звери»"),
                            Pair(GrammaticCase.GENITIVE,        "группы «Звери»"),
                            Pair(GrammaticCase.DATIVE,          "группе «Звери»"),
                            Pair(GrammaticCase.ACCUSATIVE,      "группу «Звери»"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "группой «Звери»"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "группе «Звери»")
                    )
            ),
            WhiteCard(
                    id = 10,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "порнозвёзды"),
                            Pair(GrammaticCase.GENITIVE,        "порнозвёзд"),
                            Pair(GrammaticCase.DATIVE,          "порнозвёздам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "порнозвёзд"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "порнозвёздами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "порнозвёздах")
                    )
            ),
            WhiteCard(
                    id = 11,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "72 девственницы"),
                            Pair(GrammaticCase.GENITIVE,        "72 девственниц"),
                            Pair(GrammaticCase.DATIVE,          "72 девственницам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "72 девственниц"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "72 девственницами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "72 девственницах")
                    )
            ),
            WhiteCard(
                    id = 12,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "аудитория телестудии"),
                            Pair(GrammaticCase.GENITIVE,        "аудитории телестудии"),
                            Pair(GrammaticCase.DATIVE,          "аудитории телестудии"),
                            Pair(GrammaticCase.ACCUSATIVE,      "аудиторию телестудии"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "аудиторией телестудии"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "аудитории телестудии")
                    )
            ),
            WhiteCard(
                    id = 13,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "парадокс путешествий во времени"),
                            Pair(GrammaticCase.GENITIVE,        "парадокса путешествий во времени"),
                            Pair(GrammaticCase.DATIVE,          "парадоксу путешествий во времени"),
                            Pair(GrammaticCase.ACCUSATIVE,      "парадокс путешествий во времени"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "парадоксом путешествий во времени"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "парадоксе путешествий во времени")
                    )
            ),
            WhiteCard(
                    id = 14,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "настоящая мексиканская кухня"),
                            Pair(GrammaticCase.GENITIVE,        "настоящей мексиканской кухни"),
                            Pair(GrammaticCase.DATIVE,          "настоящей мексиканской кухне"),
                            Pair(GrammaticCase.ACCUSATIVE,      "настоящую мексиканскую кухню"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "настоящей мексиканской кухней"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "настоящей мексиканской кухне")
                    )
            ),
            WhiteCard(
                    id = 15,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "побрякушки"),
                            Pair(GrammaticCase.GENITIVE,        "побрякушек"),
                            Pair(GrammaticCase.DATIVE,          "побрякушкам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "побрякушки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "побрякушками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "побрякушках")
                    )
            ),
            WhiteCard(
                    id = 16,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "эффективные бизнес-технологии"),
                            Pair(GrammaticCase.GENITIVE,        "эффективных бизнес-технологий"),
                            Pair(GrammaticCase.DATIVE,          "эффективным бизнес-технологиям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "эффективные бизнес-технологии"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "эффективными бизнес-технологиями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "эффективных бизнес-технологиях")
                    )
            ),
            WhiteCard(
                    id = 17,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мировой долг"),
                            Pair(GrammaticCase.GENITIVE,        "мирового долга"),
                            Pair(GrammaticCase.DATIVE,          "мировому долгу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мировой долг"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мировым долгом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мировом долге")
                    )
            ),
            WhiteCard(
                    id = 18,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "отцовские проблемы"),
                            Pair(GrammaticCase.GENITIVE,        "отцовских проблем"),
                            Pair(GrammaticCase.DATIVE,          "отцовским проблемам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "отцовские проблемы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "отцовскими проблемами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "отцовских проблемах")
                    )
            ),
            WhiteCard(
                    id = 19,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "несвежее бельё"),
                            Pair(GrammaticCase.GENITIVE,        "несвежего белья"),
                            Pair(GrammaticCase.DATIVE,          "несвежему белью"),
                            Pair(GrammaticCase.ACCUSATIVE,      "несвежее бельё"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "несвежим бельём"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "несвежем белье")
                    )
            ),
            // катаниЯ на люстре, с которой свисают твои враги
            WhiteCard(
                    id = 20,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "катание на люстре, с которой свисают твои враги"),
                            Pair(GrammaticCase.GENITIVE,        "катания на люстре, с которой свисают твои враги"),
                            Pair(GrammaticCase.DATIVE,          "катанию на люстре, с которой свисают твои враги"),
                            Pair(GrammaticCase.ACCUSATIVE,      "катание на люстре, с которой свисают твои враги"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "катанием на люстре, с которой свисают твои враги"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "катании на люстре, с которой свисают твои враги")
                    )
            ),



            WhiteCard(
                    id = 21,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "бывший президент США Джордж Буш младший"),
                            Pair(GrammaticCase.GENITIVE,        "бывшего президента США Джорджа Буша младшего"),
                            Pair(GrammaticCase.DATIVE,          "бывшему президенту США Джорджу Бушу младшему"),
                            Pair(GrammaticCase.ACCUSATIVE,      "бывшего президента США Джорджа Буша младшего"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "бывшим президентом США Джорджем Бушем младшим"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "бывшем президенте США Джордже Буше младшем")
                    )
            ),
            // полная нагота
            WhiteCard(
                    id = 22,
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
                    id = 23,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "гормональные инъекции"),
                            Pair(GrammaticCase.GENITIVE,        "гормональных инъекций"),
                            Pair(GrammaticCase.DATIVE,          "гормональным инъекциям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "гормональные инъекции"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "гормональными инъекциями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "гормональных инъекциях")
                    )
            ),
            WhiteCard(
                    id = 24,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "откладывание яиц"),
                            Pair(GrammaticCase.GENITIVE,        "откладывания яиц"),
                            Pair(GrammaticCase.DATIVE,          "откладыванию яиц"),
                            Pair(GrammaticCase.ACCUSATIVE,      "откладывание яиц"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "откладыванием яиц"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "откладывании яиц")
                    )
            ),
            WhiteCard(
                    id = 25,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "просмотр мультиков без одежды"),
                            Pair(GrammaticCase.GENITIVE,        "просмотра мультиков без одежды"),
                            Pair(GrammaticCase.DATIVE,          "просмотру мультиков без одежды"),
                            Pair(GrammaticCase.ACCUSATIVE,      "просмотр мультиков без одежды"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "просмотром мультиков без одежды"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "просмотре мультиков без одежды")
                    )
            ),
            WhiteCard(
                    id = 26,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "притворное сочуствие"),
                            Pair(GrammaticCase.GENITIVE,        "притворного сочуствия"),
                            Pair(GrammaticCase.DATIVE,          "притворному сочуствию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "притворное сочуствие"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "притворным сочуствием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "притворном сочуствии")
                    )
            ),
            WhiteCard(
                    id = 27,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "публичное высмеивание"),
                            Pair(GrammaticCase.GENITIVE,        "публичного высмеивания"),
                            Pair(GrammaticCase.DATIVE,          "публичному высмеиванию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "публичное высмеивание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "публичным высмеиванием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "публичном высмеивании")
                    )
            ),
            WhiteCard(
                    id = 28,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "нестерильные иголки"),
                            Pair(GrammaticCase.GENITIVE,        "нестерильных иголок"),
                            Pair(GrammaticCase.DATIVE,          "нестерильным иголкам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "нестерильные иголки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "нестерильными иголками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "нестерильных иголках")
                    )
            ),
            WhiteCard(
                    id = 29,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "козявки"),
                            Pair(GrammaticCase.GENITIVE,        "козявок"),
                            Pair(GrammaticCase.DATIVE,          "козявкам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "козявки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "козявками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "козявках")
                    )
            ),
            WhiteCard(
                    id = 30,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "неминуемая смерть Вселенной от перегрева"),
                            Pair(GrammaticCase.GENITIVE,        "неминуемой смерти Вселенной от перегрева"),
                            Pair(GrammaticCase.DATIVE,          "неминуемой смерти Вселенной от перегрева"),
                            Pair(GrammaticCase.ACCUSATIVE,      "неминуемую смерть Вселенной от перегрева"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "неминуемой смертью Вселенной от перегрева"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "неминуемой смерти Вселенной от перегрева")
                    )
            ),
            WhiteCard(
                    id = 31,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "чудо деторождения"),
                            Pair(GrammaticCase.GENITIVE,        "чуда деторождения"),
                            Pair(GrammaticCase.DATIVE,          "чуду деторождения"),
                            Pair(GrammaticCase.ACCUSATIVE,      "чудо деторождения"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "чудом деторождения"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "чуде деторождения")
                    )
            ),
            WhiteCard(
                    id = 32,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Red Hot Chili Peppers"),
                            Pair(GrammaticCase.GENITIVE,        "Red Hot Chili Peppers"),
                            Pair(GrammaticCase.DATIVE,          "Red Hot Chili Peppers"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Red Hot Chili Peppers"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Red Hot Chili Peppers"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Red Hot Chili Peppers")
                    )
            ),
            WhiteCard(
                    id = 33,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "эксгибиционизм"),
                            Pair(GrammaticCase.GENITIVE,        "эксгибиционизма"),
                            Pair(GrammaticCase.DATIVE,          "эксгибиционизму"),
                            Pair(GrammaticCase.ACCUSATIVE,      "эксгибиционизм"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "эксгибиционизмом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "эксгибиционизме")
                    )
            ),
            WhiteCard(
                    id = 34,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "власть богатых"),
                            Pair(GrammaticCase.GENITIVE,        "власти богатых"),
                            Pair(GrammaticCase.DATIVE,          "власти богатых"),
                            Pair(GrammaticCase.ACCUSATIVE,      "власть богатых"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "властью богатых"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "власти богатых")
                    )
            ),
            WhiteCard(
                    id = 35,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "супружеские обязанности"),
                            Pair(GrammaticCase.GENITIVE,        "супружеских обязанностей"),
                            Pair(GrammaticCase.DATIVE,          "супружеским обязанностям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "супружеские обязанности"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "супружескими обязанностями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "супружеских обязанностях")
                    )
            ),
            WhiteCard(
                    id = 36,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Рональд МакДональд"),
                            Pair(GrammaticCase.GENITIVE,        "Рональда МакДональда"),
                            Pair(GrammaticCase.DATIVE,          "Рональду МакДональду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Рональда МакДональда"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Рональдом МакДональдом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Рональде МакДональде")
                    )
            ),
            WhiteCard(
                    id = 37,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "тройной одеколон"),
                            Pair(GrammaticCase.GENITIVE,        "тройного одеколона"),
                            Pair(GrammaticCase.DATIVE,          "тройному одеколону"),
                            Pair(GrammaticCase.ACCUSATIVE,      "тройной одеколон"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "тройным одеколоном"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "тройном одеколоне")
                    )
            ),
            WhiteCard(
                    id = 38,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "кровь Христа"),
                            Pair(GrammaticCase.GENITIVE,        "крови Христа"),
                            Pair(GrammaticCase.DATIVE,          "крови Христа"),
                            Pair(GrammaticCase.ACCUSATIVE,      "кровь Христа"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "кровью Христа"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "крови Христа")
                    )
            ),
            WhiteCard(
                    id = 39,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ужасные последствия лазерной депиляции"),
                            Pair(GrammaticCase.GENITIVE,        "ужасных последствий лазерной депиляции"),
                            Pair(GrammaticCase.DATIVE,          "ужасным последствиям лазерной депиляции"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ужасные последствия лазерной депиляции"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ужасными последствиями лазерной депиляции"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ужасных последствиях лазерной депиляции")
                    )
            ),
            WhiteCard(
                    id = 40,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Бэтмен"),
                            Pair(GrammaticCase.GENITIVE,        "Бэтмена"),
                            Pair(GrammaticCase.DATIVE,          "Бэтмену"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Бэтмена"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Бэтменом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Бэтмене")
                    )
            ),


            WhiteCard(
                    id = 41,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сельское хозяйство"),
                            Pair(GrammaticCase.GENITIVE,        "сельского хозяйства"),
                            Pair(GrammaticCase.DATIVE,          "сельскому хозяйству"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сельское хозяйство"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сельским хозяйством"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сельском хозяйстве")
                    )
            ),
            WhiteCard(
                    id = 42,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "энергичный монголоид"),
                            Pair(GrammaticCase.GENITIVE,        "энергичного монголоида"),
                            Pair(GrammaticCase.DATIVE,          "энергичному монголоиду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "энергичного монголоида"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "энергичным монголоидом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "энергичном монголоиде")
                    )
            ),
            WhiteCard(
                    id = 43,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "естественный отбор"),
                            Pair(GrammaticCase.GENITIVE,        "естественного отбора"),
                            Pair(GrammaticCase.DATIVE,          "естественному отбору"),
                            Pair(GrammaticCase.ACCUSATIVE,      "естественный отбор"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "естественным отбором"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "естественном отборе")
                    )
            ),
            WhiteCard(
                    id = 44,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "аборт в домашних условиях"),
                            Pair(GrammaticCase.GENITIVE,        "аборта в домашних условиях"),
                            Pair(GrammaticCase.DATIVE,          "аборту в домашних условиях"),
                            Pair(GrammaticCase.ACCUSATIVE,      "аборт в домашних условиях"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "абортом в домашних условиях"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "аборте в домашних условиях")
                    )
            ),
            WhiteCard(
                    id = 45,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "поедание печенек для благотворительного аукциона"),
                            Pair(GrammaticCase.GENITIVE,        "поедания печенек для благотворительного аукциона"),
                            Pair(GrammaticCase.DATIVE,          "поеданию печенек для благотворительного аукциона"),
                            Pair(GrammaticCase.ACCUSATIVE,      "поедание печенек для благотворительного аукциона"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "поеданием печенек для благотворительного аукциона"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "поедании печенек для благотворительного аукциона")
                    )
            ),
            WhiteCard(
                    id = 46,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "руки Мишель Обамы"),
                            Pair(GrammaticCase.GENITIVE,        "рук Мишель Обамы"),
                            Pair(GrammaticCase.DATIVE,          "рукам Мишель Обамы"),
                            Pair(GrammaticCase.ACCUSATIVE,      "руки Мишель Обамы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "руками Мишель Обамы"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "руках Мишель Обамы")
                    )
            ),
            // воркрафт
            WhiteCard(
                    id = 47,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Warcraft"),
                            Pair(GrammaticCase.GENITIVE,        "Warcraft"),
                            Pair(GrammaticCase.DATIVE,          "Warcraft"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Warcraft"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Warcraft"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Warcraft")
                    )
            ),
            WhiteCard(
                    id = 48,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "соблазн"),
                            Pair(GrammaticCase.GENITIVE,        "соблазна"),
                            Pair(GrammaticCase.DATIVE,          "соблазну"),
                            Pair(GrammaticCase.ACCUSATIVE,      "соблазн"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "соблазном"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "соблазне")
                    )
            ),
            WhiteCard(
                    id = 49,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ожирение"),
                            Pair(GrammaticCase.GENITIVE,        "ожирения"),
                            Pair(GrammaticCase.DATIVE,          "ожирению"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ожирение"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ожирением"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ожирении")
                    )
            ),
            WhiteCard(
                    id = 50,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "гомоэротическая нарезка волейбольных матчей"),
                            Pair(GrammaticCase.GENITIVE,        "гомоэротической нарезки волейбольных матчей"),
                            Pair(GrammaticCase.DATIVE,          "гомоэротической нарезке волейбольных матчей"),
                            Pair(GrammaticCase.ACCUSATIVE,      "гомоэротическую нарезку волейбольных матчей"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "гомоэротической нарезкой волейбольных матчей"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "гомоэротической нарезке волейбольных матчей")
                    )
            ),
            WhiteCard(
                    id = 51,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сцепленная челюсть"),
                            Pair(GrammaticCase.GENITIVE,        "сцепленной челюсти"),
                            Pair(GrammaticCase.DATIVE,          "сцепленной челюсти"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сцепленную челюсть"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сцепленной челюстью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сцепленной челюсти")
                    )
            ),
            WhiteCard(
                    id = 52,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "публичное спаривание"),
                            Pair(GrammaticCase.GENITIVE,        "публичного спаривания"),
                            Pair(GrammaticCase.DATIVE,          "публичному спариванию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "публичное спаривание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "публичным спариванием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "публичном спаривании")
                    )
            ),
            // набухшие яйца
            WhiteCard(
                    id = 53,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "набухание яичек"),
                            Pair(GrammaticCase.GENITIVE,        "набухания яичек"),
                            Pair(GrammaticCase.DATIVE,          "набуханию яичек"),
                            Pair(GrammaticCase.ACCUSATIVE,      "набухание яичек"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "набуханием яичек"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "набухании яичек")
                    )
            ),
            WhiteCard(
                    id = 54,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "безлимитный фуршет"),
                            Pair(GrammaticCase.GENITIVE,        "безлимитного фуршета"),
                            Pair(GrammaticCase.DATIVE,          "безлимитному фуршету"),
                            Pair(GrammaticCase.ACCUSATIVE,      "безлимитный фуршет"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "безлимитным фуршетом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "безлимитном фуршете")
                    )
            ),
            WhiteCard(
                    id = 55,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сладкая пицца на десерт"),
                            Pair(GrammaticCase.GENITIVE,        "сладкой пиццы на десерт"),
                            Pair(GrammaticCase.DATIVE,          "сладкой пицце на десерт"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сладкую пиццу на десерт"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сладкой пиццей на десерт"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сладкой пицце на десерт")
                    )
            ),
            WhiteCard(
                    id = 56,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Тимати"),
                            Pair(GrammaticCase.GENITIVE,        "Тимати"),
                            Pair(GrammaticCase.DATIVE,          "Тимати"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Тимати"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Тимати"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Тимати")
                    )
            ),
            WhiteCard(
                    id = 57,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "плавленый сыр"),
                            Pair(GrammaticCase.GENITIVE,        "плавленого сыра"),
                            Pair(GrammaticCase.DATIVE,          "плавленому сыру"),
                            Pair(GrammaticCase.ACCUSATIVE,      "плавленый сыр"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "плавленым сыром"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "плавленом сыре")
                    )
            ),
            WhiteCard(
                    id = 58,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "атака динозавров"),
                            Pair(GrammaticCase.GENITIVE,        "атаки динозавров"),
                            Pair(GrammaticCase.DATIVE,          "атаке динозавров"),
                            Pair(GrammaticCase.ACCUSATIVE,      "атаку динозавров"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "атакой динозавров"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "атаке динозавров")
                    )
            ),
            WhiteCard(
                    id = 59,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "раздевание"),
                            Pair(GrammaticCase.GENITIVE,        "раздевания"),
                            Pair(GrammaticCase.DATIVE,          "раздеванию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "раздевание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "раздеванием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "раздевании")
                    )
            ),
            WhiteCard(
                    id = 60,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "смегма"),
                            Pair(GrammaticCase.GENITIVE,        "смегмы"),
                            Pair(GrammaticCase.DATIVE,          "смегме"),
                            Pair(GrammaticCase.ACCUSATIVE,      "смегму"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "смегмой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "смегме")
                    )
            ),



            WhiteCard(
                    id = 61,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "алкоголизм"),
                            Pair(GrammaticCase.GENITIVE,        "алкоголизма"),
                            Pair(GrammaticCase.DATIVE,          "алкоголизму"),
                            Pair(GrammaticCase.ACCUSATIVE,      "алкоголизм"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "алкоголизмом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "алкоголизме")
                    )
            ),
            WhiteCard(
                    id = 62,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мужчина средних лет на роликах"),
                            Pair(GrammaticCase.GENITIVE,        "мужчины средних лет на роликах"),
                            Pair(GrammaticCase.DATIVE,          "мужчине средних лет на роликах"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мужчину средних лет на роликах"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мужчиной средних лет на роликах"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мужчине средних лет на роликах")
                    )
            ),
            WhiteCard(
                    id = 63,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "трогательный взгляд плюшевого мишки"),
                            Pair(GrammaticCase.GENITIVE,        "трогательного взгляда плюшевого мишки"),
                            Pair(GrammaticCase.DATIVE,          "трогательному взгляду плюшевого мишки"),
                            Pair(GrammaticCase.ACCUSATIVE,      "трогательный взгляд плюшевого мишки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "трогательным взглядом плюшевого мишки"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "трогательном взгляде плюшевого мишки")
                    )
            ),
            WhiteCard(
                    id = 64,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "психогенное переедание"),
                            Pair(GrammaticCase.GENITIVE,        "психогенного переедания"),
                            Pair(GrammaticCase.DATIVE,          "психогенному перееданию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "психогенное переедание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "психогенным перееданием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "психогенном переедании")
                    )
            ),
            WhiteCard(
                    id = 65,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "гигантская карамелька"),
                            Pair(GrammaticCase.GENITIVE,        "гигантской карамельки"),
                            Pair(GrammaticCase.DATIVE,          "гигантской карамелькой"),
                            Pair(GrammaticCase.ACCUSATIVE,      "гигантскую карамельку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "гигантской карамелькой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "гигантской карамельке")
                    )
            ),
            WhiteCard(
                    id = 66,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "самобичевание"),
                            Pair(GrammaticCase.GENITIVE,        "самобичевания"),
                            Pair(GrammaticCase.DATIVE,          "самобичеванию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "самобичевание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "самобичеванием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "самобичевании")
                    )
            ),
            WhiteCard(
                    id = 67,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "дети на поводках"),
                            Pair(GrammaticCase.GENITIVE,        "детей на поводках"),
                            Pair(GrammaticCase.DATIVE,          "детям на поводках"),
                            Pair(GrammaticCase.ACCUSATIVE,      "детей на поводках"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "детьми на поводках"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "детях на поводках")
                    )
            ),
            WhiteCard(
                    id = 68,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "короткая прелюдия"),
                            Pair(GrammaticCase.GENITIVE,        "короткой прелюдии"),
                            Pair(GrammaticCase.DATIVE,          "короткой прелюдии"),
                            Pair(GrammaticCase.ACCUSATIVE,      "короткую прелюдию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "короткой прелюдией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "короткой прелюдии")
                    )
            ),
            // Святая Библия
            WhiteCard(
                    id = 69,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Библия"),
                            Pair(GrammaticCase.GENITIVE,        "Библии"),
                            Pair(GrammaticCase.DATIVE,          "Библии"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Библию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Библией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Библии")
                    )
            ),
            WhiteCard(
                    id = 70, // такого я еще не видел
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "немецкая тюремная порнушка"),
                            Pair(GrammaticCase.GENITIVE,        "немецкой тюремной порнушки"),
                            Pair(GrammaticCase.DATIVE,          "немецкой тюремной порнушке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "немецкую тюремную порнушку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "немецкой тюремной порнушкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "немецкой тюремной порнушке")
                    )
            ),
            WhiteCard(
                    id = 71,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пожар"),
                            Pair(GrammaticCase.GENITIVE,        "пожара"),
                            Pair(GrammaticCase.DATIVE,          "пожару"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пожар"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пожаром"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пожаре")
                    )
            ),
            WhiteCard(
                    id = 72,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "подростковая беременность"),
                            Pair(GrammaticCase.GENITIVE,        "подростковой беременности"),
                            Pair(GrammaticCase.DATIVE,          "подростковой беременности"),
                            Pair(GrammaticCase.ACCUSATIVE,      "подростковую беременность"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "подростковой беременностью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "подростковой беременности")
                    )
            ),
            WhiteCard(
                    id = 73,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Ганди"),
                            Pair(GrammaticCase.GENITIVE,        "Ганди"),
                            Pair(GrammaticCase.DATIVE,          "Ганди"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Ганди"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Ганди"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Ганди")
                    )
            ),
            WhiteCard(
                    id = 74,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "позорное голосовое сообщение"),
                            Pair(GrammaticCase.GENITIVE,        "позорного голосового сообщения"),
                            Pair(GrammaticCase.DATIVE,          "позорному голосовому сообщению"),
                            Pair(GrammaticCase.ACCUSATIVE,      "позорное голосовое сообщение"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "позорным голосовым сообщением"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "позорном голосовом сообщении")
                    )
            ),
            WhiteCard(
                    id = 75,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "подзатыльник"),
                            Pair(GrammaticCase.GENITIVE,        "подзатыльника"),
                            Pair(GrammaticCase.DATIVE,          "подзатыльнику"),
                            Pair(GrammaticCase.ACCUSATIVE,      "подзатыльник"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "подзатыльником"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "подзатыльнике")
                    )
            ),
            WhiteCard(
                    id = 76,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пирамида из черепов"),
                            Pair(GrammaticCase.GENITIVE,        "пирамиды из черепов"),
                            Pair(GrammaticCase.DATIVE,          "пирамиде из черепов"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пирамиду из черепов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пирамидой из черепов"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пирамиде из черепов")
                    )
            ),
            WhiteCard(
                    id = 77,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "четырёхчасовая эрекция"),
                            Pair(GrammaticCase.GENITIVE,        "четырёхчасовой эрекции"),
                            Pair(GrammaticCase.DATIVE,          "четырёхчасовой эрекции"),
                            Pair(GrammaticCase.ACCUSATIVE,      "четырёхчасовую эрекцию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "четырёхчасовой эрекцией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "четырёхчасовой эрекции")
                    )
            ),
            WhiteCard(
                    id = 78,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мои гениталии"),
                            Pair(GrammaticCase.GENITIVE,        "моих гениталий"),
                            Pair(GrammaticCase.DATIVE,          "моим гениталиям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мои гениталии"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "моими гениталиями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "моих гениталиях")
                    )
            ),
            WhiteCard(
                    id = 79,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "знакомства в отделении абортов"),
                            Pair(GrammaticCase.GENITIVE,        "знакомств в отделении абортов"),
                            Pair(GrammaticCase.DATIVE,          "знакомствам в отделении абортов"),
                            Pair(GrammaticCase.ACCUSATIVE,      "знакомства в отделении абортов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "знакомствами в отделении абортов"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "знакомствах в отделении абортов")
                    )
            ),
            WhiteCard(
                    id = 80,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "наука"),
                            Pair(GrammaticCase.GENITIVE,        "науки"),
                            Pair(GrammaticCase.DATIVE,          "науке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "науку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "наукой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "науке")
                    )
            ),



            WhiteCard(
                    id = 81,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "безответный оральный секс"),
                            Pair(GrammaticCase.GENITIVE,        "безответного орального секса"),
                            Pair(GrammaticCase.DATIVE,          "безответному оральному сексу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "безответный оральный секс"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "безответным оральным сексом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "безответном оральном сексе")
                    )
            ),
            WhiteCard(
                    id = 82,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "бескрылые птицы"),
                            Pair(GrammaticCase.GENITIVE,        "бескрылых птиц"),
                            Pair(GrammaticCase.DATIVE,          "бескрылым птицам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "бескрылых птиц"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "бескрылыми птицами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "бескрылых птицах")
                    )
            ),
            WhiteCard(
                    id = 83,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "хорошая затяжка"),
                            Pair(GrammaticCase.GENITIVE,        "хорошей затяжки"),
                            Pair(GrammaticCase.DATIVE,          "хорошей затяжке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "хорошую затяжку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "хорошей затяжкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "хорошей затяжке")
                    )
            ),
            WhiteCard(
                    id = 84,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "высоковольтный разряд на соски́"),
                            Pair(GrammaticCase.GENITIVE,        "высоковольтного разряда на соски́"),
                            Pair(GrammaticCase.DATIVE,          "высоковольтному разряду на соски́"),
                            Pair(GrammaticCase.ACCUSATIVE,      "высоковольтный разряд на соски́"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "высоковольтным разрядом на соски́"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "высоковольтном разряде на соски́")
                    )
            ),
            WhiteCard(
                    id = 85,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сбалансированный завтрак"),
                            Pair(GrammaticCase.GENITIVE,        "сбалансированного завтрака"),
                            Pair(GrammaticCase.DATIVE,          "сбалансированному завтраку"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сбалансированный завтрак"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сбалансированным завтраком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сбалансированном завтраке")
                    )
            ),
            WhiteCard(
                    id = 86,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "военная академия"),
                            Pair(GrammaticCase.GENITIVE,        "военной академии"),
                            Pair(GrammaticCase.DATIVE,          "военной академии"),
                            Pair(GrammaticCase.ACCUSATIVE,      "военную академию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "военной академией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "военной академии")
                    )
            ),
            WhiteCard(
                    id = 87,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "конфета, отобранная у ребёнка"),
                            Pair(GrammaticCase.GENITIVE,        "конфеты, отобранной у ребёнка"),
                            Pair(GrammaticCase.DATIVE,          "конфете, отобранной у ребёнка"),
                            Pair(GrammaticCase.ACCUSATIVE,      "конфету, отобранную у ребёнка"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "конфетой, отобранной у ребёнка"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "конфете, отобранной у ребёнка")
                    )
            ),
            WhiteCard(
                    id = 88,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Международный благотворительный фонд"),
                            Pair(GrammaticCase.GENITIVE,        "Международного благотворительного фонда"),
                            Pair(GrammaticCase.DATIVE,          "Международному благотворительному фонду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Международный благотворительный фонд"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Международным благотворительным фондом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Международном благотворительном фонде")
                    )
            ),
            WhiteCard(
                    id = 89,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "племя воительниц"),
                            Pair(GrammaticCase.GENITIVE,        "племени воительниц"),
                            Pair(GrammaticCase.DATIVE,          "племени воительниц"),
                            Pair(GrammaticCase.ACCUSATIVE,      "племя воительниц"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "племенем воительниц"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "племени воительниц")
                    )
            ),
            WhiteCard(
                    id = 90,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пассивно-агрессивные записки"),
                            Pair(GrammaticCase.GENITIVE,        "пассивно-агрессивных записок"),
                            Pair(GrammaticCase.DATIVE,          "пассивно-агрессивным запискам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пассивно-агрессивные записки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пассивно-агрессивными записками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пассивно-агрессивных записках")
                    )
            ),
            WhiteCard(
                    id = 91,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "команда китайских гимнастов"),
                            Pair(GrammaticCase.GENITIVE,        "команды китайских гимнастов"),
                            Pair(GrammaticCase.DATIVE,          "команде китайских гимнастов"),
                            Pair(GrammaticCase.ACCUSATIVE,      "команду китайских гимнастов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "командой китайских гимнастов"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "команде китайских гимнастов")
                    )
            ),
            WhiteCard(
                    id = 92,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "смена страховой компании"),
                            Pair(GrammaticCase.GENITIVE,        "смены страховой компании"),
                            Pair(GrammaticCase.DATIVE,          "смене страховой компании"),
                            Pair(GrammaticCase.ACCUSATIVE,      "смену страховой компании"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сменой страховой компании"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "смене страховой компании")
                    )
            ),
            WhiteCard(
                    id = 93,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "неконтролиуемое мочеиспускание"),
                            Pair(GrammaticCase.GENITIVE,        "неконтролиуемого мочеиспускания"),
                            Pair(GrammaticCase.DATIVE,          "неконтролиуемому мочеиспусканию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "неконтролиуемое мочеиспускание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "неконтролиуемым мочеиспусканием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "неконтролиуемом мочеиспускании")
                    )
            ),
            // про доширак было ни слова
            WhiteCard(
                    id = 94,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "запись домашнего видео Тины Канделаки, пожирающей Доширак (Мiвiну)"),
                            Pair(GrammaticCase.GENITIVE,        "записи домашнего видео Тины Канделаки, пожирающей Доширак (Мiвiну)"),
                            Pair(GrammaticCase.DATIVE,          "записи домашнего видео Тины Канделаки, пожирающей Доширак (Мiвiну)"),
                            Pair(GrammaticCase.ACCUSATIVE,      "запись домашнего видео Тины Канделаки, пожирающей Доширак (Мiвiну)"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "записью домашнего видео Тины Канделаки, пожирающей Доширак (Мiвiну)"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "записи домашнего видео Тины Канделаки, пожирающей Доширак (Мiвiну)")
                    )
            ),
            // мокрые сны - ну кто так говорит?
            WhiteCard(
                    id = 95,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "влажные сны"),
                            Pair(GrammaticCase.GENITIVE,        "влажных снов"),
                            Pair(GrammaticCase.DATIVE,          "влажным снам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "влажные сны"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "влажными снами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "влажных снов")
                    )
            ),
            WhiteCard(
                    id = 96,
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
                    id = 97,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мои ягодицы"),
                            Pair(GrammaticCase.GENITIVE,        "моих ягодиц"),
                            Pair(GrammaticCase.DATIVE,          "моим ягодицам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мои ягодицы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "моими ягодицами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "моих ягодицах")
                    )
            ),
            WhiteCard(
                    id = 98,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "упругие бёдра"),
                            Pair(GrammaticCase.GENITIVE,        "упругих бёдер"),
                            Pair(GrammaticCase.DATIVE,          "упругим бёдрам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "упругие бёдра"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "упругими бёдрами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "упругих бёдрах")
                    )
            ),
            WhiteCard(
                    id = 99,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "заигрывание со старичками"),
                            Pair(GrammaticCase.GENITIVE,        "заигрывания со старичками"),
                            Pair(GrammaticCase.DATIVE,          "заигрыванию со старичками"),
                            Pair(GrammaticCase.ACCUSATIVE,      "заигрывание со старичками"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "заигрыванием со старичками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "заигрывании со старичками")
                    )
            ),
            WhiteCard(
                    id = 100,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Мистер Проппер у меня на кухне"),
                            Pair(GrammaticCase.GENITIVE,        "Мистера Проппера у меня на кухне"),
                            Pair(GrammaticCase.DATIVE,          "Мистеру Пропперу у меня на кухне"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Мистера Проппера у меня на кухне"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Мистером Проппером у меня на кухне"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Мистере Проппере у меня на кухне")
                    )
            ),
            // нежное поглаживание внутреннего бедра. надо было самому с английского переводить
            // хочешь, чтобы что-то было хорошо сделано? - сделай это сам.
            WhiteCard(
                    id = 101,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "нежное поглаживание внутренней стороны бедра"),
                            Pair(GrammaticCase.GENITIVE,        "нежного поглаживания внутренней стороны бедра"),
                            Pair(GrammaticCase.DATIVE,          "нежному поглаживанию внутренней стороны бедра"),
                            Pair(GrammaticCase.ACCUSATIVE,      "нежное поглаживание внутренней стороны бедра"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "нежным поглаживанием внутренней стороны бедра"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "нежном поглаживании внутренней стороны бедра")
                    )
            ),
            WhiteCard(
                    id = 102,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сексуальное напряжение"),
                            Pair(GrammaticCase.GENITIVE,        "сексуального напряжения"),
                            Pair(GrammaticCase.DATIVE,          "сексуальному напряжению"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сексуальное напряжение"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сексуальным напряжением"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сексуальном напряжении")
                    )
            ),
            WhiteCard(
                    id = 103,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "винтовка М16"),
                            Pair(GrammaticCase.GENITIVE,        "винтовки М16"),
                            Pair(GrammaticCase.DATIVE,          "винтовке М16"),
                            Pair(GrammaticCase.ACCUSATIVE,      "винтовку М16"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "винтовкой М16"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "винтовке М16")
                    )
            ),
            WhiteCard(
                    id = 104,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "повелитель Вселенной"),
                            Pair(GrammaticCase.GENITIVE,        "повелителя Вселенной"),
                            Pair(GrammaticCase.DATIVE,          "повелителю Вселенной"),
                            Pair(GrammaticCase.ACCUSATIVE,      "повелителя Вселенной"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "повелителем Вселенной"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "повелителе Вселенной")
                    )
            ),
            WhiteCard(
                    id = 105,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "кошачий корм"),
                            Pair(GrammaticCase.GENITIVE,        "кошачьего корма"),
                            Pair(GrammaticCase.DATIVE,          "кошачьему корм"),
                            Pair(GrammaticCase.ACCUSATIVE,      "кошачий корм"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "кошачьим корм"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "кошачьем корм")
                    )
            ),
            WhiteCard(
                    id = 106,
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
                    id = 107,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сладкая месть"),
                            Pair(GrammaticCase.GENITIVE,        "сладкой мести"),
                            Pair(GrammaticCase.DATIVE,          "сладкой мести"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сладкую месть"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сладкой местью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сладкой мести")
                    )
            ),
            WhiteCard(
                    id = 108,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "коммунисты"),
                            Pair(GrammaticCase.GENITIVE,        "коммунистов"),
                            Pair(GrammaticCase.DATIVE,          "коммунистам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "коммунистов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "коммунистами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "коммунистах")
                    )
            ),
            WhiteCard(
                    id = 109,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пукающая антилопа"),
                            Pair(GrammaticCase.GENITIVE,        "пукающей антилопы"),
                            Pair(GrammaticCase.DATIVE,          "пукающей антилопе"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пукающую антилопу"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пукающей антилопой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пукающей антилопе")
                    )
            ),
            WhiteCard(
                    id = 110,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Натали Портман"),
                            Pair(GrammaticCase.GENITIVE,        "Натали Портман"),
                            Pair(GrammaticCase.DATIVE,          "Натали Портман"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Натали Портман"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Натали Портман"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Натали Портман")
                    )
            ),
            WhiteCard(
                    id = 111,
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
                    id = 112,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Шон Коннери"),
                            Pair(GrammaticCase.GENITIVE,        "Шона Коннери"),
                            Pair(GrammaticCase.DATIVE,          "Шону Коннери"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Шона Коннери"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Шоном Коннери"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Шоне Коннери")
                    )
            ),
            WhiteCard(
                    id = 113,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "гомосексуальная повестка дня"),
                            Pair(GrammaticCase.GENITIVE,        "гомосексуальной повестки дня"),
                            Pair(GrammaticCase.DATIVE,          "гомосексуальной повестке дня"),
                            Pair(GrammaticCase.ACCUSATIVE,      "гомосексуальную повестку дня"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "гомосексуальной повесткой дня"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "гомосексуальной повестке дня")
                    )
            ),
            WhiteCard(
                    id = 114,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мексиканец-трудоголик"),
                            Pair(GrammaticCase.GENITIVE,        "мексиканца-трудоголика"),
                            Pair(GrammaticCase.DATIVE,          "мексиканцу-трудоголику"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мексиканца-трудоголика"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мексиканцем-трудоголиком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мексиканце-трудоголике")
                    )
            ),
            WhiteCard(
                    id = 115,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ястреб в кепке"),
                            Pair(GrammaticCase.GENITIVE,        "ястреба в кепке"),
                            Pair(GrammaticCase.DATIVE,          "ястребу в кепке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ястреба в кепке"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ястребом в кепке"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ястребе в кепке")
                    )
            ),
            WhiteCard(
                    id = 116,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мальчики из церковного хора"),
                            Pair(GrammaticCase.GENITIVE,        "мальчиков из церковного хора"),
                            Pair(GrammaticCase.DATIVE,          "мальчикам из церковного хора"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мальчиков из церковного хора"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мальчиками из церковного хора"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мальчиках из церковного хора")
                    )
            ),
            WhiteCard(
                    id = 117,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "живчик"),
                            Pair(GrammaticCase.GENITIVE,        "живчика"),
                            Pair(GrammaticCase.DATIVE,          "живчику"),
                            Pair(GrammaticCase.ACCUSATIVE,      "живчика"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "живчиком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "живчике")
                    )
            ),
            WhiteCard(
                    id = 118,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "стояк от злости"),
                            Pair(GrammaticCase.GENITIVE,        "стояка от злости"),
                            Pair(GrammaticCase.DATIVE,          "стояку от злости"),
                            Pair(GrammaticCase.ACCUSATIVE,      "стояк от злости"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "стояком от злости"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "стояке от злости")
                    )
            ),
            WhiteCard(
                    id = 119,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "бесплатные пробники"),
                            Pair(GrammaticCase.GENITIVE,        "бесплатных пробников"),
                            Pair(GrammaticCase.DATIVE,          "бесплатным пробникам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "бесплатные пробники"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "бесплатными пробниками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "бесплатных пробниках")
                    )
            ),
            WhiteCard(
                    id = 120,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "благодетель"),
                            Pair(GrammaticCase.GENITIVE,        "благодетеля"),
                            Pair(GrammaticCase.DATIVE,          "благодетелю"),
                            Pair(GrammaticCase.ACCUSATIVE,      "благодетеля"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "благодетелем"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "благодетеле")
                    )
            ),



            WhiteCard(
                    id = 121,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "закон о разделении Земли"),
                            Pair(GrammaticCase.GENITIVE,        "закона о разделении Земли"),
                            Pair(GrammaticCase.DATIVE,          "закону о разделении Земли"),
                            Pair(GrammaticCase.ACCUSATIVE,      "законе о разделении Земли"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "законом о разделении Земли"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "законе о разделении Земли")
                    )
            ),
            WhiteCard(
                    id = 122,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "лактация"),
                            Pair(GrammaticCase.GENITIVE,        "лактации"),
                            Pair(GrammaticCase.DATIVE,          "лактации"),
                            Pair(GrammaticCase.ACCUSATIVE,      "лактацию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "лактацией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "лактации")
                    )
            ),
            WhiteCard(
                    id = 123,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мир во всём мире"),
                            Pair(GrammaticCase.GENITIVE,        "мира во всём мире"),
                            Pair(GrammaticCase.DATIVE,          "миру во всём мире"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мире во всём мире"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "миром во всём мире"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мире во всём мире")
                    )
            ),
            WhiteCard(
                    id = 124,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Робокоп"),
                            Pair(GrammaticCase.GENITIVE,        "Робокопа"),
                            Pair(GrammaticCase.DATIVE,          "Робокопу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Робокопе"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Робокопом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Робокопе")
                    )
            ),
            WhiteCard(
                    id = 125,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Джастин Бибер"),
                            Pair(GrammaticCase.GENITIVE,        "Джастина Бибера"),
                            Pair(GrammaticCase.DATIVE,          "Джастину Биберу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Джастина Бибера"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Джастином Бибером"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Джастине Бибере")
                    )
            ),
            WhiteCard(
                    id = 126,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "лесные гномы"),
                            Pair(GrammaticCase.GENITIVE,        "лесных гномов"),
                            Pair(GrammaticCase.DATIVE,          "лесным гномам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "лесных гномов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "лесными гномами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "лесных гномах")
                    )
            ),
            WhiteCard(
                    id = 127,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пьяный хор"),
                            Pair(GrammaticCase.GENITIVE,        "пьяного хора"),
                            Pair(GrammaticCase.DATIVE,          "пьяному хору"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пьяный хор"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пьяным хором"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пьяном хоре")
                    )
            ),
            WhiteCard(
                    id = 128,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "половое созревание"),
                            Pair(GrammaticCase.GENITIVE,        "полового созревания"),
                            Pair(GrammaticCase.DATIVE,          "половому созреванию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "половое созревание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "половоым созреванием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "половом созревании")
                    )
            ),
            WhiteCard(
                    id = 129,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "привидения"),
                            Pair(GrammaticCase.GENITIVE,        "привидений"),
                            Pair(GrammaticCase.DATIVE,          "привидению"),
                            Pair(GrammaticCase.ACCUSATIVE,      "привидений"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "привидениями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "привидениях")
                    )
            ),
            WhiteCard(
                    id = 130,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ассиметричный массаж груди"),
                            Pair(GrammaticCase.GENITIVE,        "ассиметричного массажа груди"),
                            Pair(GrammaticCase.DATIVE,          "ассиметричному массажу груди"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ассиметричный массаж груди"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ассиметричным массажем груди"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ассиметричном массаже груди")
                    )
            ),
            WhiteCard(
                    id = 131,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "неуклюжие пляски"),
                            Pair(GrammaticCase.GENITIVE,        "неуклюжих плясок"),
                            Pair(GrammaticCase.DATIVE,          "неуклюжим пляскам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "неуклюжие пляски"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "неуклюжими плясками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "неуклюжих плясках")
                    )
            ),
            WhiteCard(
                    id = 132,
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
                    id = 133,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мягкое место Владимира Познера"),
                            Pair(GrammaticCase.GENITIVE,        "мягкого места Владимира Познера"),
                            Pair(GrammaticCase.DATIVE,          "мягкому месту Владимира Познера"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мягкое место Владимира Познера"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мягким местом Владимира Познера"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мягком месте Владимира Познера")
                    )
            ),
            WhiteCard(
                    id = 134,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Растишка"),
                            Pair(GrammaticCase.GENITIVE,        "Растишки"),
                            Pair(GrammaticCase.DATIVE,          "Растишке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Растишку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Растишкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Растишке")
                    )
            ),
            WhiteCard(
                    id = 135,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "злые менты"),
                            Pair(GrammaticCase.GENITIVE,        "злых ментов"),
                            Pair(GrammaticCase.DATIVE,          "злым ментам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "злых ментов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "злыми ментами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "злых ментах")
                    )
            ),
            WhiteCard(
                    id = 136,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "убийца Линкольна"),
                            Pair(GrammaticCase.GENITIVE,        "убийцы Линкольна"),
                            Pair(GrammaticCase.DATIVE,          "убийце Линкольна"),
                            Pair(GrammaticCase.ACCUSATIVE,      "убийцу Линкольна"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "убийцей Линкольна"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "убийце Линкольна")
                    )
            ),
            WhiteCard(
                    id = 137,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "школьники"),
                            Pair(GrammaticCase.GENITIVE,        "школьников"),
                            Pair(GrammaticCase.DATIVE,          "школьникам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "школьников"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "школьниками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "школьниках")
                    )
            ),
            WhiteCard(
                    id = 138,
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
                    id = 139,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "племена со смешными названиями"),
                            Pair(GrammaticCase.GENITIVE,        "племён со смешными названиями"),
                            Pair(GrammaticCase.DATIVE,          "племенам со смешными названиями"),
                            Pair(GrammaticCase.ACCUSATIVE,      "племена со смешными названиями"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "племенами со смешными названиями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "племенах со смешными названиями")
                    )
            ),
            WhiteCard(
                    id = 140,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Дарт Вейдер"),
                            Pair(GrammaticCase.GENITIVE,        "Дарта Вейдера"),
                            Pair(GrammaticCase.DATIVE,          "Дарту Вейдеру"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Дарта Вейдера"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Дартом Вейдером"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Дарте Вейдере")
                    )
            ),



            WhiteCard(
                    id = 141,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "неумелая мастурбация"),
                            Pair(GrammaticCase.GENITIVE,        "неумелой мастурбации"),
                            Pair(GrammaticCase.DATIVE,          "неумелой мастурбации"),
                            Pair(GrammaticCase.ACCUSATIVE,      "неумелую мастурбацию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "неумелой мастурбацией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "неумелой мастурбации")
                    )
            ),
            WhiteCard(
                    id = 142,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "именно то, что ты ожидаешь"),
                            Pair(GrammaticCase.GENITIVE,        "именно того, чего ты ожидаешь"),
                            Pair(GrammaticCase.DATIVE,          "именно тому, чему ты ожидаешь"),
                            Pair(GrammaticCase.ACCUSATIVE,      "именно то, что ты ожидаешь"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "именно тем, чем ты ожидаешь"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "именно том, чём ты ожидаешь")
                    )
            ),
            WhiteCard(
                    id = 143,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "случайная рвота вместо отрыжки"),
                            Pair(GrammaticCase.GENITIVE,        "случайной рвоты вместо отрыжки"),
                            Pair(GrammaticCase.DATIVE,          "случайной рвоте вместо отрыжки"),
                            Pair(GrammaticCase.ACCUSATIVE,      "случайную рвоту вместо отрыжки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "случайной рвотой вместо отрыжки"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "случайной рвоте вместо отрыжки")
                    )
            ),
            WhiteCard(
                    id = 144,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "демидрол"),
                            Pair(GrammaticCase.GENITIVE,        "демидрола"),
                            Pair(GrammaticCase.DATIVE,          "демидролу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "демидрол"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "демидролом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "демидроле")
                    )
            ),
            WhiteCard(
                    id = 145,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "стволовые клетки зародыша"),
                            Pair(GrammaticCase.GENITIVE,        "стволовых клеток зародыша"),
                            Pair(GrammaticCase.DATIVE,          "стволовым клеткам зародыша"),
                            Pair(GrammaticCase.ACCUSATIVE,      "стволовые клетки зародыша"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "стволовыми клетками зародыша"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "стволовых клетках зародыша")
                    )
            ),
            // сиськи, вид сбоку
            WhiteCard(
                    id = 146,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сиськи в профиль"),
                            Pair(GrammaticCase.GENITIVE,        "сисек в профиль"),
                            Pair(GrammaticCase.DATIVE,          "сиськам в профиль"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сиськи в профиль"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сиськами в профиль"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сисек в профиль")
                    )
            ),
            // секс панды
            WhiteCard(
                    id = 147,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "спаривание панд"),
                            Pair(GrammaticCase.GENITIVE,        "спаривания панд"),
                            Pair(GrammaticCase.DATIVE,          "спариванию панд"),
                            Pair(GrammaticCase.ACCUSATIVE,      "спаривание панд"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "спариванием панд"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "спаривании панд")
                    )
            ),
            WhiteCard(
                    id = 148,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "лоботомия"),
                            Pair(GrammaticCase.GENITIVE,        "лоботомия"),
                            Pair(GrammaticCase.DATIVE,          "лоботомия"),
                            Pair(GrammaticCase.ACCUSATIVE,      "лоботомия"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "лоботомия"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "лоботомия")
                    )
            ),
            WhiteCard(
                    id = 149,
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
                    id = 150,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "герпес на губе"),
                            Pair(GrammaticCase.GENITIVE,        "герпеса на губе"),
                            Pair(GrammaticCase.DATIVE,          "герпесу на губе"),
                            Pair(GrammaticCase.ACCUSATIVE,      "герпес на губе"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "герпесом на губе"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "герпесе на губе")
                    )
            ),
            WhiteCard(
                    id = 151,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "кашалоты"),
                            Pair(GrammaticCase.GENITIVE,        "кашалотов"),
                            Pair(GrammaticCase.DATIVE,          "кашалотам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "кашалотов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "кашалотами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "кашалотах")
                    )
            ),
            WhiteCard(
                    id = 152,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "бомжи"),
                            Pair(GrammaticCase.GENITIVE,        "бомжей"),
                            Pair(GrammaticCase.DATIVE,          "бомжам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "бомжей"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "бомжами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "бомжах")
                    )
            ),
            WhiteCard(
                    id = 153,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "секс на втором свидании"),
                            Pair(GrammaticCase.GENITIVE,        "секса на втором свидании"),
                            Pair(GrammaticCase.DATIVE,          "сексу на втором свидании"),
                            Pair(GrammaticCase.ACCUSATIVE,      "секс на втором свидании"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сексом на втором свидании"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сексе на втором свидании")
                    )
            ),
            WhiteCard(
                    id = 154,
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
                    id = 155,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пакман, поглощающий сперму"),
                            Pair(GrammaticCase.GENITIVE,        "пакмана, поглощающего сперму"),
                            Pair(GrammaticCase.DATIVE,          "пакману, поглощающему сперму"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пакмана, поглощающего сперму"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пакманом, поглощающим сперму"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пакмане, поглощающем сперму")
                    )
            ),
            // клоун-инфарктник
            WhiteCard(
                    id = 156,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "клоун-астматик"),
                            Pair(GrammaticCase.GENITIVE,        "клоуна-астматика"),
                            Pair(GrammaticCase.DATIVE,          "клоуну-астматику"),
                            Pair(GrammaticCase.ACCUSATIVE,      "клоуна-астматика"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "клоуном-астматиком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "клоуне-астматике")
                    )
            ),
            // Халк Хоген - не представляю, кто это такой
            WhiteCard(
                    id = 157,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Иван Охлобыстин"),
                            Pair(GrammaticCase.GENITIVE,        "Ивана Охлобыстина"),
                            Pair(GrammaticCase.DATIVE,          "Ивану Охлобыстину"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Ивана Охлобыстина"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Иваном Охлобыстиным"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Иване Охлобыстине")
                    )
            ),
            WhiteCard(
                    id = 158,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Бог"),
                            Pair(GrammaticCase.GENITIVE,        "Бога"),
                            Pair(GrammaticCase.DATIVE,          "Богу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Бога"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Богом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Боге")
                    )
            ),
            WhiteCard(
                    id = 159,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "натирание щелей"),
                            Pair(GrammaticCase.GENITIVE,        "натирания щелей"),
                            Pair(GrammaticCase.DATIVE,          "натиранию щелей"),
                            Pair(GrammaticCase.ACCUSATIVE,      "натирание щелей"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "натиранием щелей"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "натирании щелей")
                    )
            ),
            WhiteCard(
                    id = 160,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "золотой дождь"),
                            Pair(GrammaticCase.GENITIVE,        "золотого дождя"),
                            Pair(GrammaticCase.DATIVE,          "золотому дождю"),
                            Pair(GrammaticCase.ACCUSATIVE,      "золотой дождь"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "золотым дождём"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "золотом дожде")
                    )
            ),



            WhiteCard(
                    id = 161,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "эмоции"),
                            Pair(GrammaticCase.GENITIVE,        "эмоций"),
                            Pair(GrammaticCase.DATIVE,          "эмоциям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "эмоции"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "эмоциями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "эмоциях")
                    )
            ),
            // помечение предметов облизыванием
            WhiteCard(
                    id = 162,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "присвоение через облизывание"),
                            Pair(GrammaticCase.GENITIVE,        "присвоения через облизывание"),
                            Pair(GrammaticCase.DATIVE,          "присвоению через облизывание"),
                            Pair(GrammaticCase.ACCUSATIVE,      "присвоение через облизывание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "присвоением через облизывание"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "присвоении через облизывание")
                    )
            ),
            // Будвайзер
            WhiteCard(
                    id = 163,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Жигулёвское"),
                            Pair(GrammaticCase.GENITIVE,        "Жигулёвского"),
                            Pair(GrammaticCase.DATIVE,          "Жигулёвскому"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Жигулёвское"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Жигулёвским"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Жигулёвском")
                    )
            ),
            WhiteCard(
                    id = 164,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "плацента"),
                            Pair(GrammaticCase.GENITIVE,        "плаценты"),
                            Pair(GrammaticCase.DATIVE,          "плацентУ"),
                            Pair(GrammaticCase.ACCUSATIVE,      "плаценту"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "плацентой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "плаценте")
                    )
            ),
            // самовозгорание человека
            WhiteCard(
                    id = 165,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "самосожжение"),
                            Pair(GrammaticCase.GENITIVE,        "самосожжения"),
                            Pair(GrammaticCase.DATIVE,          "самосожжению"),
                            Pair(GrammaticCase.ACCUSATIVE,      "самосожжение"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "самосожжением"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "самосожжении")
                    )
            ),
            WhiteCard(
                    id = 166,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "друзья и любовники"),
                            Pair(GrammaticCase.GENITIVE,        "друзей и любовников"),
                            Pair(GrammaticCase.DATIVE,          "друзьям и любовникам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "друзей и любовников"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "друзьями и любовниками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "друзьях и любовниках")
                    )
            ),
            WhiteCard(
                    id = 167,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "рисование пальцем"),
                            Pair(GrammaticCase.GENITIVE,        "рисования пальцем"),
                            Pair(GrammaticCase.DATIVE,          "рисованию пальцем"),
                            Pair(GrammaticCase.ACCUSATIVE,      "рисование пальцем"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "рисованием пальцем"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "рисовании пальцем")
                    )
            ),
            WhiteCard(
                    id = 168,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "запах пожилого человека"),
                            Pair(GrammaticCase.GENITIVE,        "запаха пожилого человека"),
                            Pair(GrammaticCase.DATIVE,          "запаху пожилого человека"),
                            Pair(GrammaticCase.ACCUSATIVE,      "запах пожилого человека"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "запахом пожилого человека"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "запахе пожилого человека")
                    )
            ),
            // смерть от дизентерии
            WhiteCard(
                    id = 169,
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
                    id = 170,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "тараканы в моей голове"),
                            Pair(GrammaticCase.GENITIVE,        "тараканов в моей голове"),
                            Pair(GrammaticCase.DATIVE,          "тараканам в моей голове"),
                            Pair(GrammaticCase.ACCUSATIVE,      "тараканов в моей голове"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "тараканами в моей голове"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "тараканах в моей голове")
                    )
            ),
            WhiteCard(
                    id = 171,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "водяной пистолет с кошачьей мочой"),
                            Pair(GrammaticCase.GENITIVE,        "водянго пистолета с кошачьей мочой"),
                            Pair(GrammaticCase.DATIVE,          "водяному пистолету с кошачьей мочой"),
                            Pair(GrammaticCase.ACCUSATIVE,      "водяной пистолет с кошачьей мочой"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "водяным пистолетом с кошачьей мочой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "водяном пистолете с кошачьей мочой")
                    )
            ),
            WhiteCard(
                    id = 172,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Алла Пугачёва"),
                            Pair(GrammaticCase.GENITIVE,        "Аллы Пугачёвой"),
                            Pair(GrammaticCase.DATIVE,          "Алле Пугачёвой"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Аллу Пугачёву"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Аллой Пугачёвой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Алле Пугачёве")
                    )
            ),
            WhiteCard(
                    id = 173,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "обнимашки"),
                            Pair(GrammaticCase.GENITIVE,        "обнимашек"),
                            Pair(GrammaticCase.DATIVE,          "обнимашкам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "обнимашки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "обнимашками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "обнимашках")
                    )
            ),
            WhiteCard(
                    id = 174,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "хроника"),
                            Pair(GrammaticCase.GENITIVE,        "хроники"),
                            Pair(GrammaticCase.DATIVE,          "хронике"),
                            Pair(GrammaticCase.ACCUSATIVE,      "хронику"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "хроникой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "хронике")
                    )
            ),
            WhiteCard(
                    id = 175,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ампутированные конечности"),
                            Pair(GrammaticCase.GENITIVE,        "ампутированных конечностей"),
                            Pair(GrammaticCase.DATIVE,          "ампутированным конечностям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ампутированные конечности"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ампутированными конечностями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ампутированных конечностей")
                    )
            ),
            WhiteCard(
                    id = 176,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "огонь по своим"),
                            Pair(GrammaticCase.GENITIVE,        "огня по своим"),
                            Pair(GrammaticCase.DATIVE,          "огню по своим"),
                            Pair(GrammaticCase.ACCUSATIVE,      "огонь по своим"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "огнём по своим"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "огне по своим")
                    )
            ),
            // Рональд Рейган
            WhiteCard(
                    id = 177,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Никита Хрущёв"),
                            Pair(GrammaticCase.GENITIVE,        "Никиты Хрущёва"),
                            Pair(GrammaticCase.DATIVE,          "Никите Хрущёву"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Никиту Хрущёва"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Никитой Хрущёвым"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Никите Хрущёве")
                    )
            ),
            WhiteCard(
                    id = 178,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "скучный день рождения"),
                            Pair(GrammaticCase.GENITIVE,        "скучного дня рождения"),
                            Pair(GrammaticCase.DATIVE,          "скучному дню рождения"),
                            Pair(GrammaticCase.ACCUSATIVE,      "скучный день рождения"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "скучным днём рождения"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "скучном дне рождения")
                    )
            ),
            WhiteCard(
                    id = 179,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "чернокожая кокетка"),
                            Pair(GrammaticCase.GENITIVE,        "чернокожей кокетки"),
                            Pair(GrammaticCase.DATIVE,          "чернокожей кокетке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "чернокожую кокетку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "чернокожей кокеткой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "чернокожей кокетке")
                    )
            ),
            WhiteCard(
                    id = 180,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "маленькая лошадка"),
                            Pair(GrammaticCase.GENITIVE,        "маленькой лошадки"),
                            Pair(GrammaticCase.DATIVE,          "маленькой лошадке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "маленькую лошадку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "маленькой лошадкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "маленькой лошадке")
                    )
            ),



            WhiteCard(
                    id = 181,
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
                    id = 182,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "романтика заката"),
                            Pair(GrammaticCase.GENITIVE,        "романтики заката"),
                            Pair(GrammaticCase.DATIVE,          "романтике заката"),
                            Pair(GrammaticCase.ACCUSATIVE,      "романтику заката"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "романтикой заката"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "романтике заката")
                    )
            ),
            WhiteCard(
                    id = 183,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "лихо закрученный сюжет"),
                            Pair(GrammaticCase.GENITIVE,        "лихо закрученного сюжета"),
                            Pair(GrammaticCase.DATIVE,          "лихо закрученному сюжету"),
                            Pair(GrammaticCase.ACCUSATIVE,      "лихо закрученный сюжет"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "лихо закрученным сюжетом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "лихо закрученном сюжете")
                    )
            ),
            WhiteCard(
                    id = 184,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "негры"),
                            Pair(GrammaticCase.GENITIVE,        "негров"),
                            Pair(GrammaticCase.DATIVE,          "неграм"),
                            Pair(GrammaticCase.ACCUSATIVE,      "негров"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "неграми"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "неграх")
                    )
            ),
            WhiteCard(
                    id = 185,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ядерный паритет"),
                            Pair(GrammaticCase.GENITIVE,        "ядерного паритета"),
                            Pair(GrammaticCase.DATIVE,          "ядерному паритету"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ядерный паритет"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ядерным паритетом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ядерном паритете")
                    )
            ),
            WhiteCard(
                    id = 186,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "педофилы"),
                            Pair(GrammaticCase.GENITIVE,        "педофилов"),
                            Pair(GrammaticCase.DATIVE,          "педофилам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "педофилов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "педофилами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "педофилах")
                    )
            ),
            WhiteCard(
                    id = 187,
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
                    id = 188,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мародёрство"),
                            Pair(GrammaticCase.GENITIVE,        "мародёрства"),
                            Pair(GrammaticCase.DATIVE,          "мародёрству"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мародёрство"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мародёрством"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мародёрстве")
                    )
            ),
            WhiteCard(
                    id = 189,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "поедание последнего выжившего бизона"),
                            Pair(GrammaticCase.GENITIVE,        "поедания последнего выжившего бизона"),
                            Pair(GrammaticCase.DATIVE,          "поеданию последнего выжившего бизона"),
                            Pair(GrammaticCase.ACCUSATIVE,      "поедание последнего выжившего бизона"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "поеданием последнего выжившего бизона"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "поедании последнего выжившего бизона")
                    )
            ),
            WhiteCard(
                    id = 190,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "катапульты"),
                            Pair(GrammaticCase.GENITIVE,        "катапульт"),
                            Pair(GrammaticCase.DATIVE,          "катапультам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "катапульты"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "катапультами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "катапультах")
                    )
            ),
            WhiteCard(
                    id = 191,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "бедные люди"),
                            Pair(GrammaticCase.GENITIVE,        "бедных людей"),
                            Pair(GrammaticCase.DATIVE,          "бедным людям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "бедных людей"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "бедными людьми"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "бедных людях")
                    )
            ),
            WhiteCard(
                    id = 192,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "уничтожение доказательств"),
                            Pair(GrammaticCase.GENITIVE,        "уничтожения доказательств"),
                            Pair(GrammaticCase.DATIVE,          "уничтожению доказательств"),
                            Pair(GrammaticCase.ACCUSATIVE,      "уничтожение доказательств"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "уничтожением доказательств"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "уничтожении доказательств")
                    )
            ),
            WhiteCard(
                    id = 193,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "танцор диско"),
                            Pair(GrammaticCase.GENITIVE,        "танцора диско"),
                            Pair(GrammaticCase.DATIVE,          "танцору диско"),
                            Pair(GrammaticCase.ACCUSATIVE,      "танцор диско"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "танцором диско"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "танцоре диско")
                    )
            ),
            WhiteCard(
                    id = 194,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Йода"),
                            Pair(GrammaticCase.GENITIVE,        "Йоды"),
                            Pair(GrammaticCase.DATIVE,          "Йоде"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Йоду"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Йодой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Йоде")
                    )
            ),
            // подтирание ее задницы - мы что, в детском саду?
            WhiteCard(
                    id = 195,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "отбеливание ануса"),
                            Pair(GrammaticCase.GENITIVE,        "отбеливания ануса"),
                            Pair(GrammaticCase.DATIVE,          "отбеливанию ануса"),
                            Pair(GrammaticCase.ACCUSATIVE,      "отбеливание ануса"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "отбеливанием ануса"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "отбеливании ануса")
                    )
            ),
            // школа-институт-работа-семья-поездка на море-пенсия-смерть
        //     WhiteCard(
        //             id = 196,
        //             cases = hashMapOf<GrammaticCase, String>(
        //                     Pair(GrammaticCase.NOMINATIVE,      ""),
        //                     Pair(GrammaticCase.GENITIVE,        ""),
        //                     Pair(GrammaticCase.DATIVE,          ""),
        //                     Pair(GrammaticCase.ACCUSATIVE,      ""),
        //                     Pair(GrammaticCase.INSTRUMENTAL,    ""),
        //                     Pair(GrammaticCase.PREPOSITIONAL,   "")
        //             )
        //     ),
            WhiteCard(
                    id = 197,
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
                    id = 198,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "фото груди"),
                            Pair(GrammaticCase.GENITIVE,        "фото груди"),
                            Pair(GrammaticCase.DATIVE,          "фото груди"),
                            Pair(GrammaticCase.ACCUSATIVE,      "фото груди"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "фото груди"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "фото груди")
                    )
            ),
            WhiteCard(
                    id = 199,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сверхчеловек"),
                            Pair(GrammaticCase.GENITIVE,        "сверхчеловека"),
                            Pair(GrammaticCase.DATIVE,          "сверхчеловеку"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сверхчеловека"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сверхчеловеком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сверхчеловеке")
                    )
            ),
            // Сара Пэйлин
            WhiteCard(
                    id = 200,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "губернатор Чукотки"),
                            Pair(GrammaticCase.GENITIVE,        "губернатора Чукотки"),
                            Pair(GrammaticCase.DATIVE,          "губернатору Чукотки"),
                            Pair(GrammaticCase.ACCUSATIVE,      "губернатора Чукотки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "губернатором Чукотки"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "губернаторе Чукотки")
                    )
            ),



            WhiteCard(
                    id = 201,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "дом престарелых"),
                            Pair(GrammaticCase.GENITIVE,        "дома престарелых"),
                            Pair(GrammaticCase.DATIVE,          "дому престарелых"),
                            Pair(GrammaticCase.ACCUSATIVE,      "дом престарелых"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "домом престарелых"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "доме престарелых")
                    )
            ),
            WhiteCard(
                    id = 202,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "обкурка"),
                            Pair(GrammaticCase.GENITIVE,        "обкурки"),
                            Pair(GrammaticCase.DATIVE,          "обкурке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "обкурку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "обкуркой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "обкурке")
                    )
            ),
            WhiteCard(
                    id = 203,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сайентология"),
                            Pair(GrammaticCase.GENITIVE,        "сайентологии"),
                            Pair(GrammaticCase.DATIVE,          "сайентологии"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сайентологию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сайентологией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сайентологии")
                    )
            ),
            WhiteCard(
                    id = 204,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "зависть по пенису"),
                            Pair(GrammaticCase.GENITIVE,        "зависти по пенису"),
                            Pair(GrammaticCase.DATIVE,          "зависти по пенису"),
                            Pair(GrammaticCase.ACCUSATIVE,      "зависть по пенису"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "завистью по пенису"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "зависти по пенису")
                    )
            ),
            WhiteCard(
                    id = 205,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сгущёнка"),
                            Pair(GrammaticCase.GENITIVE,        "сгущёнки"),
                            Pair(GrammaticCase.DATIVE,          "сгущёнке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сгущёнку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сгущёнкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сгущёнке")
                    )
            ),
            WhiteCard(
                    id = 206,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "веселуха"),
                            Pair(GrammaticCase.GENITIVE,        "веселухи"),
                            Pair(GrammaticCase.DATIVE,          "веселухе"),
                            Pair(GrammaticCase.ACCUSATIVE,      "веселуху"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "веселухой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "веселухе")
                    )
            ),
            WhiteCard(
                    id = 207,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "два карлика на туалетном ведре"),
                            Pair(GrammaticCase.GENITIVE,        "двух карликов на туалетном ведре"),
                            Pair(GrammaticCase.DATIVE,          "двум карликам на туалетном ведре"),
                            Pair(GrammaticCase.ACCUSATIVE,      "двух карликов на туалетном ведре"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "двумя карликами на туалетном ведре"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "двух карликах на туалетном ведре")
                    )
            ),
            WhiteCard(
                    id = 208,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "неонацисты"),
                            Pair(GrammaticCase.GENITIVE,        "неонацистов"),
                            Pair(GrammaticCase.DATIVE,          "неонацистам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "неонацистов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "неонацистами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "неонацистах")
                    )
            ),
            WhiteCard(
                    id = 209,
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
                    id = 210,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "метамфетамин"),
                            Pair(GrammaticCase.GENITIVE,        "метамфетамина"),
                            Pair(GrammaticCase.DATIVE,          "метамфетамину"),
                            Pair(GrammaticCase.ACCUSATIVE,      "метамфетамин"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "метамфетамином"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "метамфетамине")
                    )
            ),
            WhiteCard(
                    id = 211,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "крепостное право"),
                            Pair(GrammaticCase.GENITIVE,        "крепостного права"),
                            Pair(GrammaticCase.DATIVE,          "крепостному праву"),
                            Pair(GrammaticCase.ACCUSATIVE,      "крепостное право"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "крепостным правом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "крепостном праве")
                    )
            ),
            WhiteCard(
                    id = 212,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "маньяк"),
                            Pair(GrammaticCase.GENITIVE,        "маньяка"),
                            Pair(GrammaticCase.DATIVE,          "маньяку"),
                            Pair(GrammaticCase.ACCUSATIVE,      "маньяка"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "маньяком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "маньяке")
                    )
            ),
            WhiteCard(
                    id = 213,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "тамагочи"),
                            Pair(GrammaticCase.GENITIVE,        "тамагочи"),
                            Pair(GrammaticCase.DATIVE,          "тамагочи"),
                            Pair(GrammaticCase.ACCUSATIVE,      "тамагочи"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "тамагочи"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "тамагочи")
                    )
            ),
            WhiteCard(
                    id = 214,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "актёрская карьера Михаила Боярского"),
                            Pair(GrammaticCase.GENITIVE,        "актёрской карьеры Михаила Боярского"),
                            Pair(GrammaticCase.DATIVE,          "актёрской карьере Михаила Боярского"),
                            Pair(GrammaticCase.ACCUSATIVE,      "актёрскую карьеру Михаила Боярского"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "актёрской карьерой Михаила Боярского"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "актёрской карьере Михаила Боярского")
                    )
            ),
            WhiteCard(
                    id = 215,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "галоп"),
                            Pair(GrammaticCase.GENITIVE,        "галопа"),
                            Pair(GrammaticCase.DATIVE,          "галопу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "галоп"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "галопом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "галопе")
                    )
            ),
            WhiteCard(
                    id = 216,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "дворовое правосудие"),
                            Pair(GrammaticCase.GENITIVE,        "дворовым правосудием"),
                            Pair(GrammaticCase.DATIVE,          "дворовому правосудию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "дворовое правосудие"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "дворовым правосудием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "дворовом правосудии")
                    )
            ),
            WhiteCard(
                    id = 217,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "переплата"),
                            Pair(GrammaticCase.GENITIVE,        "переплаты"),
                            Pair(GrammaticCase.DATIVE,          "переплате"),
                            Pair(GrammaticCase.ACCUSATIVE,      "переплату"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "переплатой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "переплате")
                    )
            ),
            WhiteCard(
                    id = 218,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "некачественное порно"),
                            Pair(GrammaticCase.GENITIVE,        "некачественного порно"),
                            Pair(GrammaticCase.DATIVE,          "некачественному порно"),
                            Pair(GrammaticCase.ACCUSATIVE,      "некачественное порно"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "некачественным порно"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "некачественном порно")
                    )
            ),
            // грусть длинною в жизнь
            WhiteCard(
                    id = 219,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "вечная печаль"),
                            Pair(GrammaticCase.GENITIVE,        "вечной печали"),
                            Pair(GrammaticCase.DATIVE,          "вечной печали"),
                            Pair(GrammaticCase.ACCUSATIVE,      "вечную печаль"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "вечной печалью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "вечной печали")
                    )
            ),
            WhiteCard(
                    id = 220,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "расизм"),
                            Pair(GrammaticCase.GENITIVE,        "расизма"),
                            Pair(GrammaticCase.DATIVE,          "расизму"),
                            Pair(GrammaticCase.ACCUSATIVE,      "расизм"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "расизмом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "расизме")
                    )
            ),



            WhiteCard(
                    id = 221,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "предменструальный синдром"),
                            Pair(GrammaticCase.GENITIVE,        "предменструального синдрома"),
                            Pair(GrammaticCase.DATIVE,          "предменструальному синдрому"),
                            Pair(GrammaticCase.ACCUSATIVE,      "предменструальный синдром"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "предменструальным синдромом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "предменструальном синдроме")
                    )
            ),
            WhiteCard(
                    id = 222,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "солнце и радуга"),
                            Pair(GrammaticCase.GENITIVE,        "солнца и радуги"),
                            Pair(GrammaticCase.DATIVE,          "солнцу и радуге"),
                            Pair(GrammaticCase.ACCUSATIVE,      "солнце и радугу"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "солнцем и радугой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "солнце и радуге")
                    )
            ),
            WhiteCard(
                    id = 223,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "обезьяна с сигарой"),
                            Pair(GrammaticCase.GENITIVE,        "обезьяны с сигарой"),
                            Pair(GrammaticCase.DATIVE,          "обезьяне с сигарой"),
                            Pair(GrammaticCase.ACCUSATIVE,      "обезьяну с сигарой"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "обезьяной с сигарой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "обезьяне с сигарой")
                    )
            ),
            WhiteCard(
                    id = 224,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "реабелитационный центр"),
                            Pair(GrammaticCase.GENITIVE,        "реабелитационного центра"),
                            Pair(GrammaticCase.DATIVE,          "реабелитационному центру"),
                            Pair(GrammaticCase.ACCUSATIVE,      "реабелитационный центр"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "реабелитационным центром"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "реабелитационном центре")
                    )
            ),
            // недостающее яичко Ланса Армстронга
            WhiteCard(
                    id = 225,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "недостающее яичко"),
                            Pair(GrammaticCase.GENITIVE,        "недостающего яичка"),
                            Pair(GrammaticCase.DATIVE,          "недостающему яичку"),
                            Pair(GrammaticCase.ACCUSATIVE,      "недостающее яичко"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "недостающим яичком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "недостающем яичке")
                    )
            ),
            WhiteCard(
                    id = 226,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мощная отрыжка"),
                            Pair(GrammaticCase.GENITIVE,        "мощной отрыжки"),
                            Pair(GrammaticCase.DATIVE,          "мощной отрыжке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мощную отрыжку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мощной отрыжкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мощной отрыжке")
                    )
            ),
            WhiteCard(
                    id = 227,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "террористы"),
                            Pair(GrammaticCase.GENITIVE,        "террористов"),
                            Pair(GrammaticCase.DATIVE,          "террористам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "террористов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "террористами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "террористах")
                    )
            ),
            WhiteCard(
                    id = 228,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "55-летняя Бритни Спирс"),
                            Pair(GrammaticCase.GENITIVE,        "55-летней Бритни Спирс"),
                            Pair(GrammaticCase.DATIVE,          "55-летней Бритни Спирс"),
                            Pair(GrammaticCase.ACCUSATIVE,      "55-летнюю Бритни Спирс"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "55-летней Бритни Спирс"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "55-летней Бритни Спирс")
                    )
            ),
            // кокетство
            WhiteCard(
                    id = 229,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "флирт"),
                            Pair(GrammaticCase.GENITIVE,        "флирта"),
                            Pair(GrammaticCase.DATIVE,          "флирту"),
                            Pair(GrammaticCase.ACCUSATIVE,      "флирт"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "флиртом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "флирте")
                    )
            ),
            WhiteCard(
                    id = 230,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "спонтанные песни и пляски"),
                            Pair(GrammaticCase.GENITIVE,        "спонтанных песен и плясок"),
                            Pair(GrammaticCase.DATIVE,          "спонтанным песням и пляскам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "спонтанные песни и пляски"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "спонтанными песнями и плясками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "спонтанных песнях и плясках")
                    )
            ),
            WhiteCard(
                    id = 231,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "проказа"),
                            Pair(GrammaticCase.GENITIVE,        "проказы"),
                            Pair(GrammaticCase.DATIVE,          "проказе"),
                            Pair(GrammaticCase.ACCUSATIVE,      "проказу"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "проказой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "проказе")
                    )
            ),
            // дыры в стенах для анонимного секса
            WhiteCard(
                    id = 232,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "отверстие в стенке кабинки туалета"),
                            Pair(GrammaticCase.GENITIVE,        "отверстия в стенке кабинки туалета"),
                            Pair(GrammaticCase.DATIVE,          "отверстию в стенке кабинки туалета"),
                            Pair(GrammaticCase.ACCUSATIVE,      "отверстие в стенке кабинки туалета"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "отверстием в стенке кабинки туалета"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "отверстии в стенке кабинки туалета")
                    )
            ),
            WhiteCard(
                    id = 233,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "насадки на соски́"),
                            Pair(GrammaticCase.GENITIVE,        "насадок на соски́"),
                            Pair(GrammaticCase.DATIVE,          "насадкам на соски́"),
                            Pair(GrammaticCase.ACCUSATIVE,      "насадки на соски́"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "насадками на соски́"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "насадках на соски́")
                    )
            ),
            WhiteCard(
                    id = 234,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сердце ребёнка"),
                            Pair(GrammaticCase.GENITIVE,        "сердца ребёнка"),
                            Pair(GrammaticCase.DATIVE,          "сердцу ребёнка"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сердце ребёнка"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сердцем ребёнка"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сердце ребёнка")
                    )
            ),
            WhiteCard(
                    id = 235,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "щеночки"),
                            Pair(GrammaticCase.GENITIVE,        "щеночков"),
                            Pair(GrammaticCase.DATIVE,          "щеночкам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "щеночков"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "щеночками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "щеночках")
                    )
            ),
            // проснуться голым на парковке
            WhiteCard(
                    id = 236,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пробуждение голым на парковке"),
                            Pair(GrammaticCase.GENITIVE,        "пробуждения голым на парковке"),
                            Pair(GrammaticCase.DATIVE,          "пробуждению голым на парковке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пробуждение голым на парковке"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пробуждением голым на парковке"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пробуждении голым на парковке")
                    )
            ),
            // коффердам
            WhiteCard(
                    id = 237,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "вагинальный расширитель"),
                            Pair(GrammaticCase.GENITIVE,        "вагинального расширителя"),
                            Pair(GrammaticCase.DATIVE,          "вагинальному расширителю"),
                            Pair(GrammaticCase.ACCUSATIVE,      "вагинальный расширитель"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "вагинальным расширителем"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "вагинальном расширителе")
                    )
            ),
            WhiteCard(
                    id = 238,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "вагина Дарьи Донцовой"),
                            Pair(GrammaticCase.GENITIVE,        "вагины Дарьи Донцовой"),
                            Pair(GrammaticCase.DATIVE,          "вагине Дарьи Донцовой"),
                            Pair(GrammaticCase.ACCUSATIVE,      "вагину Дарьи Донцовой"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "вагиной Дарьи Донцовой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "вагине Дарьи Донцовой")
                    )
            ),
            // игры с анальным отверстием
            WhiteCard(
                    id = 239,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "анальные забавы"),
                            Pair(GrammaticCase.GENITIVE,        "анальных забав"),
                            Pair(GrammaticCase.DATIVE,          "анальным забавам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "анальные забавы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "анальными забавами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "анальных забавах")
                    )
            ),
            WhiteCard(
                    id = 240,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "активное прослушивание"),
                            Pair(GrammaticCase.GENITIVE,        "активного прослушивания"),
                            Pair(GrammaticCase.DATIVE,          "активному прослушиванию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "активное прослушивание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "активным прослушиванием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "активном прослушивании")
                    )
            ),



            WhiteCard(
                    id = 241,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "этнические чистки"),
                            Pair(GrammaticCase.GENITIVE,        "этнических чисток"),
                            Pair(GrammaticCase.DATIVE,          "этническим чисткам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "этнические чистки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "этническими чистками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "этнических чистках")
                    )
            ),
            WhiteCard(
                    id = 242,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "паровозик из Ромашково"),
                            Pair(GrammaticCase.GENITIVE,        "паровозика из Ромашково"),
                            Pair(GrammaticCase.DATIVE,          "паровозику из Ромашково"),
                            Pair(GrammaticCase.ACCUSATIVE,      "паровозик из Ромашково"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "паровозиком из Ромашково"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "паровозике из Ромашково")
                    )
            ),
            WhiteCard(
                    id = 243,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "невидимая рука"),
                            Pair(GrammaticCase.GENITIVE,        "невидимой руки"),
                            Pair(GrammaticCase.DATIVE,          "невидимой руке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "невидимую руку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "невидимой рукой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "невидимой руке")
                    )
            ),
            WhiteCard(
                    id = 244,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "целибат до брака"),
                            Pair(GrammaticCase.GENITIVE,        "целибата до брака"),
                            Pair(GrammaticCase.DATIVE,          "целибату до брака"),
                            Pair(GrammaticCase.ACCUSATIVE,      "целибат до брака"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "целибатом до брака"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "целибате до брака")
                    )
            ),
            WhiteCard(
                    id = 245,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "редчайшая тупость"),
                            Pair(GrammaticCase.GENITIVE,        "редчайшей тупости"),
                            Pair(GrammaticCase.DATIVE,          "редчайшей тупости"),
                            Pair(GrammaticCase.ACCUSATIVE,      "редчайшую тупость"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "редчайшей тупостью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "редчайшей тупости")
                    )
            ),
            WhiteCard(
                    id = 246,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "блестящие предметы"),
                            Pair(GrammaticCase.GENITIVE,        "блестящих предметов"),
                            Pair(GrammaticCase.DATIVE,          "блестящим предметам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "блестящие предметы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "блестящими предметами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "блестящих предметах")
                    )
            ),
            WhiteCard(
                    id = 247,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Дьявол во плоти"),
                            Pair(GrammaticCase.GENITIVE,        "Дьявола во плоти"),
                            Pair(GrammaticCase.DATIVE,          "Дьяволу во плоти"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Дьявола во плоти"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Дьяволом во плоти"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Дьяволе во плоти")
                    )
            ),
            WhiteCard(
                    id = 248,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "самопоедание"),
                            Pair(GrammaticCase.GENITIVE,        "самопоедания"),
                            Pair(GrammaticCase.DATIVE,          "самопоеданию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "самопоедание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "самопоеданием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "самопоедании")
                    )
            ),
            WhiteCard(
                    id = 249,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "эректильная дисфункция"),
                            Pair(GrammaticCase.GENITIVE,        "эректильной дисфункции"),
                            Pair(GrammaticCase.DATIVE,          "эректильной дисфункции"),
                            Pair(GrammaticCase.ACCUSATIVE,      "эректильную дисфункцию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "эректильной дисфункцией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "эректильной дисфункции")
                    )
            ),
            WhiteCard(
                    id = 250,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "моя коллекция секс-игрушек"),
                            Pair(GrammaticCase.GENITIVE,        "моей коллекции секс-игрушек"),
                            Pair(GrammaticCase.DATIVE,          "моей коллекции секс-игрушек"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мою коллекцию секс-игрушек"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "моей коллекцией секс-игрушек"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "моей коллекции секс-игрушек")
                    )
            ),
            WhiteCard(
                    id = 251,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Папа Римский"),
                            Pair(GrammaticCase.GENITIVE,        "Папы Римского"),
                            Pair(GrammaticCase.DATIVE,          "Папе Римскому"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Папу Римского"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Папой Римским"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Папе Римском")
                    )
            ),
            WhiteCard(
                    id = 252,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "богатые люди"),
                            Pair(GrammaticCase.GENITIVE,        "богатых людей"),
                            Pair(GrammaticCase.DATIVE,          "богатым людям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "богатых людей"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "богатыми людьми"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "богатых людях")
                    )
            ),
            WhiteCard(
                    id = 253,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "японское порно"),
                            Pair(GrammaticCase.GENITIVE,        "японского порно"),
                            Pair(GrammaticCase.DATIVE,          "японскому порно"),
                            Pair(GrammaticCase.ACCUSATIVE,      "японское порно"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "японским порно"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "японском порно")
                    )
            ),
            // споймать Виктора Чубайса и заставить танцевать в костюме обезьянки
            WhiteCard(
                    id = 254,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "танец в костюме обезьянки"),
                            Pair(GrammaticCase.GENITIVE,        "танца в костюме обезьянки"),
                            Pair(GrammaticCase.DATIVE,          "танцу в костюме обезьянки"),
                            Pair(GrammaticCase.ACCUSATIVE,      "танец в костюме обезьянки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "танцем в костюме обезьянки"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "танце в костюме обезьянки")
                    )
            ),
            WhiteCard(
                    id = 255,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "насвистывание песни из «Титаника»"),
                            Pair(GrammaticCase.GENITIVE,        "насвистывания песни из «Титаника»"),
                            Pair(GrammaticCase.DATIVE,          "насвистыванию песни из «Титаника»"),
                            Pair(GrammaticCase.ACCUSATIVE,      "насвистывание песни из «Титаника»"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "насвистыванием песни из «Титаника»"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "насвистывании песни из «Титаника»")
                    )
            ),
            WhiteCard(
                    id = 256,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "харакири"),
                            Pair(GrammaticCase.GENITIVE,        "харакири"),
                            Pair(GrammaticCase.DATIVE,          "харакири"),
                            Pair(GrammaticCase.ACCUSATIVE,      "харакири"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "харакири"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "харакири")
                    )
            ),
            // гомосексуальный танец на льду
            WhiteCard(
                    id = 257,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "однополые танцы на льду"),
                            Pair(GrammaticCase.GENITIVE,        "однополых танцев на льду"),
                            Pair(GrammaticCase.DATIVE,          "однополым танцам на льду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "однополые танцы на льду"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "однополыми танцами на льду"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "однополых танцах на льду")
                    )
            ),
            // махлеж в параолимпийских играх
            WhiteCard(
                    id = 258,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "допинг на Паралимпиаде"),
                            Pair(GrammaticCase.GENITIVE,        "допинга на Паралимпиаде"),
                            Pair(GrammaticCase.DATIVE,          "допингу на Паралимпиаде"),
                            Pair(GrammaticCase.ACCUSATIVE,      "допинг на Паралимпиаде"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "допингом на Паралимпиаде"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "допинге на Паралимпиаде")
                    )
            ),
            WhiteCard(
                    id = 259,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "девственница, брошенная в жерло вулкана"),
                            Pair(GrammaticCase.GENITIVE,        "девственницы, брошенной в жерло вулкана"),
                            Pair(GrammaticCase.DATIVE,          "девственнице, брошенной в жерло вулкана"),
                            Pair(GrammaticCase.ACCUSATIVE,      "девственницу, брошенную в жерло вулкана"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "девственницей, брошенной в жерло вулкана"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "девственнице, брошенной в жерло вулкана")
                    )
            ),
            WhiteCard(
                    id = 260,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Киану Ривз"),
                            Pair(GrammaticCase.GENITIVE,        "Киану Ривза"),
                            Pair(GrammaticCase.DATIVE,          "Киану Ривзу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Киану Ривза"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Киану Ривзом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Киану Ривзе")
                    )
            ),



            // Шон Пенн
            WhiteCard(
                    id = 261,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Сергей Безруков"),
                            Pair(GrammaticCase.GENITIVE,        "Сергея Безрукова"),
                            Pair(GrammaticCase.DATIVE,          "Сергею Безрукову"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Сергея Безрукова"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Сергеем Безруковым"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Сергее Безрукове")
                    )
            ),
            WhiteCard(
                    id = 262,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "группа «Nickelback»"),
                            Pair(GrammaticCase.GENITIVE,        "группы «Nickelback»"),
                            Pair(GrammaticCase.DATIVE,          "группе «Nickelback»"),
                            Pair(GrammaticCase.ACCUSATIVE,      "группу «Nickelback»"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "группой «Nickelback»"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "группе «Nickelback»")
                    )
            ),
            WhiteCard(
                    id = 263,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пожизненная двунаправленная дефекация"),
                            Pair(GrammaticCase.GENITIVE,        "пожизненной двунаправленной дефекации"),
                            Pair(GrammaticCase.DATIVE,          "пожизненной двунаправленной дефекации"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пожизненную двунаправленную дефекацию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пожизненной двунаправленной дефекацией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пожизненной двунаправленной дефекации")
                    )
            ),
            WhiteCard(
                    id = 264,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "подписка на «Cosmopolitan»"),
                            Pair(GrammaticCase.GENITIVE,        "подписки на «Cosmopolitan»"),
                            Pair(GrammaticCase.DATIVE,          "подписке на «Cosmopolitan»"),
                            Pair(GrammaticCase.ACCUSATIVE,      "подписку на «Cosmopolitan»"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "подпиской на «Cosmopolitan»"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "подписке на «Cosmopolitan»")
                    )
            ),
            WhiteCard(
                    id = 265,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "рак жопы"),
                            Pair(GrammaticCase.GENITIVE,        "рака жопы"),
                            Pair(GrammaticCase.DATIVE,          "раку жопы"),
                            Pair(GrammaticCase.ACCUSATIVE,      "рак жопы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "раком жопы"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "раке жопы")
                    )
            ),
            WhiteCard(
                    id = 266,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "солёный сюрприз"),
                            Pair(GrammaticCase.GENITIVE,        "солёного сюрприза"),
                            Pair(GrammaticCase.DATIVE,          "солёному сюрпризу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "солёный сюрприз"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "солёным сюрпризом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "солёном сюрпризе")
                    )
            ),
            WhiteCard(
                    id = 267,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "юг"),
                            Pair(GrammaticCase.GENITIVE,        "юга"),
                            Pair(GrammaticCase.DATIVE,          "югу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "юг"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "югом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "юге")
                    )
            ),
            // нарушение основных прав человека
            WhiteCard(
                    id = 268,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "нарушение базовых прав человека"),
                            Pair(GrammaticCase.GENITIVE,        "нарушения базовых прав человека"),
                            Pair(GrammaticCase.DATIVE,          "нарушению базовых прав человека"),
                            Pair(GrammaticCase.ACCUSATIVE,      "нарушение базовых прав человека"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "нарушением базовых прав человека"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "нарушении базовых прав человека")
                    )
            ),
        //     WhiteCard(
        //             id = 269,
        //             cases = hashMapOf<GrammaticCase, String>(
        //                     Pair(GrammaticCase.NOMINATIVE,      "осталось сбить 12 танчиков"),
        //                     Pair(GrammaticCase.GENITIVE,        "осталось сбить 12 танчиков"),
        //                     Pair(GrammaticCase.DATIVE,          "осталось сбить 12 танчиков"),
        //                     Pair(GrammaticCase.ACCUSATIVE,      "осталось сбить 12 танчиков"),
        //                     Pair(GrammaticCase.INSTRUMENTAL,    "осталось сбить 12 танчиков"),
        //                     Pair(GrammaticCase.PREPOSITIONAL,   "осталось сбить 12 танчиков")
        //             )
        //     ),
            WhiteCard(
                    id = 270,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "блистательность"),
                            Pair(GrammaticCase.GENITIVE,        "блистательности"),
                            Pair(GrammaticCase.DATIVE,          "блистательности"),
                            Pair(GrammaticCase.ACCUSATIVE,      "блистательность"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "блистательностью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "блистательности")
                    )
            ),
            WhiteCard(
                    id = 271,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "некрофилия"),
                            Pair(GrammaticCase.GENITIVE,        "некрофилии"),
                            Pair(GrammaticCase.DATIVE,          "некрофилии"),
                            Pair(GrammaticCase.ACCUSATIVE,      "некрофилию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "некрофилией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "некрофилии")
                    )
            ),
            WhiteCard(
                    id = 272,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "кентавр"),
                            Pair(GrammaticCase.GENITIVE,        "кентавра"),
                            Pair(GrammaticCase.DATIVE,          "кентавру"),
                            Pair(GrammaticCase.ACCUSATIVE,      "кентавра"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "кентавром"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "кентавре")
                    )
            ),
            WhiteCard(
                    id = 273,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Николай Дроздов"),
                            Pair(GrammaticCase.GENITIVE,        "Николая Дроздова"),
                            Pair(GrammaticCase.DATIVE,          "Николаю Дроздову"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Николая Дроздова"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Николаем Дроздовым"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Николае Дроздове")
                    )
            ),
            // чернокожие
            WhiteCard(
                    id = 274,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "казахи"),
                            Pair(GrammaticCase.GENITIVE,        "казахов"),
                            Pair(GrammaticCase.DATIVE,          "казахам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "казахов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "казахами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "казахах")
                    )
            ),
            WhiteCard(
                    id = 275,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пионеры"),
                            Pair(GrammaticCase.GENITIVE,        "пионеров"),
                            Pair(GrammaticCase.DATIVE,          "пионерам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пионеров"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пионерами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пионерах")
                    )
            ),
            WhiteCard(
                    id = 276,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мясная нарезка"),
                            Pair(GrammaticCase.GENITIVE,        "мясной нарезки"),
                            Pair(GrammaticCase.DATIVE,          "мясной нарезке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мясную нарезку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мясной нарезкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мясной нарезке")
                    )
            ),
            WhiteCard(
                    id = 277,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "су́чки"),
                            Pair(GrammaticCase.GENITIVE,        "сучек"),
                            Pair(GrammaticCase.DATIVE,          "су́чкам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сучек"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "су́чками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "су́чках")
                    )
            ),
            WhiteCard(
                    id = 278,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "безнадёжный инвалид"),
                            Pair(GrammaticCase.GENITIVE,        "безнадёжного инвалида"),
                            Pair(GrammaticCase.DATIVE,          "безнадёжному инвалиду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "безнадёжного инвалида"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "безнадёжным инвалидом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "безнадёжном инвалиде")
                    )
            ),
            WhiteCard(
                    id = 279,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "согревающие душу сироты"),
                            Pair(GrammaticCase.GENITIVE,        "согревающих душу сирот"),
                            Pair(GrammaticCase.DATIVE,          "согревающим душу сиротам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "согревающих душу сирот"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "согревающими душу сиротами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "согревающих душу сиротах")
                    )
            ),
            WhiteCard(
                    id = 280,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "робо-Гитлер"),
                            Pair(GrammaticCase.GENITIVE,        "робо-Гитлера"),
                            Pair(GrammaticCase.DATIVE,          "робо-Гитлеру"),
                            Pair(GrammaticCase.ACCUSATIVE,      "робо-Гитлера"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "робо-Гитлером"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "робо-Гитлере")
                    )
            ),



            WhiteCard(
                    id = 281,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "взрывной пердёж"),
                            Pair(GrammaticCase.GENITIVE,        "взрывного пердежа"),
                            Pair(GrammaticCase.DATIVE,          "взрывному пердежу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "взрывной пердёж"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "взрывным пердежом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "взрывном пердеже")
                    )
            ),
            WhiteCard(
                    id = 282,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ещё один дурацкий фильм про вампиров"),
                            Pair(GrammaticCase.GENITIVE,        "ещё одного дурацкого фильма про вампиров"),
                            Pair(GrammaticCase.DATIVE,          "ещё одному дурацкому фильму про вампиров"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ещё один дурацкий фильм про вампиров"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ещё одним дурацким фильмом про вампиров"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ещё одном дурацком фильме про вампиров")
                    )
            ),
            WhiteCard(
                    id = 283,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пружинка-радуга"),
                            Pair(GrammaticCase.GENITIVE,        "пружинки-радуги"),
                            Pair(GrammaticCase.DATIVE,          "пружинке-радуге"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пружинку-радугу"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пружинкой-радугой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пружинке-радуге")
                    )
            ),
            WhiteCard(
                    id = 284,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "истинный смысл Рождества"),
                            Pair(GrammaticCase.GENITIVE,        "истинного смысла Рождества"),
                            Pair(GrammaticCase.DATIVE,          "истинному смыслу Рождества"),
                            Pair(GrammaticCase.ACCUSATIVE,      "истинный смысл Рождества"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "истинным смыслом Рождества"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "истинном смысле Рождества")
                    )
            ),
            WhiteCard(
                    id = 285,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "эстроген"),
                            Pair(GrammaticCase.GENITIVE,        "эстрогена"),
                            Pair(GrammaticCase.DATIVE,          "эстрогену"),
                            Pair(GrammaticCase.ACCUSATIVE,      "эстроген"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "эстрогеном"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "эстрогене")
                    )
            ),
            WhiteCard(
                    id = 286,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "острая шаурма на завтрак"),
                            Pair(GrammaticCase.GENITIVE,        "острой шаурмы на завтрак"),
                            Pair(GrammaticCase.DATIVE,          "острой шаурме на завтрак"),
                            Pair(GrammaticCase.ACCUSATIVE,      "острую шаурму на завтрак"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "острой шаурмой на завтрак"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "острой шаурме на завтрак")
                    )
            ),
            WhiteCard(
                    id = 287,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пояс-массажёр"),
                            Pair(GrammaticCase.GENITIVE,        "пояса-массажёра"),
                            Pair(GrammaticCase.DATIVE,          "поясу-массажёру"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пояс-массажёр"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "поясом-массажёром"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "поясе-массажёре")
                    )
            ),
            WhiteCard(
                    id = 288,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "камни в почке"),
                            Pair(GrammaticCase.GENITIVE,        "камней в почке"),
                            Pair(GrammaticCase.DATIVE,          "камням в почке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "камни в почке"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "камнями в почке"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "камнях в почке")
                    )
            ),
            // отбеленное анальное отверстие
            WhiteCard(
                    id = 289,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "молитва за эпиляцию"),
                            Pair(GrammaticCase.GENITIVE,        "молитвы за эпиляцию"),
                            Pair(GrammaticCase.DATIVE,          "молитве за эпиляцию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "молитву за эпиляцию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "молитвой за эпиляцию"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "молитве за эпиляцию")
                    )
            ),
            WhiteCard(
                    id = 290,
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
                    id = 291,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "кибернетические усовершенствования"),
                            Pair(GrammaticCase.GENITIVE,        "кибернетических усовершенствований"),
                            Pair(GrammaticCase.DATIVE,          "кибернетическим усовершенствованиям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "кибернетические усовершенствования"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "кибернетическими усовершенствованиями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "кибернетических усовершенствованиях")
                    )
            ),
            WhiteCard(
                    id = 292,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "парни, которые больше не звонят"),
                            Pair(GrammaticCase.GENITIVE,        "парней, которые больше не звонят"),
                            Pair(GrammaticCase.DATIVE,          "парням, которые больше не звонят"),
                            Pair(GrammaticCase.ACCUSATIVE,      "парней, которые больше не звонят"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "парнями, которые больше не звонят"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "парнях, которые больше не звонят")
                    )
            ),
            WhiteCard(
                    id = 293,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "одеяло с вирусом оспы"),
                            Pair(GrammaticCase.GENITIVE,        "одеяла с вирусом оспы"),
                            Pair(GrammaticCase.DATIVE,          "одеялу с вирусом оспы"),
                            Pair(GrammaticCase.ACCUSATIVE,      "одеяло с вирусом оспы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "одеялом с вирусом оспы"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "одеяле с вирусом оспы")
                    )
            ),
            WhiteCard(
                    id = 294,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мастурбация"),
                            Pair(GrammaticCase.GENITIVE,        "мастурбации"),
                            Pair(GrammaticCase.DATIVE,          "мастурбации"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мастурбацию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мастурбацией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мастурбации")
                    )
            ),
            WhiteCard(
                    id = 295,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "классовые предрассудки"),
                            Pair(GrammaticCase.GENITIVE,        "классовых предрассудков"),
                            Pair(GrammaticCase.DATIVE,          "классовым предрассудкам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "классовые предрассудки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "классовыми предрассудками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "классовых предрассудках")
                    )
            ),
            WhiteCard(
                    id = 296,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "вагинальный сквозняк"),
                            Pair(GrammaticCase.GENITIVE,        "вагинального сквозняка"),
                            Pair(GrammaticCase.DATIVE,          "вагинальному сквозняку"),
                            Pair(GrammaticCase.ACCUSATIVE,      "вагинальный сквозняк"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "вагинальным сквозняком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "вагинальном сквозняке")
                    )
            ),
            WhiteCard(
                    id = 297,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "скрытие стояка"),
                            Pair(GrammaticCase.GENITIVE,        "скрытия стояка"),
                            Pair(GrammaticCase.DATIVE,          "скрытию стояка"),
                            Pair(GrammaticCase.ACCUSATIVE,      "скрытие стояка"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "скрытием стояка"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "скрытии стояка")
                    )
            ),
            WhiteCard(
                    id = 298,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "съедобные трусики"),
                            Pair(GrammaticCase.GENITIVE,        "съедобных трусиков"),
                            Pair(GrammaticCase.DATIVE,          "съедобным трусикам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "съедобные трусики"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "съедобными трусиками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "съедобных трусиках")
                    )
            ),
            WhiteCard(
                    id = 299,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "виагра"),
                            Pair(GrammaticCase.GENITIVE,        "виагры"),
                            Pair(GrammaticCase.DATIVE,          "виагре"),
                            Pair(GrammaticCase.ACCUSATIVE,      "виагру"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "виагрой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "виагре")
                    )
            ),
            WhiteCard(
                    id = 300,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "очень горячий суп"),
                            Pair(GrammaticCase.GENITIVE,        "очень горячего супа"),
                            Pair(GrammaticCase.DATIVE,          "очень горячему супу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "очень горячий суп"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "очень горячим супом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "очень горячем супе")
                    )
            ),



            WhiteCard(
                    id = 301,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пророк Мухаммед"),
                            Pair(GrammaticCase.GENITIVE,        "пророка Мухаммеда"),
                            Pair(GrammaticCase.DATIVE,          "пророку Мухаммеду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пророка Мухаммеда"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пророком Мухаммедом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пророке Мухаммеде")
                    )
            ),
            WhiteCard(
                    id = 302,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "неожиданный секс"),
                            Pair(GrammaticCase.GENITIVE,        "неожиданного секса"),
                            Pair(GrammaticCase.DATIVE,          "неожиданному сексу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "неожиданный секс"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "неожиданным сексом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "неожиданном сексе")
                    )
            ),
            // батон-бутерброд
            WhiteCard(
                    id = 303,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "французский багет"),
                            Pair(GrammaticCase.GENITIVE,        "французского багета"),
                            Pair(GrammaticCase.DATIVE,          "французскому багету"),
                            Pair(GrammaticCase.ACCUSATIVE,      "французский багет"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "французским багетом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "французском багете")
                    )
            ),
            WhiteCard(
                    id = 304,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "распивание в одиночку"),
                            Pair(GrammaticCase.GENITIVE,        "распивания в одиночку"),
                            Pair(GrammaticCase.DATIVE,          "распиванию в одиночку"),
                            Pair(GrammaticCase.ACCUSATIVE,      "распивание в одиночку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "распиванием в одиночку"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "распивании в одиночку")
                    )
            ),
            // "дырявые" руки
            WhiteCard(
                    id = 305,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "кривые руки"),
                            Pair(GrammaticCase.GENITIVE,        "кривых рук"),
                            Pair(GrammaticCase.DATIVE,          "кривым рукам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "кривые руки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "кривыми руками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "кривых руках")
                    )
            ),
            WhiteCard(
                    id = 306,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "множественные ножевые ранения"),
                            Pair(GrammaticCase.GENITIVE,        "множественных ножевых ранений"),
                            Pair(GrammaticCase.DATIVE,          "множественным ножевым ранениям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "множественные ножевые ранения"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "множественными ножевыми ранениями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "множественных ножевых ранениях")
                    )
            ),
            WhiteCard(
                    id = 307,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "грязные подгузники"),
                            Pair(GrammaticCase.GENITIVE,        "грязных подгузников"),
                            Pair(GrammaticCase.DATIVE,          "грязным подгузникам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "грязные подгузники"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "грязными подгузниками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "грязных подгузниках")
                    )
            ),
            WhiteCard(
                    id = 308,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "насилие над детьми"),
                            Pair(GrammaticCase.GENITIVE,        "насилия над детьми"),
                            Pair(GrammaticCase.DATIVE,          "насилию над детьми"),
                            Pair(GrammaticCase.ACCUSATIVE,      "насилие над детьми"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "насилием над детьми"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "насилии над детьми")
                    )
            ),
            WhiteCard(
                    id = 309,
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
                    id = 310,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "потери среди мирного населения"),
                            Pair(GrammaticCase.GENITIVE,        "потерь среди мирного населения"),
                            Pair(GrammaticCase.DATIVE,          "потерям среди мирного населения"),
                            Pair(GrammaticCase.ACCUSATIVE,      "потери среди мирного населения"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "потерями среди мирного населения"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "потерях среди мирного населения")
                    )
            ),
            WhiteCard(
                    id = 311,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "прерванный половой акт"),
                            Pair(GrammaticCase.GENITIVE,        "прерванного полового акта"),
                            Pair(GrammaticCase.DATIVE,          "прерванному половому акту"),
                            Pair(GrammaticCase.ACCUSATIVE,      "прерванный половой акт"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "прерванным половым актом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "прерванном половом акте")
                    )
            ),
            WhiteCard(
                    id = 312,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Роберт Дауни-младший"),
                            Pair(GrammaticCase.GENITIVE,        "Роберта Дауни-младшего"),
                            Pair(GrammaticCase.DATIVE,          "Роберту Дауни-младшему"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Роберта Дауни-младшего"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Робертом Дауни-младшим"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Роберте Дауни-младшем")
                    )
            ),
            WhiteCard(
                    id = 313,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "конина"),
                            Pair(GrammaticCase.GENITIVE,        "конины"),
                            Pair(GrammaticCase.DATIVE,          "конине"),
                            Pair(GrammaticCase.ACCUSATIVE,      "конину"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "кониной"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "конине")
                    )
            ),
            WhiteCard(
                    id = 314,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "очень крутая шапка"),
                            Pair(GrammaticCase.GENITIVE,        "очень крутой шапки"),
                            Pair(GrammaticCase.DATIVE,          "очень крутой шапке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "очень крутую шапку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "очень крутой шапкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "очень крутой шапке")
                    )
            ),
            WhiteCard(
                    id = 315,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Сталин"),
                            Pair(GrammaticCase.GENITIVE,        "Сталина"),
                            Pair(GrammaticCase.DATIVE,          "Сталину"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Сталина"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Сталиным"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Сталине")
                    )
            ),
            WhiteCard(
                    id = 316,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "лобковые волосы"),
                            Pair(GrammaticCase.GENITIVE,        "лобковых волос"),
                            Pair(GrammaticCase.DATIVE,          "лобковым волосам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "лобковые волосы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "лобковыми волосами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "лобковых волосах")
                    )
            ),
            // еврейские братства
            WhiteCard(
                    id = 317,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "еврейские общины"),
                            Pair(GrammaticCase.GENITIVE,        "еврейских общин"),
                            Pair(GrammaticCase.DATIVE,          "еврейским общинам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "еврейские общины"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "еврейскими общинами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "еврейских общинах")
                    )
            ),
            WhiteCard(
                    id = 318,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "исключительное меньшинство"),
                            Pair(GrammaticCase.GENITIVE,        "исключительного меньшинства"),
                            Pair(GrammaticCase.DATIVE,          "исключительному меньшинству"),
                            Pair(GrammaticCase.ACCUSATIVE,      "исключительное меньшинство"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "исключительным меньшинством"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "исключительном меньшинстве")
                    )
            ),
            WhiteCard(
                    id = 319,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "анальный секс"),
                            Pair(GrammaticCase.GENITIVE,        "анального секса"),
                            Pair(GrammaticCase.DATIVE,          "анальному сексу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "анальный секс"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "анальным сексом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "анальном сексе")
                    )
            ),
            WhiteCard(
                    id = 320,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "морская болезнь"),
                            Pair(GrammaticCase.GENITIVE,        "морской болезни"),
                            Pair(GrammaticCase.DATIVE,          "морской болезни"),
                            Pair(GrammaticCase.ACCUSATIVE,      "морскую болезнь"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "морской болезнью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "морской болезни")
                    )
            ),



            WhiteCard(
                    id = 321,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "обучение робота искусству любви"),
                            Pair(GrammaticCase.GENITIVE,        "обучения робота искусству любви"),
                            Pair(GrammaticCase.DATIVE,          "обучению робота искусству любви"),
                            Pair(GrammaticCase.ACCUSATIVE,      "обучение робота искусству любви"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "обучением робота искусству любви"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "обучении робота искусству любви")
                    )
            ),
            // мешок насрачников
            WhiteCard(
                    id = 322,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мешок подсрачников"),
                            Pair(GrammaticCase.GENITIVE,        "мешка подсрачников"),
                            Pair(GrammaticCase.DATIVE,          "мешку подсрачников"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мешок подсрачников"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мешком подсрачников"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мешке подсрачников")
                    )
            ),
            WhiteCard(
                    id = 323,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "трупопад"),
                            Pair(GrammaticCase.GENITIVE,        "трупопада"),
                            Pair(GrammaticCase.DATIVE,          "трупопаду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "трупопад"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "трупопадом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "трупопаде")
                    )
            ),
            WhiteCard(
                    id = 324,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "граф Шокодракула"),
                            Pair(GrammaticCase.GENITIVE,        "графа Шокодракулы"),
                            Pair(GrammaticCase.DATIVE,          "графу Шокодракуле"),
                            Pair(GrammaticCase.ACCUSATIVE,      "графа Шокодракулу"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "графом Шокодракулой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "графе Шокодракуле")
                    )
            ),
            WhiteCard(
                    id = 325,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ношение нестиранного белья наизнанку"),
                            Pair(GrammaticCase.GENITIVE,        "ношения нестиранного белья наизнанку"),
                            Pair(GrammaticCase.DATIVE,          "ношению нестиранного белья наизнанку"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ношение нестиранного белья наизнанку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ношением нестиранного белья наизнанку"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ношении нестиранного белья наизнанку")
                    )
            ),
            WhiteCard(
                    id = 326,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "смертельный луч"),
                            Pair(GrammaticCase.GENITIVE,        "смертельного луча"),
                            Pair(GrammaticCase.DATIVE,          "смертельному лучу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "смертельный луч"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "смертельным лучом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "смертельном луче")
                    )
            ),
            WhiteCard(
                    id = 327,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "стеклянный потолок"),
                            Pair(GrammaticCase.GENITIVE,        "стеклянного потолка"),
                            Pair(GrammaticCase.DATIVE,          "стеклянному потолку"),
                            Pair(GrammaticCase.ACCUSATIVE,      "стеклянный потолок"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "стеклянным потолком"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "стеклянном потолке")
                    )
            ),
            WhiteCard(
                    id = 328,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "холодильник с о́рганами"),
                            Pair(GrammaticCase.GENITIVE,        "холодильника с о́рганами"),
                            Pair(GrammaticCase.DATIVE,          "холодильнику с о́рганами"),
                            Pair(GrammaticCase.ACCUSATIVE,      "холодильник с о́рганами"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "холодильником с о́рганами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "холодильнике с о́рганами")
                    )
            ),
            WhiteCard(
                    id = 329,
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
                    id = 330,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "расхаживание без штанов"),
                            Pair(GrammaticCase.GENITIVE,        "расхаживания без штанов"),
                            Pair(GrammaticCase.DATIVE,          "расхаживанию без штанов"),
                            Pair(GrammaticCase.ACCUSATIVE,      "расхаживание без штанов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "расхаживанием без штанов"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "расхаживании без штанов")
                    )
            ),
            // пердеж со случайным испражнением
            WhiteCard(
                    id = 331,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пердёж с подливой"),
                            Pair(GrammaticCase.GENITIVE,        "пердежа с подливой"),
                            Pair(GrammaticCase.DATIVE,          "пердежу с подливой"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пердёж с подливой"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пердежом с подливой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пердеже с подливой")
                    )
            ),
            WhiteCard(
                    id = 332,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "слово-воробей"),
                            Pair(GrammaticCase.GENITIVE,        "слова-воробья"),
                            Pair(GrammaticCase.DATIVE,          "слову-воробью"),
                            Pair(GrammaticCase.ACCUSATIVE,      "слово-воробья"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "словом-воробьём"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "слове-воробье")
                    )
            ),
            WhiteCard(
                    id = 333,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мёртвые зародыши"),
                            Pair(GrammaticCase.GENITIVE,        "мёртвых зародышей"),
                            Pair(GrammaticCase.DATIVE,          "мёртвым зародышам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мёртвых зародышей"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мёртвыми зародышами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мёртвых зародышах")
                    )
            ),
            WhiteCard(
                    id = 334,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "крайняя плоть"),
                            Pair(GrammaticCase.GENITIVE,        "крайней плоти"),
                            Pair(GrammaticCase.DATIVE,          "крайней плоти"),
                            Pair(GrammaticCase.ACCUSATIVE,      "крайнюю плоть"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "крайней плотью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "крайней плоти")
                    )
            ),
            WhiteCard(
                    id = 335,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "соло на саксофоне"),
                            Pair(GrammaticCase.GENITIVE,        "соло на саксофоне"),
                            Pair(GrammaticCase.DATIVE,          "соло на саксофоне"),
                            Pair(GrammaticCase.ACCUSATIVE,      "соло на саксофоне"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "соло на саксофоне"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "соло на саксофоне")
                    )
            ),
            WhiteCard(
                    id = 336,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "итальянцы"),
                            Pair(GrammaticCase.GENITIVE,        "итальянцев"),
                            Pair(GrammaticCase.DATIVE,          "итальянцам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "итальянцев"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "итальянцами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "итальянцах")
                    )
            ),
            WhiteCard(
                    id = 337,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "зародыш"),
                            Pair(GrammaticCase.GENITIVE,        "зародыша"),
                            Pair(GrammaticCase.DATIVE,          "зародышу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "зародыш"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "зародышем"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "зародыше")
                    )
            ),
            // выстрел в воздух, яйца во рту свиньи
            WhiteCard(
                    id = 338,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "выстрел в воздух"),
                            Pair(GrammaticCase.GENITIVE,        "выстрела в воздух"),
                            Pair(GrammaticCase.DATIVE,          "выстрелу в воздух"),
                            Pair(GrammaticCase.ACCUSATIVE,      "выстрел в воздух"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "выстрелом в воздух"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "выстреле в воздух")
                    )
            ),
            WhiteCard(
                    id = 339,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Александр Лукашенко"),
                            Pair(GrammaticCase.GENITIVE,        "Александра Лукашенко"),
                            Pair(GrammaticCase.DATIVE,          "Александру Лукашенко"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Александра Лукашенко"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Александром Лукашенко"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Александре Лукашенко")
                    )
            ),
            WhiteCard(
                    id = 340,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "люди без конечностей"),
                            Pair(GrammaticCase.GENITIVE,        "людей без конечностей"),
                            Pair(GrammaticCase.DATIVE,          "людям без конечностей"),
                            Pair(GrammaticCase.ACCUSATIVE,      "людей без конечностей"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "людьми без конечностей"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "людях без конечностей")
                    )
            ),



            WhiteCard(
                    id = 341,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "евгеника"),
                            Pair(GrammaticCase.GENITIVE,        "евгеники"),
                            Pair(GrammaticCase.DATIVE,          "евгенике"),
                            Pair(GrammaticCase.ACCUSATIVE,      "евгенику"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "евгеникой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "евгенике")
                    )
            ),
            WhiteCard(
                    id = 342,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "моё семейное положение"),
                            Pair(GrammaticCase.GENITIVE,        "моего семейного положения"),
                            Pair(GrammaticCase.DATIVE,          "моему семейному положению"),
                            Pair(GrammaticCase.ACCUSATIVE,      "моё семейное положение"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "моим семейным положением"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "моём семейном положении")
                    )
            ),
            // без этого я бы никогда не погуглил "джигурда склонение"
            WhiteCard(
                    id = 343,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Никита Джигурда"),
                            Pair(GrammaticCase.GENITIVE,        "Никиты Джигурды"),
                            Pair(GrammaticCase.DATIVE,          "Никите Джигурде"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Никиту Джигурду"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Никитой Джигурдой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Никите Джигурде")
                    )
            ),
            WhiteCard(
                    id = 344,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пчёлы"),
                            Pair(GrammaticCase.GENITIVE,        "пчёл"),
                            Pair(GrammaticCase.DATIVE,          "пчёлам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пчёл"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пчёлами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пчёлах")
                    )
            ),
            // эротическая серия "гарри поттер"
            WhiteCard(
                    id = 345,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "серия игрушек для взрослых «Гарри Поттер»"),
                            Pair(GrammaticCase.GENITIVE,        "серии игрушек для взрослых «Гарри Поттер»"),
                            Pair(GrammaticCase.DATIVE,          "серии игрушек для взрослых «Гарри Поттер»"),
                            Pair(GrammaticCase.ACCUSATIVE,      "серию игрушек для взрослых «Гарри Поттер»"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "серией игрушек для взрослых «Гарри Поттер»"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "серии игрушек для взрослых «Гарри Поттер»")
                    )
            ),
            WhiteCard(
                    id = 346,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "штурмовой отряд"),
                            Pair(GrammaticCase.GENITIVE,        "штурмовго отряда"),
                            Pair(GrammaticCase.DATIVE,          "штурмовму отряду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "штурмовой отряд"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "штурмовым отрядом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "штурмовом отряде")
                    )
            ),
            WhiteCard(
                    id = 347,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "алкогольная интоксикация от средства для полоскания ротовой полости"),
                            Pair(GrammaticCase.GENITIVE,        "алкогольной интоксикации от средства для полоскания ротовой полости"),
                            Pair(GrammaticCase.DATIVE,          "алкогольной интоксикации от средства для полоскания ротовой полости"),
                            Pair(GrammaticCase.ACCUSATIVE,      "алкогольную интоксикацию от средства для полоскания ротовой полости"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "алкогольной интоксикацией от средства для полоскания ротовой полости"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "алкогольной интоксикации от средства для полоскания ротовой полости")
                    )
            ),
            WhiteCard(
                    id = 348,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "нацисты"),
                            Pair(GrammaticCase.GENITIVE,        "нацистов"),
                            Pair(GrammaticCase.DATIVE,          "нацистам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "нацистов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "нацистами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "нацистах")
                    )
            ),
            WhiteCard(
                    id = 349,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "200 грамм отборного мексиканского героина"),
                            Pair(GrammaticCase.GENITIVE,        "200 грамм отборного мексиканского героина"),
                            Pair(GrammaticCase.DATIVE,          "200 граммам отборного мексиканского героина"),
                            Pair(GrammaticCase.ACCUSATIVE,      "200 грамм отборного мексиканского героина"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "200 граммами отборного мексиканского героина"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "200 граммах отборного мексиканского героина")
                    )
            ),
            WhiteCard(
                    id = 350,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пошлые фразочки Евгения Петросяна"),
                            Pair(GrammaticCase.GENITIVE,        "пошлых фразочек Евгения Петросяна"),
                            Pair(GrammaticCase.DATIVE,          "пошлым фразочкам Евгения Петросяна"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пошлые фразочки Евгения Петросяна"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пошлыми фразочками Евгения Петросяна"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пошлых фразочках Евгения Петросяна")
                    )
            ),
            // мёртвые родители - это уже слишком
            WhiteCard(
                    id = 351,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мёртвые проститутки"),
                            Pair(GrammaticCase.GENITIVE,        "мёртвых проституток"),
                            Pair(GrammaticCase.DATIVE,          "мёртвым проституткам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мёртвых проституток"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мёртвыми проститутками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мёртвых проститутках")
                    )
            ),
            WhiteCard(
                    id = 352,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "объективная перманентность"),
                            Pair(GrammaticCase.GENITIVE,        "объективной перманентности"),
                            Pair(GrammaticCase.DATIVE,          "объективной перманентности"),
                            Pair(GrammaticCase.ACCUSATIVE,      "объективную перманентность"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "объективной перманентностью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "объективной перманентности")
                    )
            ),
            WhiteCard(
                    id = 353,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "отстоящий большой палец"),
                            Pair(GrammaticCase.GENITIVE,        "отстоящего большого пальца"),
                            Pair(GrammaticCase.DATIVE,          "отстоящему большому пальцу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "отстоящий большой палец"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "отстоящим большим пальцем"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "отстоящем большом пальце")
                    )
            ),
            WhiteCard(
                    id = 354,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "расистские вопросы на вступительных экзаменах"),
                            Pair(GrammaticCase.GENITIVE,        "расистских вопросов на вступительных экзаменах"),
                            Pair(GrammaticCase.DATIVE,          "расистским вопросам на вступительных экзаменах"),
                            Pair(GrammaticCase.ACCUSATIVE,      "расистские вопросы на вступительных экзаменах"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "расистскими вопросами на вступительных экзаменах"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "расистских вопросов на вступительных экзаменах")
                    )
            ),
            WhiteCard(
                    id = 355,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "руки-бензопилы"),
                            Pair(GrammaticCase.GENITIVE,        "рук-бензопил"),
                            Pair(GrammaticCase.DATIVE,          "рукам-бензопилам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "руки-бензопилы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "руками-бензопилами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "руках-бензопилах")
                    )
            ),
            WhiteCard(
                    id = 356,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Николас Кейдж"),
                            Pair(GrammaticCase.GENITIVE,        "Николаса Кейджа"),
                            Pair(GrammaticCase.DATIVE,          "Николасу Кейджу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Николаса Кейджа"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Николасом Кейджем"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Николасе Кейдже")
                    )
            ),
            WhiteCard(
                    id = 357,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "детский конкурс красоты"),
                            Pair(GrammaticCase.GENITIVE,        "детского конкурса красоты"),
                            Pair(GrammaticCase.DATIVE,          "детскому конкурсу красоты"),
                            Pair(GrammaticCase.ACCUSATIVE,      "детский конкурс красоты"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "детским конкурсом красоты"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "детском конкурсе красоты")
                    )
            ),
            WhiteCard(
                    id = 358,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "взрывы"),
                            Pair(GrammaticCase.GENITIVE,        "взрывов"),
                            Pair(GrammaticCase.DATIVE,          "взрывам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "взрывы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "взрывами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "взрывах")
                    )
            ),
            WhiteCard(
                    id = 359,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "токсикомания"),
                            Pair(GrammaticCase.GENITIVE,        "токсикомании"),
                            Pair(GrammaticCase.DATIVE,          "токсикомании"),
                            Pair(GrammaticCase.ACCUSATIVE,      "токсикоманию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "токсикоманией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "токсикомании")
                    )
            ),
            WhiteCard(
                    id = 360,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Владимир Винокур, наполненный гелием"),
                            Pair(GrammaticCase.GENITIVE,        "Владимира Винокура, наполненного гелием"),
                            Pair(GrammaticCase.DATIVE,          "Владимиру Винокуру, наполненному гелием"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Владимира Винокура, наполненного гелием"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Владимиром Винокуром, наполненным гелием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Владимире Винокуре, наполненном гелием")
                    )
            ),



            WhiteCard(
                    id = 361,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "репрессии"),
                            Pair(GrammaticCase.GENITIVE,        "репрессий"),
                            Pair(GrammaticCase.DATIVE,          "репрессиям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "репрессии"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "репрессиями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "репрессиях")
                    )
            ),
            WhiteCard(
                    id = 362,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "наркотики, подсыпанные в напиток"),
                            Pair(GrammaticCase.GENITIVE,        "наркотиков, подсыпанных в напиток"),
                            Pair(GrammaticCase.DATIVE,          "наркотикам, подсыпанным в напиток"),
                            Pair(GrammaticCase.ACCUSATIVE,      "наркотики, подсыпанные в напиток"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "наркотиками, подсыпанными в напиток"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "наркотиках, подсыпанных в напиток")
                    )
            ),
            WhiteCard(
                    id = 363,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "моя вагина"),
                            Pair(GrammaticCase.GENITIVE,        "моей вагины"),
                            Pair(GrammaticCase.DATIVE,          "моей вагине"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мою́ вагину"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "моей вагиной"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "моей вагине")
                    )
            ),
            WhiteCard(
                    id = 364,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "кожаные штаны"),
                            Pair(GrammaticCase.GENITIVE,        "кожаных штанов"),
                            Pair(GrammaticCase.DATIVE,          "кожаным штанам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "кожаные штаны"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "кожаными штанами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "кожаных штанах")
                    )
            ),
            WhiteCard(
                    id = 365,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "преступление и наказание"),
                            Pair(GrammaticCase.GENITIVE,        "преступления и наказания"),
                            Pair(GrammaticCase.DATIVE,          "преступлению и наказанию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "преступление и наказание"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "преступлением и наказанием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "преступлении и наказании")
                    )
            ),
            WhiteCard(
                    id = 366,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "110% отдачи"),
                            Pair(GrammaticCase.GENITIVE,        "110% отдачи"),
                            Pair(GrammaticCase.DATIVE,          "110% отдачи"),
                            Pair(GrammaticCase.ACCUSATIVE,      "110% отдачи"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "110% отдачи"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "110% отдачи")
                    )
            ),
            WhiteCard(
                    id = 367,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Её Величество Королева Елизавета II"),
                            Pair(GrammaticCase.GENITIVE,        "Её Величества Королевы Елизаветы II"),
                            Pair(GrammaticCase.DATIVE,          "Её Величеству Королеве Елизавете II"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Её Величество Королеву Елизавету II"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Её Величеством Королевой Елизаветой II"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Её Величестве Королеве Елизавете II")
                    )
            ),
            WhiteCard(
                    id = 368,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ссылка в Сибирь"),
                            Pair(GrammaticCase.GENITIVE,        "ссылки в Сибирь"),
                            Pair(GrammaticCase.DATIVE,          "ссылке в Сибирь"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ссылку в Сибирь"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ссылкой в Сибирь"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "ссылке в Сибирь")
                    )
            ),
            WhiteCard(
                    id = 369,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "маргинальность"),
                            Pair(GrammaticCase.GENITIVE,        "маргинальности"),
                            Pair(GrammaticCase.DATIVE,          "маргинальности"),
                            Pair(GrammaticCase.ACCUSATIVE,      "маргинальность"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "маргинальностью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "маргинальности")
                    )
            ),
            WhiteCard(
                    id = 370,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "гоблины"),
                            Pair(GrammaticCase.GENITIVE,        "гоблинов"),
                            Pair(GrammaticCase.DATIVE,          "гоблинам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "гоблинов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "гоблинами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "гоблинах")
                    )
            ),
            WhiteCard(
                    id = 371,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "надежда"),
                            Pair(GrammaticCase.GENITIVE,        "надежды"),
                            Pair(GrammaticCase.DATIVE,          "надежде"),
                            Pair(GrammaticCase.ACCUSATIVE,      "надежду"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "надеждой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "надежде")
                    )
            ),
            WhiteCard(
                    id = 372,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Мартин Лютер Кинг"),
                            Pair(GrammaticCase.GENITIVE,        "Мартина Лютера Кинга"),
                            Pair(GrammaticCase.DATIVE,          "Мартину Лютеру Кингу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Мартина Лютера Кинга"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Мартином Лютером Кингом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Мартине Лютере Кинге")
                    )
            ),
            WhiteCard(
                    id = 373,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "микропенис"),
                            Pair(GrammaticCase.GENITIVE,        "микропениса"),
                            Pair(GrammaticCase.DATIVE,          "микропенису"),
                            Pair(GrammaticCase.ACCUSATIVE,      "микропенис"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "микропенисом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "микропенисе")
                    )
            ),
            WhiteCard(
                    id = 374,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "моя душа"),
                            Pair(GrammaticCase.GENITIVE,        "моей души"),
                            Pair(GrammaticCase.DATIVE,          "моей душе"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мою́ душу"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "моей душой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "моей душе")
                    )
            ),
            WhiteCard(
                    id = 375,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "обманчивая внешность"),
                            Pair(GrammaticCase.GENITIVE,        "обманчивой внешности"),
                            Pair(GrammaticCase.DATIVE,          "обманчивой внешности"),
                            Pair(GrammaticCase.ACCUSATIVE,      "обманчивую внешность"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "обманчивой внешностью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "обманчивой внешности")
                    )
            ),
            WhiteCard(
                    id = 376,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "викинги"),
                            Pair(GrammaticCase.GENITIVE,        "викингов"),
                            Pair(GrammaticCase.DATIVE,          "викингам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "викингов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "викингами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "викингах")
                    )
            ),
            WhiteCard(
                    id = 377,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сексуальные люди"),
                            Pair(GrammaticCase.GENITIVE,        "сексуальных людей"),
                            Pair(GrammaticCase.DATIVE,          "сексуальным людям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сексуальных людей"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сексуальными людьми"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сексуальных людях")
                    )
            ),
            WhiteCard(
                    id = 378,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "искусство соблазнения"),
                            Pair(GrammaticCase.GENITIVE,        "искусстве соблазнения"),
                            Pair(GrammaticCase.DATIVE,          "искусству соблазнения"),
                            Pair(GrammaticCase.ACCUSATIVE,      "искусство соблазнения"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "искусством соблазнения"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "искусстве соблазнения")
                    )
            ),
            WhiteCard(
                    id = 379,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Эдипов комплекс"),
                            Pair(GrammaticCase.GENITIVE,        "Эдипова комплекса"),
                            Pair(GrammaticCase.DATIVE,          "Эдипову комплексу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Эдипов комплекс"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Эдиповым комплексом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Эдиповом комплексе")
                    )
            ),
            WhiteCard(
                    id = 380,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "гуси"),
                            Pair(GrammaticCase.GENITIVE,        "гусей"),
                            Pair(GrammaticCase.DATIVE,          "гусям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "гусей"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "гусями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "гусях")
                    )
            ),



            WhiteCard(
                    id = 381,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "очень обтягивающие брюки"),
                            Pair(GrammaticCase.GENITIVE,        "очень обтягивающих брюк"),
                            Pair(GrammaticCase.DATIVE,          "очень обтягивающим брюкам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "очень обтягивающие брюки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "очень обтягивающими брюками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "очень обтягивающих брюках")
                    )
            ),
            WhiteCard(
                    id = 382,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "музыка нью эйдж"),
                            Pair(GrammaticCase.GENITIVE,        "музыки нью эйдж"),
                            Pair(GrammaticCase.DATIVE,          "музыке нью эйдж"),
                            Pair(GrammaticCase.ACCUSATIVE,      "музыку нью эйдж"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "музыкой нью эйдж"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "музыке нью эйдж")
                    )
            ),
            WhiteCard(
                    id = 383,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "блинчики с начинкой"),
                            Pair(GrammaticCase.GENITIVE,        "блинчиков с начинкой"),
                            Pair(GrammaticCase.DATIVE,          "блинчикам с начинкой"),
                            Pair(GrammaticCase.ACCUSATIVE,      "блинчики с начинкой"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "блинчиками с начинкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "блинчиках с начинкой")
                    )
            ),
            WhiteCard(
                    id = 384,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "скривлённая рожица"),
                            Pair(GrammaticCase.GENITIVE,        "скривлённой рожици"),
                            Pair(GrammaticCase.DATIVE,          "скривлённой рожице"),
                            Pair(GrammaticCase.ACCUSATIVE,      "скривлённую рожицу"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "скривлённой рожицей"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "скривлённой рожице")
                    )
            ),
            WhiteCard(
                    id = 385,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "убийство в результате нетрезвого вождения"),
                            Pair(GrammaticCase.GENITIVE,        "убийства в результате нетрезвого вождения"),
                            Pair(GrammaticCase.DATIVE,          "убийству в результате нетрезвого вождения"),
                            Pair(GrammaticCase.ACCUSATIVE,      "убийство в результате нетрезвого вождения"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "убийством в результате нетрезвого вождения"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "убийстве в результате нетрезвого вождения")
                    )
            ),
            WhiteCard(
                    id = 386,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "женское избирательное право"),
                            Pair(GrammaticCase.GENITIVE,        "женского избирательного права"),
                            Pair(GrammaticCase.DATIVE,          "женскому избирательному праву"),
                            Pair(GrammaticCase.ACCUSATIVE,      "женское избирательное право"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "женским избирательным правом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "женском избирательном праве")
                    )
            ),
            WhiteCard(
                    id = 387,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мистер Бин"),
                            Pair(GrammaticCase.GENITIVE,        "мистера Бина"),
                            Pair(GrammaticCase.DATIVE,          "мистеру Бину"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мистера Бина"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мистером Бином"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мистере Бине")
                    )
            ),
            WhiteCard(
                    id = 388,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "бракованый презерватив"),
                            Pair(GrammaticCase.GENITIVE,        "бракованого презерватива"),
                            Pair(GrammaticCase.DATIVE,          "бракованому презервативу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "бракованый презерватив"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "бракованым презервативом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "бракованом презервативе")
                    )
            ),
            WhiteCard(
                    id = 389,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "дети Африки"),
                            Pair(GrammaticCase.GENITIVE,        "детей Африки"),
                            Pair(GrammaticCase.DATIVE,          "детям Африки"),
                            Pair(GrammaticCase.ACCUSATIVE,      "детей Африки"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "детьми Африки"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "детях Африки")
                    )
            ),
            WhiteCard(
                    id = 390,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "массовое убийство"),
                            Pair(GrammaticCase.GENITIVE,        "массового убийства"),
                            Pair(GrammaticCase.DATIVE,          "массовому убийству"),
                            Pair(GrammaticCase.ACCUSATIVE,      "массовое убийство"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "массовым убийством"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "массовом убийстве")
                    )
            ),
            WhiteCard(
                    id = 391,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Барак Обама"),
                            Pair(GrammaticCase.GENITIVE,        "Барака Обамы"),
                            Pair(GrammaticCase.DATIVE,          "Бараку Обаме"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Барака Обаму"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Бараком Обамой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Бараке Обаме")
                    )
            ),
            WhiteCard(
                    id = 392,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "азиаты с гуманитарным складом ума"),
                            Pair(GrammaticCase.GENITIVE,        "азиатов с гуманитарным складом ума"),
                            Pair(GrammaticCase.DATIVE,          "азиатам с гуманитарным складом ума"),
                            Pair(GrammaticCase.ACCUSATIVE,      "азиатов с гуманитарным складом ума"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "азиатами с гуманитарным складом ума"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "азиатах с гуманитарным складом ума")
                    )
            ),
            WhiteCard(
                    id = 393,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "престарелые японцы"),
                            Pair(GrammaticCase.GENITIVE,        "престарелых японцев"),
                            Pair(GrammaticCase.DATIVE,          "престарелым японцам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "престарелых японцев"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "престарелыми японцами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "престарелых японцах")
                    )
            ),
            WhiteCard(
                    id = 394,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "женский оргазм"),
                            Pair(GrammaticCase.GENITIVE,        "женского оргазма"),
                            Pair(GrammaticCase.DATIVE,          "женскому оргазму"),
                            Pair(GrammaticCase.ACCUSATIVE,      "женский оргазм"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "женским оргазмом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "женском оргазме")
                    )
            ),
            WhiteCard(
                    id = 395,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "гетеронормативность"),
                            Pair(GrammaticCase.GENITIVE,        "гетеронормативности"),
                            Pair(GrammaticCase.DATIVE,          "гетеронормативности"),
                            Pair(GrammaticCase.ACCUSATIVE,      "гетеронормативность"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "гетеронормативностью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "гетеронормативности")
                    )
            ),
            WhiteCard(
                    id = 396,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "разделение Красного Моря"),
                            Pair(GrammaticCase.GENITIVE,        "разделения Красного Моря"),
                            Pair(GrammaticCase.DATIVE,          "разделению Красного Моря"),
                            Pair(GrammaticCase.ACCUSATIVE,      "разделение Красного Моря"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "разделением Красного Моря"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "разделении Красного Моря")
                    )
            ),
            WhiteCard(
                    id = 397,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Арнольд Шварценеггер"),
                            Pair(GrammaticCase.GENITIVE,        "Арнольда Шварценеггера"),
                            Pair(GrammaticCase.DATIVE,          "Арнольду Шварценеггеру"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Арнольда Шварценеггера"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Арнольдом Шварценеггером"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Арнольде Шварценеггере")
                    )
            ),
            WhiteCard(
                    id = 398,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "минет на дороге"),
                            Pair(GrammaticCase.GENITIVE,        "минета на дороге"),
                            Pair(GrammaticCase.DATIVE,          "минету на дороге"),
                            Pair(GrammaticCase.ACCUSATIVE,      "минет на дороге"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "минетом на дороге"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "минете на дороге")
                    )
            ),
            WhiteCard(
                    id = 399,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "завидный пресс"),
                            Pair(GrammaticCase.GENITIVE,        "завидного пресса"),
                            Pair(GrammaticCase.DATIVE,          "завидному прессу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "завидный пресс"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "завидным прессом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "завидном прессе")
                    )
            ),
            WhiteCard(
                    id = 400,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "морковный пирог"),
                            Pair(GrammaticCase.GENITIVE,        "морковного пирога"),
                            Pair(GrammaticCase.DATIVE,          "морковному пирогу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "морковный пирог"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "морковным пирогом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "морковном пироге")
                    )
            ),



            WhiteCard(
                    id = 401,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "угрюмый лев из зоопарка"),
                            Pair(GrammaticCase.GENITIVE,        "угрюмого льва из зоопарка"),
                            Pair(GrammaticCase.DATIVE,          "угрюмому льву из зоопарка"),
                            Pair(GrammaticCase.ACCUSATIVE,      "угрюмого льва из зоопарка"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "угрюмым львом из зоопарка"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "угрюмом льве из зоопарка")
                    )
            ),
            WhiteCard(
                    id = 402,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мешочек волшебных бобов"),
                            Pair(GrammaticCase.GENITIVE,        "мешочка волшебных бобов"),
                            Pair(GrammaticCase.DATIVE,          "мешочку волшебных бобов"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мешочек волшебных бобов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мешочком волшебных бобов"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мешочке волшебных бобов")
                    )
            ),
            WhiteCard(
                    id = 403,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "неправильный жизненный выбор"),
                            Pair(GrammaticCase.GENITIVE,        "неправильного жизненного выбора"),
                            Pair(GrammaticCase.DATIVE,          "неправильному жизненному выбору"),
                            Pair(GrammaticCase.ACCUSATIVE,      "неправильный жизненный выбор"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "неправильным жизненным выбором"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "неправильном жизненном выборе")
                    )
            ),
            WhiteCard(
                    id = 404,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "моя половая жизнь"),
                            Pair(GrammaticCase.GENITIVE,        "моей половой жизни"),
                            Pair(GrammaticCase.DATIVE,          "моей половой жизни"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мою половую жизнь"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "моей половой жизнью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "моей половой жизни")
                    )
            ),
            WhiteCard(
                    id = 405,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Освенцим"),
                            Pair(GrammaticCase.GENITIVE,        "Освенциме"),
                            Pair(GrammaticCase.DATIVE,          "Освенциму"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Освенцим"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Освенцимом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Освенциме")
                    )
            ),
            WhiteCard(
                    id = 406,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "черепаха, на которой держится мир"),
                            Pair(GrammaticCase.GENITIVE,        "черепахи, на которой держится мир"),
                            Pair(GrammaticCase.DATIVE,          "черепахе, на которой держится мир"),
                            Pair(GrammaticCase.ACCUSATIVE,      "черепаху, на которой держится мир"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "черепахой, на которой держится мир"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "черепахе, на которой держится мир")
                    )
            ),
            WhiteCard(
                    id = 407,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "термоядерная детонация"),
                            Pair(GrammaticCase.GENITIVE,        "термоядерной детонации"),
                            Pair(GrammaticCase.DATIVE,          "термоядерной детонации"),
                            Pair(GrammaticCase.ACCUSATIVE,      "термоядерную детонацию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "термоядерной детонацией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "термоядерной детонации")
                    )
            ),
            WhiteCard(
                    id = 408,
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
                    id = 409,
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
                    id = 410,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мины"),
                            Pair(GrammaticCase.GENITIVE,        "мин"),
                            Pair(GrammaticCase.DATIVE,          "минам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мины"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "минами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "минах")
                    )
            ),
            WhiteCard(
                    id = 411,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "хор мормонов"),
                            Pair(GrammaticCase.GENITIVE,        "хора мормонов"),
                            Pair(GrammaticCase.DATIVE,          "хору мормонов"),
                            Pair(GrammaticCase.ACCUSATIVE,      "хор мормонов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "хором мормонов"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "хоре мормонов")
                    )
            ),
            WhiteCard(
                    id = 412,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "маленькая свинка в дождевике и резиновых сапожках"),
                            Pair(GrammaticCase.GENITIVE,        "маленькой свинки в дождевике и резиновых сапожках"),
                            Pair(GrammaticCase.DATIVE,          "маленькой свинке в дождевике и резиновых сапожках"),
                            Pair(GrammaticCase.ACCUSATIVE,      "маленькую свинку в дождевике и резиновых сапожках"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "маленькой свинкой в дождевике и резиновых сапожках"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "маленькой свинке в дождевике и резиновых сапожках")
                    )
            ),
            WhiteCard(
                    id = 413,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "песня Эльзы"),
                            Pair(GrammaticCase.GENITIVE,        "песни Эльзы"),
                            Pair(GrammaticCase.DATIVE,          "песне Эльзы"),
                            Pair(GrammaticCase.ACCUSATIVE,      "песню Эльзы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "песней Эльзы"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "песне Эльзы")
                    )
            ),
            WhiteCard(
                    id = 414,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "лужа детских слёз"),
                            Pair(GrammaticCase.GENITIVE,        "лужи детских слёз"),
                            Pair(GrammaticCase.DATIVE,          "луже детских слёз"),
                            Pair(GrammaticCase.ACCUSATIVE,      "лужу детских слёз"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "лужей детских слёз"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "луже детских слёз")
                    )
            ),
            WhiteCard(
                    id = 415,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "человеческое мясо"),
                            Pair(GrammaticCase.GENITIVE,        "человеческого мяса"),
                            Pair(GrammaticCase.DATIVE,          "человеческому мясу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "человеческое мясо"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "человеческим мясом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "человеческом мясе")
                    )
            ),
            WhiteCard(
                    id = 416,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "время на себя"),
                            Pair(GrammaticCase.GENITIVE,        "времени на себя"),
                            Pair(GrammaticCase.DATIVE,          "времени на себя"),
                            Pair(GrammaticCase.ACCUSATIVE,      "время на себя"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "временем на себя"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "времени на себя")
                    )
            ),
            WhiteCard(
                    id = 417,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "метро"),
                            Pair(GrammaticCase.GENITIVE,        "метро"),
                            Pair(GrammaticCase.DATIVE,          "метро"),
                            Pair(GrammaticCase.ACCUSATIVE,      "метро"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "метро"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "метро")
                    )
            ),
            WhiteCard(
                    id = 418,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "неуместные шутки о Холокосте"),
                            Pair(GrammaticCase.GENITIVE,        "неуместных шуток о Холокосте"),
                            Pair(GrammaticCase.DATIVE,          "неуместным шуткам о Холокосте"),
                            Pair(GrammaticCase.ACCUSATIVE,      "неуместные шутки о Холокосте"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "неуместными шутками о Холокосте"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "неуместных шутках о Холокосте")
                    )
            ),
            WhiteCard(
                    id = 419,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "море проблем"),
                            Pair(GrammaticCase.GENITIVE,        "моря проблем"),
                            Pair(GrammaticCase.DATIVE,          "морю проблем"),
                            Pair(GrammaticCase.ACCUSATIVE,      "море проблем"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "морем проблем"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "море проблем")
                    )
            ),
            WhiteCard(
                    id = 420,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "фантазии лесоруба"),
                            Pair(GrammaticCase.GENITIVE,        "фантазий лесоруба"),
                            Pair(GrammaticCase.DATIVE,          "фантазиям лесоруба"),
                            Pair(GrammaticCase.ACCUSATIVE,      "фантазии лесоруба"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "фантазиями лесоруба"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "фантазиях лесоруба")
                    )
            ),



            WhiteCard(
                    id = 421,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "голос Николая Дроздова"),
                            Pair(GrammaticCase.GENITIVE,        "голоса Николая Дроздова"),
                            Pair(GrammaticCase.DATIVE,          "голосу Николая Дроздова"),
                            Pair(GrammaticCase.ACCUSATIVE,      "голос Николая Дроздова"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "голосом Николая Дроздова"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "голосе Николая Дроздова")
                    )
            ),
            WhiteCard(
                    id = 422,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "женщины в рекламе йогуртов"),
                            Pair(GrammaticCase.GENITIVE,        "женщин в рекламе йогуртов"),
                            Pair(GrammaticCase.DATIVE,          "женщинам в рекламе йогуртов"),
                            Pair(GrammaticCase.ACCUSATIVE,      "женщин в рекламе йогуртов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "женщинами в рекламе йогуртов"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "женщинах в рекламе йогуртов")
                    )
            ),
            WhiteCard(
                    id = 423,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "натуральные добавки для мужской силы"),
                            Pair(GrammaticCase.GENITIVE,        "натуральных добавок для мужской силы"),
                            Pair(GrammaticCase.DATIVE,          "натуральным добавкам для мужской силы"),
                            Pair(GrammaticCase.ACCUSATIVE,      "натуральные добавки для мужской силы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "натуральными добавками для мужской силы"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "натуральных добавках для мужской силы")
                    )
            ),
            WhiteCard(
                    id = 424,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "чёртов волшебник"),
                            Pair(GrammaticCase.GENITIVE,        "чёртова волшебника"),
                            Pair(GrammaticCase.DATIVE,          "чёртову волшебнику"),
                            Pair(GrammaticCase.ACCUSATIVE,      "чёртова волшебника"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "чёртовым волшебником"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "чёртовом волшебнике")
                    )
            ),
            WhiteCard(
                    id = 425,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "интимный пирсинг"),
                            Pair(GrammaticCase.GENITIVE,        "интимного пирсинга"),
                            Pair(GrammaticCase.DATIVE,          "интимному пирсингу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "интимный пирсинг"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "интимным пирсингом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "интимном пирсинге")
                    )
            ),
            WhiteCard(
                    id = 426,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "гармоничный трансвестит"),
                            Pair(GrammaticCase.GENITIVE,        "гармоничного трансвестита"),
                            Pair(GrammaticCase.DATIVE,          "гармоничному трансвеститу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "гармоничного трансвестита"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "гармоничным трансвеститом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "гармоничном трансвестите")
                    )
            ),
            WhiteCard(
                    id = 427,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "сексуальный бой подушками"),
                            Pair(GrammaticCase.GENITIVE,        "сексуального боя подушками"),
                            Pair(GrammaticCase.DATIVE,          "сексуальному бою подушками"),
                            Pair(GrammaticCase.ACCUSATIVE,      "сексуальный бой подушками"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сексуальным боем подушками"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сексуальном бое подушками")
                    )
            ),
            WhiteCard(
                    id = 428,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "яйца"),
                            Pair(GrammaticCase.GENITIVE,        "яиц"),
                            Pair(GrammaticCase.DATIVE,          "яйцам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "яйца"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "яйцами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "яйцах")
                    )
            ),
            WhiteCard(
                    id = 429,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "бабушка"),
                            Pair(GrammaticCase.GENITIVE,        "бабушки"),
                            Pair(GrammaticCase.DATIVE,          "бабушке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "бабушку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "бабушкой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "бабушке")
                    )
            ),
            WhiteCard(
                    id = 430,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "фрикция"),
                            Pair(GrammaticCase.GENITIVE,        "фрикции"),
                            Pair(GrammaticCase.DATIVE,          "фрикции"),
                            Pair(GrammaticCase.ACCUSATIVE,      "фрикцию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "фрикцией"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "фрикции")
                    )
            ),
            WhiteCard(
                    id = 431,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "тайская проститутка"),
                            Pair(GrammaticCase.GENITIVE,        "тайской проститутки"),
                            Pair(GrammaticCase.DATIVE,          "тайской проститутке"),
                            Pair(GrammaticCase.ACCUSATIVE,      "тайскую проститутку"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "тайской проституткой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "тайской проститутке")
                    )
            ),
            WhiteCard(
                    id = 432,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пускание шептуна"),
                            Pair(GrammaticCase.GENITIVE,        "пускания шептуна"),
                            Pair(GrammaticCase.DATIVE,          "пусканию шептуна"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пускание шептуна"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пусканием шептуна"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пускании шептуна")
                    )
            ),
            WhiteCard(
                    id = 433,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "жестокое обращение с детьми"),
                            Pair(GrammaticCase.GENITIVE,        "жестокого обращения с детьми"),
                            Pair(GrammaticCase.DATIVE,          "жестокому обращению с детьми"),
                            Pair(GrammaticCase.ACCUSATIVE,      "жестокое обращение с детьми"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "жестоким обращением с детьми"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "жестоком обращении с детьми")
                    )
            ),
            WhiteCard(
                    id = 434,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "миллиард долларов"),
                            Pair(GrammaticCase.GENITIVE,        "миллиарда долларов"),
                            Pair(GrammaticCase.DATIVE,          "миллиарду долларов"),
                            Pair(GrammaticCase.ACCUSATIVE,      "миллиард долларов"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "миллиардом долларов"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "миллиарде долларов")
                    )
            ),
            WhiteCard(
                    id = 435,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "шведская система улучшения сна"),
                            Pair(GrammaticCase.GENITIVE,        "шведской системы улучшения сна"),
                            Pair(GrammaticCase.DATIVE,          "шведской системе улучшения сна"),
                            Pair(GrammaticCase.ACCUSATIVE,      "шведскую систему улучшения сна"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "шведской системой улучшения сна"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "шведской системе улучшения сна")
                    )
            ),
            WhiteCard(
                    id = 436,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "смерть"),
                            Pair(GrammaticCase.GENITIVE,        "смерти"),
                            Pair(GrammaticCase.DATIVE,          "смерти"),
                            Pair(GrammaticCase.ACCUSATIVE,      "смерть"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "смертью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "смерти")
                    )
            ),
            WhiteCard(
                    id = 437,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "ураган"),
                            Pair(GrammaticCase.GENITIVE,        "урагана"),
                            Pair(GrammaticCase.DATIVE,          "урагану"),
                            Pair(GrammaticCase.ACCUSATIVE,      "ураган"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "ураганом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "урагане")
                    )
            ),
            WhiteCard(
                    id = 438,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "геи"),
                            Pair(GrammaticCase.GENITIVE,        "геев"),
                            Pair(GrammaticCase.DATIVE,          "геям"),
                            Pair(GrammaticCase.ACCUSATIVE,      "геев"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "геями"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "геях")
                    )
            ),
            WhiteCard(
                    id = 439,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "человеческая глупость"),
                            Pair(GrammaticCase.GENITIVE,        "человеческой глупости"),
                            Pair(GrammaticCase.DATIVE,          "человеческой глупости"),
                            Pair(GrammaticCase.ACCUSATIVE,      "человеческую глупость"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "человеческой глупостью"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "человеческой глупости")
                    )
            ),
            WhiteCard(
                    id = 440,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "мужчины"),
                            Pair(GrammaticCase.GENITIVE,        "мужчин"),
                            Pair(GrammaticCase.DATIVE,          "мужчинам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "мужчин"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "мужчинами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "мужчинах")
                    )
            ),



            WhiteCard(
                    id = 441,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "цыгане"),
                            Pair(GrammaticCase.GENITIVE,        "цыган"),
                            Pair(GrammaticCase.DATIVE,          "цыганам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "цыган"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "цыганами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "цыганах")
                    )
            ),
            WhiteCard(
                    id = 442,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "пощёчина"),
                            Pair(GrammaticCase.GENITIVE,        "пощёчины"),
                            Pair(GrammaticCase.DATIVE,          "пощёчине"),
                            Pair(GrammaticCase.ACCUSATIVE,      "пощёчину"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "пощёчиной"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "пощёчине")
                    )
            ),
            WhiteCard(
                    id = 443,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "опухоль мозга"),
                            Pair(GrammaticCase.GENITIVE,        "опухоли мозга"),
                            Pair(GrammaticCase.DATIVE,          "опухоли мозга"),
                            Pair(GrammaticCase.ACCUSATIVE,      "опухоль мозга"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "опухолью мозга"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "опухоли мозга")
                    )
            ),
            WhiteCard(
                    id = 444,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Карты против человечества"),
                            Pair(GrammaticCase.GENITIVE,        "Карт против человечества"),
                            Pair(GrammaticCase.DATIVE,          "Картам против человечества"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Карты против человечества"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Картами против человечества"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Картах против человечества")
                    )
            ),
            WhiteCard(
                    id = 445,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "первобытный страх"),
                            Pair(GrammaticCase.GENITIVE,        "первобытного страха"),
                            Pair(GrammaticCase.DATIVE,          "первобытному страху"),
                            Pair(GrammaticCase.ACCUSATIVE,      "первобытный страх"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "первобытным страхом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "первобытном страхе")
                    )
            ),
            WhiteCard(
                    id = 446,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Леди Гага"),
                            Pair(GrammaticCase.GENITIVE,        "Леди Гаги"),
                            Pair(GrammaticCase.DATIVE,          "Леди Гаге"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Леди Гагу"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Леди Гагой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Леди Гаге")
                    )
            ),
            WhiteCard(
                    id = 447,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "молочник"),
                            Pair(GrammaticCase.GENITIVE,        "молочника"),
                            Pair(GrammaticCase.DATIVE,          "молочнику"),
                            Pair(GrammaticCase.ACCUSATIVE,      "молочника"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "молочником"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "молочнике")
                    )
            ),
            WhiteCard(
                    id = 448,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "балабол"),
                            Pair(GrammaticCase.GENITIVE,        "балабола"),
                            Pair(GrammaticCase.DATIVE,          "балаболу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "балабол"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "балаболом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "балаболе")
                    )
            ),
            WhiteCard(
                    id = 449,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "Холодная война"),
                            Pair(GrammaticCase.GENITIVE,        "Холодной войны"),
                            Pair(GrammaticCase.DATIVE,          "Холодной войне"),
                            Pair(GrammaticCase.ACCUSATIVE,      "Холодную войну"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "Холодной войной"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "Холодной войне")
                    )
            ),
            WhiteCard(
                    id = 450,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "порох в пороховницах"),
                            Pair(GrammaticCase.GENITIVE,        "пороха в пороховницах"),
                            Pair(GrammaticCase.DATIVE,          "пороху в пороховницах"),
                            Pair(GrammaticCase.ACCUSATIVE,      "порох в пороховницах"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "порохом в пороховницах"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "порохе в пороховницах")
                    )
            ),
            WhiteCard(
                    id = 451,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "совет чернокожего старца"),
                            Pair(GrammaticCase.GENITIVE,        "совета чернокожего старца"),
                            Pair(GrammaticCase.DATIVE,          "совету чернокожего старца"),
                            Pair(GrammaticCase.ACCUSATIVE,      "совет чернокожего старца"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "советом чернокожего старца"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "совете чернокожего старца")
                    )
            ),
            WhiteCard(
                    id = 452,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "уродливое лицо"),
                            Pair(GrammaticCase.GENITIVE,        "уродливого лица"),
                            Pair(GrammaticCase.DATIVE,          "уродливому лицу"),
                            Pair(GrammaticCase.ACCUSATIVE,      "уродливое лицо"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "уродливым лицом"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "уродливом лице")
                    )
            ),
            WhiteCard(
                    id = 453,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "превращение в ягоду"),
                            Pair(GrammaticCase.GENITIVE,        "превращения в ягоду"),
                            Pair(GrammaticCase.DATIVE,          "превращению в ягоду"),
                            Pair(GrammaticCase.ACCUSATIVE,      "превращение в ягоду"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "превращением в ягоду"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "превращении в ягоду")
                    )
            ),
            WhiteCard(
                    id = 454,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "остроумные рифмы"),
                            Pair(GrammaticCase.GENITIVE,        "остроумных рифм"),
                            Pair(GrammaticCase.DATIVE,          "остроумным рифмам"),
                            Pair(GrammaticCase.ACCUSATIVE,      "остроумные рифмы"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "остроумными рифмами"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "остроумных рифмах")
                    )
            ),
            WhiteCard(
                    id = 455,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "слабоумие и отвага"),
                            Pair(GrammaticCase.GENITIVE,        "слабоумия и отваги"),
                            Pair(GrammaticCase.DATIVE,          "слабоумию и отваге"),
                            Pair(GrammaticCase.ACCUSATIVE,      "слабоумие и отвагу"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "слабоумием и отвагой"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "слабоумии и отваге")
                    )
            ),
            WhiteCard(
                    id = 456,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "распятие"),
                            Pair(GrammaticCase.GENITIVE,        "распятия"),
                            Pair(GrammaticCase.DATIVE,          "распятию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "распятие"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "распятием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "распятии")
                    )
            ),
            WhiteCard(
                    id = 457,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "всего лишь тишина и спокойствие"),
                            Pair(GrammaticCase.GENITIVE,        "всего лишь тишины и спокойствия"),
                            Pair(GrammaticCase.DATIVE,          "всего лишь тишине и спокойствию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "всего лишь тишину и спокойствие"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "всего лишь тишиной и спокойствием"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "всего лишь тишине и спокойствии")
                    )
            ),
            WhiteCard(
                    id = 458,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "свет тысячи солнц"),
                            Pair(GrammaticCase.GENITIVE,        "света тысячи солнц"),
                            Pair(GrammaticCase.DATIVE,          "свету тысячи солнц"),
                            Pair(GrammaticCase.ACCUSATIVE,      "свет тысячи солнц"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "светом тысячи солнц"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "свете тысячи солнц")
                    )
            ),
            WhiteCard(
                    id = 459,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "секс по обоюдному согласию"),
                            Pair(GrammaticCase.GENITIVE,        "секса по обоюдному согласию"),
                            Pair(GrammaticCase.DATIVE,          "сексу по обоюдному согласию"),
                            Pair(GrammaticCase.ACCUSATIVE,      "секс по обоюдному согласию"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "сексом по обоюдному согласию"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "сексе по обоюдному согласию")
                    )
            ),
            WhiteCard(
                    id = 460,
                    cases = hashMapOf<GrammaticCase, String>(
                            Pair(GrammaticCase.NOMINATIVE,      "уместные шутки о Холокосте"),
                            Pair(GrammaticCase.GENITIVE,        "уместных шуток о Холокосте"),
                            Pair(GrammaticCase.DATIVE,          "уместным шуткам о Холокосте"),
                            Pair(GrammaticCase.ACCUSATIVE,      "уместные шутки о Холокосте"),
                            Pair(GrammaticCase.INSTRUMENTAL,    "уместными шутками о Холокосте"),
                            Pair(GrammaticCase.PREPOSITIONAL,   "уместных шутках о Холокосте")
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