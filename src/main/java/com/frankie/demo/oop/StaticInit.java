package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/3/1 22:15
 */
public class StaticInit {

    static {
        a = 5;
    }

    public static int a = 10;

    static {
        a = 20;
    }
}
