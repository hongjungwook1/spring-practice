package com.example.demo.builder;

import java.util.List;

public class Test6 {

    public static void main(String[] args) {

        // 빌더(@builder) 사용 시 - Collection 내 단일 요소 설정 @Singular

        TestMember6 member1 = TestMember6.builder()
                .name("hong")
                .id(1)
                .age(20)
                .favorites(List.of("Game", "Animation"))
                .build();

        TestMember6 member2 = TestMember6.builder()
                .name("Kim")
                .id(2)
                .age(30)
                .favorite("Book")
                .favorite("Cook")
                .build();


        System.out.println(member1);
        System.out.println(member2);
    }
}
