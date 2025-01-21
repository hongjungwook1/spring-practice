package com.example.demo.lombokToString;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class TestMember1 {
    private Integer id;
    private String name;
    private int age;
    private String email;

//  @ToString을 선언하여 사용할 수 있다.
//    @Override
//    public String toString() {
//        return "TestMember1{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", email='" + email + '\'' +
//                '}';
//    }

}
