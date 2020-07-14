package com.frankie.demo.classloaderplus;

/**
 * @author: Yao Frankie
 * @date: 2020/7/14 14:24
 */
public class Book {

    /**
     * 根据类加载机制，在初始化阶段会初始化Book类。
     * 当虚拟机启动时，用户需要指定一个要执行的主类(包含main()的类)，虚拟机会先初始化这个主类。
     */
    public static void main(String[] args) {
        System.out.println("执行main()方法");
        new Book();
    }

    public Book() {
        System.out.println(price);
        System.out.println("执行Book类默认构造函数");
    }

    // 成员变量
    int price = 10;

    {
        price = 15;
        System.out.println("执行Book中普通代码块");
    }

    static int amount = 20;

    static {
        System.out.println(amount);
        System.out.println("执行Book中静态代码块");
    }

}
