package com.frankie.demo.oopplus;

/**
 * @author: Yao Frankie
 * @date: 2020/3/3 20:14
 */
public interface Output {

    int MAX_CACHE_LINE = 50;

    void out();
    void getDate(String msg);

    default void print(String... msgs){
        for (String s: msgs)
            System.out.println(s);
    }

    default void defaultTest(){
        System.out.println("Start defaultTest().");
    }

    static void staticTest(){
        System.out.println("Start staticTest().");
    }

    private void privateMethod(){
        System.out.println("Start privateMethod().");
    }

    private static void privateStaticMethod(){
        System.out.println("Start privateStaticMethod().");
    }
}
