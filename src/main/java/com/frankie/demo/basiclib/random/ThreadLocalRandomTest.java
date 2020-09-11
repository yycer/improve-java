package com.frankie.demo.basiclib.random;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author: Yao Frankie
 * @date: 2020/9/11 10:17
 */
public class ThreadLocalRandomTest {

    public static void main(String[] args) {

        int min = 50, max = 100;

        for (int i = 0; i < 3; i++){
//            int ans = ThreadLocalRandom.current().nextInt(100);
//            System.out.println("[0, 100) = " + ans);
//            System.out.println("nextInt(20)      = " + ThreadLocalRandom.current().nextInt(20));
//            System.out.println("nextInt(50, 100) = " + ThreadLocalRandom.current().nextInt(50, 100));
//            System.out.println("-----------------------------------");

            double d = ThreadLocalRandom.current().nextDouble(min, max);
            System.out.println("[50.0, 100.0) = " + d);
        }
    }
}
