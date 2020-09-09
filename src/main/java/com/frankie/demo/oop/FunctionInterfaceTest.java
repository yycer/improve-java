package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 17:10
 */
@FunctionalInterface
public interface FunctionInterfaceTest {

    void m1();

    default void m2(){
        System.out.println("1");
    }
}
