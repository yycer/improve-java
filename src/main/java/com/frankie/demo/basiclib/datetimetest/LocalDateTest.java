package com.frankie.demo.basiclib.datetimetest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * @author: Yao Frankie
 * @date: 2020/9/11 19:52
 */
public class LocalDateTest {

    public static void main(String[] args) {

        /** 1. How to get a LocalDate instance? */
//        LocalDate ld1 = LocalDate.now();
//        System.out.println("ld1 = " + ld1);
//
//        LocalDate ld2 = LocalDate.of(2020, 9, 12);
//        System.out.println("ld2 = " + ld2);
//
//        LocalDate ld3 = LocalDate.parse("2020-09-12");
//        System.out.println("ld3 = " + ld3);


        /** 2. Basic properties. */
        LocalDate date      = LocalDate.of(2020, 9, 11);
        int year            = date.getYear();
        Month month         = date.getMonth();
        int dayOfMonth      = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfYear       = date.getDayOfYear();
        int len             = date.lengthOfMonth();
        boolean leapYear    = date.isLeapYear();
//        System.out.println(year);       // 2020
//        System.out.println(month);      // SEPTEMBER
//        System.out.println(dayOfMonth); // 11
//        System.out.println(dayOfWeek);  // FRIDAY
//        System.out.println(dayOfYear);  // 255
//        System.out.println(len);        // 30
//        System.out.println(leapYear);   // true


        /** 3. Utility Methods. */
        LocalDate ld = LocalDate.now();
        LocalDate tomorrow   = ld.plusDays(1);
        LocalDate yesterday  = ld.minusDays(1);
        LocalDate lastMonth1 = ld.minusMonths(1);
        LocalDate lastMonth2 = ld.minus(1, ChronoUnit.MONTHS);

        LocalDate ld1  = LocalDate.parse("2020-09-12");
        LocalDate ld2  = LocalDate.parse("2020-10-01");
        boolean before = ld1.isBefore(ld2);
        boolean after  = ld1.isAfter(ld2);

//        System.out.println("tomorrow   = " + tomorrow);
//        System.out.println("yesterday  = " + yesterday);
//        System.out.println("lastMonth1 = " + lastMonth1);
//        System.out.println("lastMonth2 = " + lastMonth2);
//        System.out.println("before     = " + before);
//        System.out.println("after      = " + after);
    }
}
