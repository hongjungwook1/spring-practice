package com.example.demo.builder;

import lombok.Builder;

public class TestMember4 {
    private Integer id;
    private String name;
    private int age;
    private String email;

    @Builder
    public TestMember4(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return String.format("TestMember1(id=%s , name=%s , age=%s , email=%s )", id, name, age, email);
    }
}
