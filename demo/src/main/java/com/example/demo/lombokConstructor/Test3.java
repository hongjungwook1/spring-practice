package com.example.demo.lombokConstructor;

public class Test3 {

    public static void main(String[] args) {
        TestMember3 member = new TestMember3(3, "Hong", 20, "Hong@naver,com");
        System.out.println(member.getId());
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getEmail());


        System.out.println(member);
    }
}
