package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/2/29 20:05
 */
public class Leaf extends Mid{

    static {
        System.out.println("Leaf static init block.");
    }

    {
        System.out.println("Leaf init block.");
    }

    public Leaf(){
        super("frankie");
        System.out.println("Leaf constructor.");
    }
}
