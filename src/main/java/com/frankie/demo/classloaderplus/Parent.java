package com.frankie.demo.classloaderplus;

/**
 * @author: Yao Frankie
 * @date: 2020/7/14 11:15
 */
public class Parent extends Grandpa{

    public static int age = 50;

    static {
        System.out.println("执行Parent类静态代码块");
    }


    public Parent() {
        System.out.println("执行Parent类的构造函数");
    }

}
