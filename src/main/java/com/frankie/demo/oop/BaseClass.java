package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/3/1 19:38
 */
public class BaseClass {

    public BaseClass(){
        System.out.println("Constructor in BaseClass.");
    }

    {
        System.out.println("Instance init block in BaseClass.");
    }

    public int book = 5;

    public void base(){
        System.out.println("base() in BaseClass.");
    }

    public void test(){
        System.out.println("test() in BaseClass.");
    }
}
