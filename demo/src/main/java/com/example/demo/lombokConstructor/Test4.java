package com.example.demo.lombokConstructor;

public class Test4 {

    public static void main(String[] args) {
        TestMember4 member = new TestMember4(4, "Hong", 20, "Hong@naver,com");
        System.out.println(member.getId());
        member.setAge(30);
        member.setName("Park");
        System.out.println(member.getAge());
        //System.out.println(member.getName());
        //System.out.println(member.getEmail());


        System.out.println(member);
    }
}
