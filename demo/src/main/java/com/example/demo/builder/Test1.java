package com.example.demo.builder;

public class Test1 {

    public static void main(String[] args) {
        //빌더(@builder) 통한 객체 생성 방법과 생성자 통한 객체 생성 방법 비교

        // 생성자를 통한 객체 생성
        TestMember1 member1 = new TestMember1(1, "Hong", 10, "hong@naver.com");

        // 빌더를 통한 객체 생성
        TestMember1 member2 = TestMember1.builder()
                .id(2)
                .name("Kim")
                .age(20)
                .email("Kim@naver.com")
                .build();

        System.out.println(member1);
        System.out.println(member2);
    }
}
