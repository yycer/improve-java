package com.frankie.demo.computersystem;

/**
 * @author: Yao Frankie
 * @date: 2020/9/29 22:35
 */
public class NumberTest {

    public static void main(String[] args) {

        int num = 6_0000;
        String s1 = Integer.toBinaryString(num);
        System.out.println(s1);
        short s = (short) num;
        byte  b = (byte) num;
        System.out.println(s);
        System.out.println(b);
    }
}
