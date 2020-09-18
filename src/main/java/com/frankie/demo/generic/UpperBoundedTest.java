package com.frankie.demo.generic;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Yao Frankie
 * @date: 2020/9/18 08:15
 */
public class UpperBoundedTest {

    public static void main(String[] args) {

        /** 1. Integer list */
        List<Integer> intList = Arrays.asList(1, 3, 5);
        double ans1 = sumOfList(intList);
        System.out.println("ans1 = " + ans1);

        /** 2. Double list */
        List<Double> doubleList = Arrays.asList(1.35, 2.55, 3.5);
        double ans2 = sumOfList(doubleList);
        System.out.println("ans2 = " + ans2);
    }

    public static double sumOfList(List<? extends Number> list){
        double sum = 0.0;
        for (Number n: list){
            sum += n.doubleValue();
        }
        return sum;
    }
}
