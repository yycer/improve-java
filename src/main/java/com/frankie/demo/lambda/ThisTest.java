package com.frankie.demo.stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * @author: Yao Frankie
 * @date: 2020/7/27 10:09
 */
public class ThisTest {

    Runnable r1 = () -> System.out.println(this);
    Runnable r2 = () -> System.out.println(toString());

    @Override
    public String toString(){
        return "yyc";
    }

    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();
        int[] ints = l.stream().mapToInt(i -> i).toArray();

        int[] a = {1, 2, 3};
        int[] aa = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(aa));
        boolean b = IntStream.of(a).noneMatch(x -> x < 2);
        ThisTest tt = new ThisTest();
        tt.r1.run();
        tt.r2.run();
    }
}
