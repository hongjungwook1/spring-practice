package com.example.demo.lombokConstructor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TestMember1 {
    private Integer id;
    private String name;
    private int age;
    private String email;

//    생성자를 모두 적을 수 있지만 @AllArgsConstructor를 통해 생성자를 선언할 수 있다.
//    public TestMember1(Integer id, String name, int age, String email) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.email = email;
//    }


    @Override
    public String toString() {
        return "TestMember1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
