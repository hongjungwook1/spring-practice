package com.example.demo.builder;

import lombok.Builder;

@Builder
public class TestMember5 {
    private Integer id;
    private String name;
    private int age;
    @Builder.Default
    private String email = "Undefined";

    public String toString() {
        return String.format("TestMember1(id=%s , name=%s , age=%s , email=%s )", id, name, age, email);
    }
}
