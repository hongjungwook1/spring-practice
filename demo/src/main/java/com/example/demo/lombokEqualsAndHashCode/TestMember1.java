package com.example.demo.lombokEqualsAndHashCode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode
@AllArgsConstructor
public class TestMember1 {
    private int id;
    private String name;
    private String email;
    
//    public boolean equals(TestMember1 member) {
//        return this.id.equals(member.id) &&
//                this.name.equals(member.name) &&
//                this.age == member.age &&
//                this.email.equals(member.email);
//    }
}
