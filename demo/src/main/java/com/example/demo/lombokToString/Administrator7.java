package com.example.demo.lombokToString;

import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true)
//클래스 상속 시 toString은 현재 클래스 안에 있는 필드만 적용되지만
//@ToString(callSuper = true) callSuper = true 사용 시 부모의 필드도 toString 가능
//@AllArgsConstructor
public class Administrator7 extends TestMember6 {
    private String role;
    private LocalDate localAt;

    public Administrator7(Integer id, String name, int age, String email, String role) {
        super(id, name, age, email);
        this.role = role;
        this.localAt = LocalDate.now();
    }


}
