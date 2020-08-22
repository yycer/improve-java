package com.frankie.demo.inherit;

/**
 * @author: Yao Frankie
 * @date: 2020/8/20 22:33
 */
public class A extends B{

    static {
        System.out.println("Static block in Class A.");
    }

    public A(){
        System.out.println("Constructor in Class A.");
    }

    {
        System.out.println("Common block in Class A.");
    }
}
