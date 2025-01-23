package com.example.demo.builder;

public class Test2 {

    public static void main(String[] args) {
        // 빌더를 통한 객체 생성 장점
        // - 원하는 필드만 설정 가능하다
        // - 필드 설정 순서가 상관없다.
        TestMember1 member1 = TestMember1.builder()
                .name("Kim")
                .email("Kim@naver.com")
                .build();

        TestMember1 member2 = TestMember1.builder()
                .name("Kim")
                .email("Kim@naver.com")
                .id(2)
                .age(15)
                .build();

        System.out.println(member1);
        System.out.println(member2);
    }
}
