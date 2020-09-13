package com.frankie.demo.basiclib.datetimetest;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * @author: Yao Frankie
 * @date: 2020/9/12 14:45
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {

        /**
         * 1. Create a LocalDateTime instance.
         */
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2020, 9, 12, 14, 45, 20);
        LocalDateTime ldt3 = LocalDateTime.parse("2020-09-12T14:45:20");
        System.out.println("-----------------------------------------");
        System.out.println("ldt1 = " + ldt1);
        System.out.println("ldt2 = " + ldt2);
        System.out.println("ldt3 = " + ldt3);
        System.out.println("-----------------------------------------");

        /**
         * 2. Basic Properties.
         */
        LocalDateTime datetime = LocalDateTime.now();
        int year            = datetime.getYear();
        Month month         = datetime.getMonth();
        int monthValue      = datetime.getMonthValue();
        int dayOfYear       = datetime.getDayOfYear();
        int dayOfMonth      = datetime.getDayOfMonth();
        DayOfWeek dayOfWeek = datetime.getDayOfWeek();
        int hour            = datetime.getHour();
        int minute          = datetime.getMinute();
        int second          = datetime.getSecond();
        int nano            = datetime.getNano();

        System.out.println("year       = " + year);
        System.out.println("month      = " + month);
        System.out.println("monthValue = " + monthValue);
        System.out.println("dayOfYear  = " + dayOfYear);
        System.out.println("dayOfMonth = " + dayOfMonth);
        System.out.println("dayOfWeek  = " + dayOfWeek);
        System.out.println("hour       = " + hour);
        System.out.println("minute     = " + minute);
        System.out.println("second     = " + second);
        System.out.println("nano       = " + nano);
        System.out.println("-----------------------------------------");

        /**
         * 3. Utility Methods.
         */
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime tomorrow  = today.plusDays(1);
        LocalDateTime yesterday = today.minus(1, ChronoUnit.DAYS);
        LocalDateTime lastMonth = today.minusMonths(1);
        boolean before = today.isBefore(lastMonth);
        boolean after  = today.isAfter(lastMonth);

        System.out.println("today     = " + today);
        System.out.println("tomorrow  = " + tomorrow);
        System.out.println("yesterday = " + yesterday);
        System.out.println("lastMonth = " + lastMonth);
        System.out.println("before    = " + before);
        System.out.println("after     = " + after);
        System.out.println("-----------------------------------------");

    }
}
