package com.frankie.demo.algorithm;

import java.util.ArrayDeque;

/**
 * @author: Yao Frankie
 * @date: 2020/7/28 15:40
 */
public class Test {


    private static void calc(ArrayDeque<Character> ops, ArrayDeque<Integer> nums){
        int a = nums.pop();
        int b = nums.pop();
        char c = ops.pop();
        System.out.println("c = " + c);
        if (c == '+') {
            System.out.println("b + a = " + (b + a));
            nums.push(b + a);
        } else {
            System.out.println("b - a = " + (b - a));
            nums.push(b - a);
        }
    }


    public static void main(String[] args) {
        char c = ' ';
        System.out.println(c);
    }
}
