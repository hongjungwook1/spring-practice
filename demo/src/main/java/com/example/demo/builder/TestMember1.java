package com.example.demo.builder;

import lombok.Builder;

@Builder
public class TestMember1 {
    private Integer id;
    private String name;
    private int age;
    private String email;

    public String toString() {
        return String.format("TestMember1(id=%s , name=%s , age=%s , email=%s )", id, name, age, email);
    }
}
