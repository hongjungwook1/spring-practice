package com.example.demo.lombokToString;

import lombok.AllArgsConstructor;
import lombok.ToString;


// toString - of 옵션을 통해 출력 필드를 포함할 수 있다.
@AllArgsConstructor
@ToString(of = {"id", "name"})
public class TestMember4 {

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
