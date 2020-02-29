package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/2/29 09:48
 */
public class ReturnThis {

    public int age;

    public ReturnThis grow(){
        age++;
        return this;
    }
}
