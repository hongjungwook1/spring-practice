package com.example.demo.lombokConstructor;

public class Test5 {

    public static void main(String[] args) {
        TestMember5 member = new TestMember5(5, "Hong", 20, "Hong@naver,com");
        //System.out.println(member.getId());
        member.setAge(30);
        //member.setName("Park");
        System.out.println(member.getAge());
        //System.out.println(member.getName());
        //System.out.println(member.getEmail());


        System.out.println(member);
    }
}
