package com.example.pokemongoget

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.test.context.ActiveProfiles

@SpringBootApplication
@ActiveProfiles("test")
class TestApplication {

    static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args)
    }
}
