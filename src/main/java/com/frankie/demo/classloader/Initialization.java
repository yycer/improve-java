package com.frankie.demo.classloader;

/**
 * @author: Yao Frankie
 * @date: 2020/3/29 22:27
 */
public class Initialization {

    int instanceVar = 5;
    static int staticVar = 10;

    {
        System.out.println("Execute common block: instanceVar = " + instanceVar);
    }

    static {
        staticVar = 20;
        System.out.println("Execute static block: staticVar = " + staticVar);
    }

    public Initialization() {
        System.out.println("Execute constructor in Initialization.");
    }

    public static void main(String[] args) {
        System.out.println("Execute main() in Initialization.");
        new Initialization();
    }
}
