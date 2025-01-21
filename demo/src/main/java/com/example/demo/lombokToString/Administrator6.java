package com.example.demo.lombokToString;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@ToString
//클래스 상속 시 @AllArgsConstructor 사용 불가 + toString은 현재 클래스 안에 있는 필드만 적용
//@AllArgsConstructor
public class Administrator6 extends TestMember6 {
    private String role;
    private LocalDate localAt;

    public Administrator6(Integer id, String name, int age, String email, String role) {
        super(id, name, age, email);
        this.role = role;
        this.localAt = LocalDate.now();
    }


}
