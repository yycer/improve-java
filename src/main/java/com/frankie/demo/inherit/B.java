package com.frankie.demo.inherit;

/**
 * @author: Yao Frankie
 * @date: 2020/8/20 22:33
 */
public class B extends C{

    static {
        System.out.println("Static block in Class B.");
    }

    public B(){
        System.out.println("Constructor in Class B.");
    }

    {
        System.out.println("Common block in Class B.");
    }
}
