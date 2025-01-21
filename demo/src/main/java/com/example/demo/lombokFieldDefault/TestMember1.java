package com.example.demo.lombokFieldDefault;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;


@AllArgsConstructor
@ToString
// 클래스 내 필드 일일히 접근제어자 설정이 귀찮을때
// @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE) 선언하여 사용 할 수 있다.
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class TestMember1 {

    Integer id;
    String name;
    int age;
    String email;


}
