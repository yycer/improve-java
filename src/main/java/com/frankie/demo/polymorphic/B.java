package com.frankie.demo.polymorphic;

/**
 * @author: Yao Frankie
 * @date: 2020/8/21 07:50
 */
public class B extends A{

    public String show(B obj){
        return ("B and B");
    }

    @Override
    public String show(A obj){
        return ("B and A");
    }
}
