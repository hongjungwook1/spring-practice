package com.example.demo.staticFactoryMethod.main;

import com.example.demo.staticFactoryMethod.dto.MemberCreateRequestDto1;
import com.example.demo.staticFactoryMethod.member.Member1;

public class Test1 {
    public static void main(String[] args) {

        // 정적 팩토리 메서드 - 유저가 API 요청 시 보낸 DTO 기반으로 객체 생성
        // 기본 생성자는 Private 으로 외부 호출 방지한다.
        MemberCreateRequestDto1 dto = new MemberCreateRequestDto1("Hong", "hong@naver.com");

        //Member1 member = new Member1(1, "Kim", 30, "Kim@naver.com");
        Member1 memberDto = Member1.from(dto);

        //System.out.println(member);
        System.out.println(memberDto);
    }
}
