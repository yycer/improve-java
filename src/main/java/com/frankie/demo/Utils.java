package com.frankie.demo;

import com.frankie.demo.oop.SeasonEnum;

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
}
