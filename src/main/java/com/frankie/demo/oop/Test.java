package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 10:04
 */
public class Test {

    public static void main(String[] args) {

        BaseClass c = new SubClass();
        System.out.println(c.book);
        c.base();
        c.test();
    }
}
