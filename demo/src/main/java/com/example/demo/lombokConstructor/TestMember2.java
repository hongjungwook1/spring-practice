package com.example.demo.lombokConstructor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

// 생성자의 접근 제어자 옵션을 설정 가능하다 (access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TestMember2 {
    private Integer id;
    private String name;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "TestMember1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
