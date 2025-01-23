package com.example.demo.builder;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class TestMember6 {
    private Integer id;
    private String name;
    private int age;
    @Builder.Default
    private String email = "Undefined";
    @Singular
    private List<String> favorites;

    public String toString() {
        return String.format("TestMember1(id=%s , name=%s , age=%s , email=%s favorites=%s)", id, name, age, email, favorites);
    }
}
