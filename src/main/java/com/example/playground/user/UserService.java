package com.example.playground.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {
    public User getStudent() {
        return new User(1L, "Sadig", "sadig.hasansoy@gmail.com", 22, LocalDate.now());
    }
}
