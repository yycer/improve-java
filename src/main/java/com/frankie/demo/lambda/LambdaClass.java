package com.frankie.demo.stream;

/**
 * @author: Yao Frankie
 * @date: 2020/7/27 10:06
 */
public class LambdaClass {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("aa")).start();
    }
}
