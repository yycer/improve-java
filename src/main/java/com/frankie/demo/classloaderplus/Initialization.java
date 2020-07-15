package com.frankie.demo.classloaderplus;

/**
 * @author: Yao Frankie
 * @date: 2020/7/14 15:38
 */
public class Initialization {

    public Initialization() {
        System.out.println("执行构造函数");
    }

    public static void main(String[] args) {
        staticFunction();
    }

    {
        System.out.println("执行普通代码块");
    }
    int b = 100;

    static Initialization init = new Initialization();
    static int a = 10;
    static {
        System.out.println("更改前，a = " + a);
        System.out.println("执行静态代码块");
        a = 20;
        System.out.println("更改后，a = " + a);
    }

    private static void staticFunction() {
        System.out.println("执行静态方法staticFunction()");
    }
}
