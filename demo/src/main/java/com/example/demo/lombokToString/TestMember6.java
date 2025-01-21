package com.example.demo.lombokToString;

import lombok.AllArgsConstructor;
import lombok.ToString;


// toString - Include + 명시적 포함 옵션을 사용할 수 있다
@AllArgsConstructor
@ToString
public class TestMember6 {

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
