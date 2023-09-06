package com.example.playground.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            RegisteredUser sadig = new RegisteredUser( "Sadig", "sadig.hasansoy@gmail.com", 22, LocalDate.now());
            RegisteredUser vusal = new RegisteredUser("Vusal", "vusal.hasansoy@gmail.com", 26, LocalDate.now());
            repository.saveAll(List.of(sadig, vusal));

        };
    }
}
