package com.example.playground.user;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "RegisteredUsers")
public class RegisteredUser {
    @Id
    @SequenceGenerator(name = "registeredUser_sequence",
    sequenceName = "registeredUser_sequence",
    allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "registeredUser_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private int age;
    private LocalDate dob;

    public RegisteredUser() {
    }

    public RegisteredUser(Long id, String name, String email, int age, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public RegisteredUser(String name, String email, int age, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
