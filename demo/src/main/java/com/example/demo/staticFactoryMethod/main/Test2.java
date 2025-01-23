package com.example.demo.staticFactoryMethod.main;

import com.example.demo.staticFactoryMethod.dto.MemberCreateRequestDto1;
import com.example.demo.staticFactoryMethod.member.Member1;
import com.example.demo.staticFactoryMethod.member.Member2;

public class Test2 {
    public static void main(String[] args) {

        // Singleton 싱글턴 객체를 위한 정적 팩토리 메서드
        Member2 member1 = Member2.getInstance();
        System.out.println(member1);
    }
}
