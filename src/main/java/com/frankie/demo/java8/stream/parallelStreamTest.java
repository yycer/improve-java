package com.frankie.demo.java8.stream;

import com.frankie.demo.multithreads.ForkJoinDemo;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

/**
 * @author: Yao Frankie
 * @date: 2020/8/17 15:16
 */
public class parallelStreamTest {

    public static void main(String[] args) {
//        IntStream.range(0, 20).parallel().forEach(System.out::println);
        IntStream.range(0, 20).forEach(System.out::println);
    }
}
