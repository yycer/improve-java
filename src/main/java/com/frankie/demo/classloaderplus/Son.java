package com.frankie.demo.classloaderplus;

/**
 * @author: Yao Frankie
 * @date: 2020/7/14 11:13
 */
public class Son extends Parent {

//    public static int age = 25;

    static {
        System.out.println("执行Son类静态代码块");
    }

    public Son() {
        System.out.println("执行Son类的构造函数");
    }
}
