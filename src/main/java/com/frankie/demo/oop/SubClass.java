package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/3/1 19:38
 */
public class SubClass extends BaseClass{

    public SubClass(){
        System.out.println("Constructor in SubClass.");
    }

    {
        System.out.println("Instance init block in SubClass.");
    }

    public String book = "Java book";

    public void sub(){
        System.out.println("sub()  in SubClass.");
    }

    @Override
    public void test(){
        System.out.println("test() in SubClass.");
    }
}
