package com.example.demo.lombokToString;

public class Test7 {
    public static void main(String[] args) {
        Administrator7 member = new Administrator7(5, "Lee", 20, "Lee@naver.com", "DEVELOPER");
        System.out.println(member);
        System.out.println(member.toString());
    }
}
