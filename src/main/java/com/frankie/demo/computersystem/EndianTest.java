package com.frankie.demo.computersystem;

import java.nio.ByteOrder;

/**
 * @author: Yao Frankie
 * @date: 2020/9/27 22:53
 */
public class EndianTest {

    public static void main(String[] args) {

        ByteOrder byteOrder = ByteOrder.nativeOrder();
        System.out.println(byteOrder);
    }
}
