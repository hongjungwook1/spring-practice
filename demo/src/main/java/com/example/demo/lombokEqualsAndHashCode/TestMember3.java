package com.example.demo.lombokEqualsAndHashCode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode
@AllArgsConstructor
public class TestMember3 {
    private int id;
    //@EqualsAndHashCode.Exclude를 필드 내에서 사용 함으로 써 동등성 비교에서 제외할 수 있다.
    @EqualsAndHashCode.Exclude
    private String name;
    private String email;

}
