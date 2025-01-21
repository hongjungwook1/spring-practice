package com.example.demo.lombokConstructor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TestMember4 {
    // @Getter , @Setter를 필드 단위로 적용하여 Getter Setter를 사용 할 수 있다.
    @Getter
    private Integer id;
    @Setter
    private String name;
    @Getter
    @Setter
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
