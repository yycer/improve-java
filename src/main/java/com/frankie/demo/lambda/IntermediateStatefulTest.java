package com.frankie.demo.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Yao Frankie
 * @date: 2020/7/28 17:33
 */
public class IntermediateStatefulTest {

    private static List<Integer> nums = Arrays.asList(2, 5, 6, 4, 5, 5);

    public static void main(String[] args) {
        sorted();
        distinct();
        limit();
    }

    private static void limit() {
        List<Integer> ans = nums.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void distinct() {
        List<Integer> ans = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void sorted() {
        List<Integer> ans = nums.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ans);

        List<Integer> reverse = nums.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverse);
    }
}
