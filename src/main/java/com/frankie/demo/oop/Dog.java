package com.frankie.demo.oop;

import lombok.Getter;

/**
 * @author: Yao Frankie
 * @date: 2020/2/29 09:16
 */
@Getter
public class Dog {

//    private String name = "puppy";
    private String name;

    public Dog(String name){
        this.name = name;
    }

    public void jump(){
        System.out.println("Dog start jumping");
    }

    public void run(){
        jump();
        System.out.println("Dog start running");
    }

//    public void getName(){
//        String name = "abc";
//        System.out.println("The name of dog is " + name);
//    }

//    public void getName(){
//        String name = "abc";
//        System.out.println("The name of dog is " + this.name);
//    }
}
