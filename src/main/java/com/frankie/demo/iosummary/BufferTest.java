package com.frankie.demo.iosummary;

import java.nio.IntBuffer;

/**
 * @author: Yao Frankie
 * @date: 2020/7/21 10:13
 */
public class BufferTest {

    public static void main(String[] args) {
        // 测试Buffer三个属性[读写模式切换]
        test1();
    }

    private static void test1() {
        IntBuffer b = IntBuffer.allocate(10);
        b.put(1);
        b.put(2);
        System.out.println("---------- 写模式 ----------");
        System.out.println("capacity = " + b.capacity()); // 10
        System.out.println("position = " + b.position()); // 2
        System.out.println("limit    = " + b.limit());    // 10

        System.out.println("---------- 读模式 ----------");
        b.flip();
        System.out.println("capacity = " + b.capacity()); // 10
        System.out.println("position = " + b.position()); // 0
        System.out.println("limit    = " + b.limit());    // 2
    }
}
