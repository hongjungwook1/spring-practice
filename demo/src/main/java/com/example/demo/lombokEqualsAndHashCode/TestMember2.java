package com.example.demo.lombokEqualsAndHashCode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

//@EqualsAndHashCode(exclude = )를 사용 하여 동등성 비교 제외할 필드를 선택할 수 있다.
@EqualsAndHashCode(exclude = {"email"})
@AllArgsConstructor
public class TestMember2 {
    private int id;
    private String name;
    private String email;

}
