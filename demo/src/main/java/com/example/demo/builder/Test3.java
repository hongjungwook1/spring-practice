package com.example.demo.builder;

public class Test3 {

    public static void main(String[] args) {
        // 빌더를 통한 객체 생성 장점
        // 필드 설정 시점/역할 분리가 가능하다
        String request = "Kim";

        TestMember3.TestMember3Builder builder = TestMember3.builder()
                .id(1);
        if (request.equals("Hong")) {
            builder
                    .name("Hong")
                    .email("hong@naver.com");
        } else if (request.equals("Kim")) {
            builder
                    .name("Kim")
                    .email("Kim@naver.com");
        }

        TestMember3 member1 = builder.build();
        System.out.println(member1);
    }
}
