package com.example.demo.lombokEqualsAndHashCode;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Administrator6 extends TestMember6 {
    private String role;
    private LocalDate localAt;

    public Administrator6(Integer id, String name, String email, String role) {
        super(id, name, email);
        this.role = role;
        this.localAt = LocalDate.now();
    }


}
