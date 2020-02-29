package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/2/29 09:16
 */
public class Dog {

    public void jump(){
        System.out.println("Start jumping");
    }

    public void run(){
        jump();
        System.out.println("Start running");
    }
}
