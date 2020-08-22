package com.frankie.demo.inherit;

/**
 * @author: Yao Frankie
 * @date: 2020/8/20 22:33
 */
public class C {

    static {
        System.out.println("Static block in Class C.");
    }

    public C(){
        System.out.println("Constructor in Class C.");
    }

    {
        System.out.println("Common block in Class C.");
    }
}
