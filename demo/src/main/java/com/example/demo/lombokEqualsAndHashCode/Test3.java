package com.example.demo.lombokEqualsAndHashCode;

public class Test3 {
    public static void main(String[] args) {

        TestMember3 member_a = new TestMember3(10, "Hong", "hong@naver.com");
        TestMember3 member_b = new TestMember3(10, "Kim", "hong@naver.com");
        // TestMember3 클래스에 name 필드에 @EqualsAndHashCode.Exclude 선언 하여 아래 결과 값 true
        System.out.println(member_a.equals(member_b));
    }
}
