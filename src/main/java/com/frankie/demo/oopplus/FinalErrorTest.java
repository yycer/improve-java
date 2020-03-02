package com.frankie.demo.oopplus;

/**
 * @author: Yao Frankie
 * @date: 2020/3/2 21:25
 */
public class FinalErrorTest {

    private final int age;

    {
        printAge();
        age = 10;
        printAge();
    }

    public void printAge(){
        System.out.println(age);
    }
}
