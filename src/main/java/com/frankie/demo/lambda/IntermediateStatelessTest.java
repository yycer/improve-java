package com.frankie.demo.lambda;

import java.awt.font.NumericShaper;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Yao Frankie
 * @date: 2020/7/28 17:33
 */
public class IntermediateStatelessTest {

    private static List<String> names = Arrays.asList("yyc", "frankie", "Jack", "Alina");
    private static List<List<Integer>> nums = new LinkedList<>();

    public static void main(String[] args) {
        filter();
        map();
        flatMap();
    }

    private static void flatMap() {
        nums.add(Arrays.asList(1, 3, 5));
        nums.add(Arrays.asList(2, 6));
        List<Integer> ans = nums.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void map() {
        List<String> ans = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void filter() {
        List<String> ans = names.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
