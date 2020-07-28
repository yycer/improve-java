package com.frankie.demo.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author: Yao Frankie
 * @date: 2020/7/27 09:50
 */
public class Test {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("l", "love", null, "you");
        List<String> ans = list.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(x -> x))
                .collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void createThread() {

        new Thread(new Runnable(){
        @Override
        public void run() {
            System.out.println("aaa");
        }
    }).start();

        new Thread(() -> System.out.println("a")).start();
    }
}
