package com.example.demo.staticFactoryMethod.member;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Member2 {
    private static Member2 instance;

    private Integer id;
    private String name;
    private int age;
    private String email;

    public static Member2 getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Member2();
        }
        return instance;
    }
}
