package com.example.playground.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<RegisteredUser, Long> {

    @Query("SELECT s FROM  RegisteredUser s where s.email = ?1")
    Optional<RegisteredUser> getUserByEmail(String email);
}
