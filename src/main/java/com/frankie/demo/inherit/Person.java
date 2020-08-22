package com.frankie.demo.inherit;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/8/21 07:33
 */
@Setter
@Getter
public class Person {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    private String sex;
}
