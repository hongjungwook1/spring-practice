package com.example.demo.lombokToString;

public class Test6 {
    public static void main(String[] args) {
        Administrator6 member = new Administrator6(5, "Lee", 20, "Lee@naver.com", "DEVELOPER");
        System.out.println(member);
        System.out.println(member.toString());
    }
}
