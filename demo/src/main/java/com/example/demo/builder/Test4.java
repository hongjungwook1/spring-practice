package com.example.demo.builder;

public class Test4 {

    public static void main(String[] args) {

        //빌더(@builder) 사용 - 클래스 단위가 아닌 생성자 단위에 사용 할 수 있다.
        TestMember4 member1 = TestMember4.builder()
                .name("hong")
                .id(1)
                .age(20)
                .build();

        System.out.println(member1);
    }
}
