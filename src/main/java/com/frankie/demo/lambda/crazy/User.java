package com.frankie.demo.lambda.crazy;

import lombok.ToString;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 17:33
 */
@ToString
public class User {

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
}
