package com.example.demo.lombokEqualsAndHashCode;

public class Test1 {
    public static void main(String[] args) {

        TestMember1 member_a = new TestMember1(10, "Hong", "hong@naver.com");
        TestMember1 member_b = new TestMember1(10, "Hong", "hong@naver.com");
        // TestMember1 클래스에서 @EqualsAndHashCode 미 선언 시 밑에 결과 값 false
        System.out.println(member_a.equals(member_b));
    }
}
