package com.frankie.demo.classloaderplus;

/**
 * @author: Yao Frankie
 * @date: 2020/7/14 11:16
 */
public class Grandpa {

    static {
        System.out.println("执行Grandpa类静态代码块");
    }
}
