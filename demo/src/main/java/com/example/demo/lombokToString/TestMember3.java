package com.example.demo.lombokToString;

import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class TestMember3 {
    // toString - exclude 옵션 필드에 설정하여 출력하고 싶지 않은 필드를 제외할 수 있다.
    @ToString.Exclude
    private Integer id;
    @ToString.Exclude
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
