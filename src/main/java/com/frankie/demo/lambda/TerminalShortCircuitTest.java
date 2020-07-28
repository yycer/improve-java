package com.frankie.demo.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Yao Frankie
 * @date: 2020/7/28 17:34
 */
public class TerminalShortCircuitTest {

    private static List<Integer> nums = Arrays.asList(2, 5, 6, 4, 1);

    public static void main(String[] args) {
        anyMatch();
        allMatch();
        noneMatch();
        findFirst();
        findAny();
    }

    private static void findAny() {
        Integer ans = nums.stream()
                .findAny()
                .orElse(0);
        System.out.println("Find any: " + ans);
    }

    private static void findFirst() {
        Integer ans = nums.stream()
                .findFirst()
                .orElse(0);
        System.out.println("Find first: " + ans);
    }

    private static void noneMatch() {
        boolean ans = nums.stream()
                .noneMatch(i -> i > 2);
        System.out.println("NoneMatch: " + ans);
    }

    private static void allMatch() {
        boolean ans = nums.stream()
                .allMatch(i -> i > 2);
        System.out.println("AllMatch: " + ans);
    }

    private static void anyMatch() {
        boolean ans = nums.stream()
                .anyMatch(i -> i > 3);
        System.out.println("AnyMatch: " + ans);
    }
}
