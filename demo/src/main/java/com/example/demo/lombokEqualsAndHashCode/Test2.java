package com.example.demo.lombokEqualsAndHashCode;

public class Test2 {
    public static void main(String[] args) {

        TestMember2 member_a = new TestMember2(10, "Hong", "hong@naver.com");
        TestMember2 member_b = new TestMember2(10, "Hong", "Kim@naver.com");
        // TestMember2 클래스에서 @EqualsAndHashCode(exclude = {"email"}) 이메일을 제외 했기 때문에 아래 결과 값 true
        System.out.println(member_a.equals(member_b));
    }
}
