package com.example.demo.lombokFieldDefault;

import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true)
public class Administrator1 extends TestMember1 {
    private String role;
    private LocalDate localAt;

    public Administrator1(Integer id, String name, int age, String email, String role) {
        super(id, name, age, email);
        this.role = role;
        this.localAt = LocalDate.now();
    }


}
