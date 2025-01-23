package com.example.demo.staticFactoryMethod.member;

import com.example.demo.staticFactoryMethod.dto.MemberCreateRequestDto1;

public class Member1 {
    private Integer id;
    private String name;
    private int age;
    private String email;

    // 아래 처럼 생성자의 접근 제어자를 Private으로 변경하여도 되고 
    // @AllArgsConstructor(access = AccessLevel.PRIVATE)을 위에 선언하여도 된다
    private Member1(Integer id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public static Member1 from(MemberCreateRequestDto1 dto) {
        return new Member1(
                null,
                dto.getName(),
                0,
                dto.getEmail()
        );
    }

    public String toString() {
        return String.format("Member(id=%s, name=%s, age=%s, email=%s)", id, name, age, email);
    }

}
