package com.example.demo.lombokEqualsAndHashCode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

//@EqualsAndHashCode(of = )를 사용 하여 동등성 비교 할 필드를 포함 할 수 있다.
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
public class TestMember6 {
    private int id;
    @EqualsAndHashCode.Include
    private String name;
    @EqualsAndHashCode.Include
    private String email;

}
