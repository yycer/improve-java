package com.frankie.demo.oopplus;

import lombok.Getter;

/**
 * @author: Yao Frankie
 * @date: 2020/3/6 21:05
 */
@Getter
public class User implements Cloneable {

    private int age;
    private Address address;

    public User(int age){
        this.age = age;
        this.address = new Address("Shanghai");
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
