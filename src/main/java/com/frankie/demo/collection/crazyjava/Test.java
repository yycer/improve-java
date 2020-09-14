package com.frankie.demo.collection.crazyjava;

import java.util.stream.IntStream;

/**
 * @author: Yao Frankie
 * @date: 2020/9/13 19:15
 */
public class Test {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5};
        IntStream.of(nums).forEach(System.out::println);
    }
}
