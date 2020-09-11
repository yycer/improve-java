package com.frankie.demo.basiclib.random;

import java.util.Random;

/**
 * @author: Yao Frankie
 * @date: 2020/9/11 10:03
 */
public class RandomTest {

    public static void main(String[] args) {

        double min = 50.0, max = 100.0;
        var random = new Random();
        for (int i = 0; i < 3; i++){
//            System.out.println("nextInt()     = " + random.nextInt(100));
//            System.out.println("nextInt(20)   = " + random.nextInt(20));
//            System.out.println("nextFloat()   = " + random.nextFloat());
//            System.out.println("nextDouble()  = " + random.nextDouble());
//            int asInt = random.ints(50, 100).findAny().getAsInt();
//            System.out.println("ints(50, 100) = " + asInt);

            double d = random.nextDouble() * (max - min) + min;
            System.out.println("[50.0, 100.0) = " + d);

//            double asDouble = random.doubles(min, max).findAny().getAsDouble();
//            System.out.println("[50.0, 100.0) = " + asDouble);
//            System.out.println("-----------------------------------");

        }
    }
}
