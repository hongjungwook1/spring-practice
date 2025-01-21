package com.example.demo.lombokConstructor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// @Getter , @Setter를 클래스 단위로 적용하여 Getter Setter를 사용 할 수 있다.
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TestMember3 {
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
