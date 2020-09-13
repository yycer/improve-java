package com.frankie.demo.stream;

import java.util.stream.IntStream;

/**
 * @author: Yao Frankie
 * @date: 2020/9/13 15:51
 */
public class StreamTest {

    public static void main(String[] args) {

        int[] nums = {1, 0, 1};
        boolean ans = IntStream.of(nums).anyMatch(i -> i == 0);
        System.out.println(ans);
    }
}
