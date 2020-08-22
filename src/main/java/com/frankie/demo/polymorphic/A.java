package com.frankie.demo.polymorphic;

/**
 * @author: Yao Frankie
 * @date: 2020/8/21 07:50
 */
public class A {

    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    }
}
