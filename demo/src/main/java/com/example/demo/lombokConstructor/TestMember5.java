package com.example.demo.lombokConstructor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TestMember5 {
    // @Getter , @Setter를 필드 단위로 적용 및 접근 제어자 설정이 가능하다
    @Getter(AccessLevel.PRIVATE)
    private Integer id;
    @Setter(AccessLevel.PRIVATE)
    private String name;
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
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
