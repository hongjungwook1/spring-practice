package com.example.demo.lombokToString;

import lombok.AllArgsConstructor;
import lombok.ToString;

// toString - exclude 옵션을 통해 출력하고 싶지 않은 필드를 제외할 수 있다.
@AllArgsConstructor
@ToString(exclude = {"age", "email"})
public class TestMember2 {
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
