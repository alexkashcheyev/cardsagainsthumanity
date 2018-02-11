package com.github.alexkashcheyev.cardsagainsthumanity

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer



@SpringBootApplication
class CardsagainsthumanityApplication {

    /* debug only */
    @Bean
    fun corsConfigurer(): WebMvcConfigurer {
        return object : WebMvcConfigurerAdapter() {
            override fun addCorsMappings(registry: CorsRegistry?) {
                registry!!.addMapping("/api/*").allowedOrigins("http://localhost:4200")
            }
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(CardsagainsthumanityApplication::class.java, *args)
}
