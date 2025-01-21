package com.example.demo.lombokEqualsAndHashCode;

public class Test6 {
    public static void main(String[] args) {

        Administrator6 member_a = new Administrator6(20, "Hong", "hong@naver.com", "DEVELOPER");
        Administrator6 member_b = new Administrator6(10, "Hong", "hong@naver.com", "DEVELOPER");
        //TestMember6 클래스에 @EqualsAndHashCode(onlyExplicitlyIncluded = true) 선언
        //Administrator6 클래스에 @EqualsAndHashCode(callSuper = true) 선언하여 id 값이 달라도 true
        System.out.println(member_a.equals(member_b));
    }
}
