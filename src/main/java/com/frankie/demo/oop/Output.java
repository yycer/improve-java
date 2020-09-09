package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 15:11
 */
public interface Output {

    int N = 100010;

    void out();

    default void print(String... msgs){
        for (String msg: msgs){
            System.out.println(msg);
        }
    }

    static String staticTest(){
        return "staticTest";
    }

    private void foo(){
        System.out.println("foo");
    }

    private static void bar(){
        System.out.println("bar");
    }
}
