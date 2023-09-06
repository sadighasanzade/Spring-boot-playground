package com.example.playground.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<RegisteredUser> getStudent() {
        return repository.findAll();
    }

    public void addNewUser(RegisteredUser user) {
        if(repository.getUserByEmail(user.getEmail()).isPresent()) {
            System.out.println("used email");
            throw new IllegalArgumentException("Email has already registered");
        }
        System.out.println("saved");
        repository.save(user);
    }

    public void deleteUser(Long userId) {
        repository.deleteById(userId);
    }
}
