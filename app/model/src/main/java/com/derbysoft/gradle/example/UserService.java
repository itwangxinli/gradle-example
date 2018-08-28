package com.derbysoft.gradle.example;

public class UserService {
    public User findByUser(String name) {
        return new User(1L, "wang", 23);
    }
}
