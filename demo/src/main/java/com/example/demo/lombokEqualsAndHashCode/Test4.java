package com.example.demo.lombokEqualsAndHashCode;

public class Test4 {
    public static void main(String[] args) {

        TestMember4 member_a = new TestMember4(20, "Hong", "hong@naver.com");
        TestMember4 member_b = new TestMember4(10, "Hong", "hong@naver.com");
        //@EqualsAndHashCode(of = {"name", "email"})를 사용 하여 id 값이 달라도 true
        System.out.println(member_a.equals(member_b));
    }
}
