package com.frankie.demo.lambda;

import javax.swing.*;
import java.nio.channels.NotYetBoundException;
import java.nio.file.FileVisitResult;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: Yao Frankie
 * @date: 2020/7/28 17:34
 */
public class TerminalNonShortCircuitTest {

    private static List<Integer> nums = Arrays.asList(2, 5, 6, 4, 1);

    public static void main(String[] args) {
        foreach();
        reduce();
        max();
        min();
        count();
        avg();
        sum();
        collect();
        toArray();
    }

    private static void collect() {
        Map<Integer, Integer> ans = nums.stream()
                .collect(Collectors.toMap(Function.identity(), i -> i * i));
        ans.forEach((k, v) -> System.out.println("k = " + k + ", v = " + v));
    }

    private static void sum() {
        int ans = nums.stream()
                .mapToInt(i -> i)
                .sum();
        System.out.println("sum = " + ans);
    }

    private static void avg() {
        double ans = nums.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0);
        System.out.println("avg = " + ans);
    }

    private static void count() {
        long ans = nums.stream()
                .filter(i -> i > 3)
                .count();
        System.out.println("count = " + ans);
    }

    private static void min() {
        int ans = nums.stream()
                .mapToInt(i -> i)
                .min()
                .orElse(Integer.MIN_VALUE);
        System.out.println("min = " + ans);
    }

    private static void max() {
        Integer ans = nums.stream()
                .mapToInt(i -> i)
                .max()
                .orElse(Integer.MAX_VALUE);
        System.out.println("max = " + ans);
    }

    private static void reduce() {
        Integer ans = nums.stream()
                .reduce(0, Integer::sum);
        System.out.println("sum = " + ans);
    }

    private static void toArray() {
        int[] ans = nums.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(ans));
    }

    private static void foreach() {
        nums.stream().forEach(System.out::print);
        System.out.println();
        nums.forEach(System.out::print);
        System.out.println();
    }
}
