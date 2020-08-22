package com.frankie.demo.inherit;

/**
 * @author: Yao Frankie
 * @date: 2020/8/20 22:40
 */
public class User {

    public User(int age){
        this.age = 20;
    }

    private int age = 24;

    public void add(){
        System.out.println("Add user.");
    }

    public void update(){
        int age = 18;
        System.out.println("Age = " + this.age);
        add();
        System.out.println("Update user.");
    }
}
