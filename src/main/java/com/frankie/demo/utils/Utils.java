package com.frankie.demo.utils;

import com.frankie.demo.oop.DataWrap;
import com.frankie.demo.oop.SeasonEnum;

import java.text.Format;

/**
 * @author: Yao Frankie
 * @date: 2020/2/28 16:08
 */
public class Utils {

    /**
     * switch & enum
     */
    public static void describeSeason(SeasonEnum s){
        switch (s){
            case SPRING:
                System.out.println("Spring coming.");
                break;
            case SUMMER:
                System.out.println("Summer coming.");
                break;
            case FALL:
                System.out.println("Fall coming.");
                break;
            case WINTER:
                System.out.println("Winter coming.");
                break;
            default:
                throw new RuntimeException("Please enter valid season!");
        }
    }

    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(String.format("in    swap(): a = %d, b = %d", a, b));
    }

    public static void swapDataWrap(DataWrap dw){
        int tmp = dw.getA();
        dw.setA(dw.getB());
        dw.setB(tmp);
        System.out.println(String.format("in    swap(): a = %d, b = %d", dw.getA(), dw.getB()));
    }

//    public static void paramDynamic(int a, String... names){
//        for (var name: names)
//            System.out.println(name);
//    }

//    public static void paramDynamic(String... names){
//        for (var name: names)
//            System.out.println("name in changeable parameters: " + name);
//    }

    public static void paramDynamic(String name){
        System.out.println("name: " + name);
    }

    public static int func(int n){
        if (n < 0) throw new RuntimeException("Please enter valid number!");
        else if (n == 0) return 1;
        else if (n == 1) return 4;
        else return 2 * func(n -1 ) + func(n - 2);
    }

    public static int fn(int n){
        if (n == 20) return 1;
        else if (n == 21) return 4;
        else return fn(n + 2) - 2 * fn(n + 1);
    }
}
