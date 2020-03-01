package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/3/1 16:28
 */
public class Animal extends Creature{

    public Animal(String name){
        System.out.println("The name of animal is " + name);
    }

    public Animal(String name, int age){
        this(name);
        System.out.println(String.format("Age is %d", age));
    }
}
