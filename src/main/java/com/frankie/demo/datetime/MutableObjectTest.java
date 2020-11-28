package com.frankie.demo.datetime;

import java.util.Date;

/**
 * @author: Yao Frankie
 * @date: 2020/10/28 08:35
 */
public class MutableObjectTest {

    public static void main(String[] args) {

        Date date = new Date(120, 9, 28, 10, 0, 0);
        System.out.println(date);

//        Date clone = new Date(date.getTime());
//        clone.setYear(130);
//        System.out.println("------------------------------");
//        System.out.println(date);
//        System.out.println(clone);

        Date clone = (Date) date.clone();
        clone.setYear(130);
        System.out.println("------------------------------");
        System.out.println(date);
        System.out.println(clone);
    }
}
