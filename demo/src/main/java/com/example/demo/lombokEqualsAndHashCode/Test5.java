package com.example.demo.lombokEqualsAndHashCode;

public class Test5 {
    public static void main(String[] args) {

        TestMember5 member_a = new TestMember5(20, "Hong", "hong@naver.com");
        TestMember5 member_b = new TestMember5(10, "Hong", "hong@naver.com");
        //@EqualsAndHashCode(onlyExplicitlyIncluded = true) 선언 후
        //name , email 값에 @EqualsAndHashCode.Include 선언을 하여 아래 값 true
        System.out.println(member_a.equals(member_b));
    }
}
