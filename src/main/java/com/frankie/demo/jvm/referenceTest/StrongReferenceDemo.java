package com.frankie.demo.jvm.referenceTest;

/**
 * @author: Yao Frankie
 * @date: 2020/7/15 09:34
 */
public class StrongReferenceDemo {

    private static final int N = 1024 * 1024;

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        System.out.println("初始状态: " + rt.freeMemory() / N + "M(free)");
        byte[] arr = new byte[4 * N];
        System.out.println("创建数组: " + rt.freeMemory() / N + "M(free)");

        System.gc();
        System.out.println("垃圾回收: " + rt.freeMemory() / N + "M(free)");

        arr = null;
        System.gc();
        System.out.println("断开引用: " + rt.freeMemory() / N + "M(free)");
    }
}

//    初始状态: 14M(free)
//    创建数组: 10M(free)
//    垃圾回收: 10M(free)
//    断开引用: 14M(free)
