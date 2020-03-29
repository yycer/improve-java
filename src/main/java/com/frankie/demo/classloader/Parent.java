package com.frankie.demo.classloader;

/**
 * @author: Yao Frankie
 * @date: 2020/3/29 22:09
 */
public class Parent {

    static int staticVar = 10;
    int instanceVar = 20;

    public Parent(){
        System.out.println("Execute constructor in Parent class.");
    }

    static {
        System.out.println("Execute static block in Parent class.");
    }

    {
        System.out.println("Execute common block in Parent class.");
    }

    static void staticMethod(){
        System.out.println("Execute staticMethod() in Parent class.");
    }

    public void instanceMethod(){
        System.out.println("Execute instanceMethod() in Parent class.");
    }

    public static void main(String[] args) {
        System.out.println("Execute main() in Parent class.");
    }
}
