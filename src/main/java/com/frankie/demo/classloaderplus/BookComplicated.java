package com.frankie.demo.classloaderplus;

/**
 * @author: Yao Frankie
 * @date: 2020/7/14 14:50
 */
public class BookComplicated {

    public static void main(String[] args) {
        staticFunction();
    }

    static BookComplicated book = new BookComplicated();

    static {
        System.out.println("执行Book的静态代码块");
    }

    {
        System.out.println("执行Book的普通代码块");
    }

    public BookComplicated() {
        System.out.println("执行Book的构造方法");
        System.out.println("price=" + price + ", amount=" + amount);
    }

    private static void staticFunction() {
        System.out.println("执行Book的staticFunction()静态方法");
    }

    int price = 110;
    static int amount = 112;
}
