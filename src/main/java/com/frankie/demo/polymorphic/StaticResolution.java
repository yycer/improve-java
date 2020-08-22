package com.frankie.demo.polymorphic;

/**
 * @author: Yao Frankie
 * @date: 2020/8/21 09:15
 */
public class StaticResolution {

    public static void main(String[] args) {
        StaticResolution.test();
        StaticResolution.run();
    }

    public static void test(){
        System.out.println("test");
    }

    public static final void run(){
        System.out.println("run");
    }
}
