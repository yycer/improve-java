package com.frankie.demo.jvm.referenceTest;

import java.lang.ref.SoftReference;

/**
 * @author: Yao Frankie
 * @date: 2020/7/15 09:45
 */
public class SoftReferenceDemo {

    private static final int N = 1024 * 1024;

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        System.out.println("初始状态: " + rt.freeMemory() / N + "M(free)");
        SoftReference<Object> soft1 = new SoftReference<>(new byte[4 * N]);
        System.out.println("创建数组1: " + rt.freeMemory() / N + "M(free)");
        System.out.println("soft1 reference = " + soft1.get());

        System.gc();
        System.out.println("垃圾回收: " + rt.freeMemory() / N + "M(free)");

        SoftReference<Object> soft2 = new SoftReference<>(new byte[12 * N]);
        System.out.println("创建数组2: " + rt.freeMemory() / N + "M(free)");
        System.out.println("soft1 reference = " + soft1.get());
        System.out.println("soft2 reference = " + soft2.get());

    }
}
