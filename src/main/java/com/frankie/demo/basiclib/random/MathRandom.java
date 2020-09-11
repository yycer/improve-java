package com.frankie.demo.basiclib.random;

/**
 * @author: Yao Frankie
 * @date: 2020/9/11 10:08
 */
public class MathRandom {

    public static void main(String[] args) {

        int min = 50;
        int max = 100;

        System.out.println("-----------------------------------");
        // 1. Generate random double value from 50 to 100.
//        for (int i = 0; i < 3; i++){
//            int ans = (int) (Math.random() * (max - min + 1) + min);
//            System.out.println("[0, 100): " + ans);
//        }
//        System.out.println("-----------------------------------");

//        // 2. Generate random int value from 50 to 100.
        for (int i = 0; i < 3; i++){
            double d = Math.random() * (max - min + 1) + min;
            System.out.println("[50.0, 100.0) = " + d);
        }
        System.out.println("-----------------------------------");
    }
}
