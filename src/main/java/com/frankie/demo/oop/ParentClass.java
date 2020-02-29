package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/2/29 18:50
 */
public class ParentClass {

    public ParentClass(){
        this.test();
    }

    public int book = 5;

    public void parent(){
        System.out.println("parent() method in ParentClass.");
    }

    public void test(){
        System.out.println("test() method in ParentClass.");
    }
}
