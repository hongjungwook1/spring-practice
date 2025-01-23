package com.example.demo.builder;

public class Test5 {

    public static void main(String[] args) {

        //빌더(@builder) 사용 - @Builder.Default 사용하여 기본 값 설정을 할 수 있다.

        TestMember5 member1 = TestMember5.builder()
                .name("hong")
                .id(1)
                .age(20)
                .build();

        System.out.println(member1);
    }
}
