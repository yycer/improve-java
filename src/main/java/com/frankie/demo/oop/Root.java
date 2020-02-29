package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/2/29 20:05
 */
public class Root {
    static {
        System.out.println("Root static init block.");
    }

    {
        System.out.println("Root init block.");
    }

    public Root(){
        System.out.println("Root constructor.");
    }
}
