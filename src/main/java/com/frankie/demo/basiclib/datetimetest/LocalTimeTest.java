package com.frankie.demo.basiclib.datetimetest;

import javax.security.auth.kerberos.KerberosTicket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author: Yao Frankie
 * @date: 2020/9/12 11:21
 */
public class LocalTimeTest {

    public static void main(String[] args) {

        /**
         * 1. How to create LocalTime instance?
         */
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(11, 22, 0);
        LocalTime lt3 = LocalTime.parse("11:22:00");
        System.out.println("-----------------------------------------");
        System.out.println("lt1    = " + lt1);
        System.out.println("lt2    = " + lt2);
        System.out.println("lt3    = " + lt3);

        DateTimeFormatter localTimeFormatter = DateTimeFormatter.ISO_LOCAL_TIME;
        String lt1Str = lt1.truncatedTo(ChronoUnit.SECONDS).format(localTimeFormatter);
        System.out.println("lt1Str = " + lt1Str);
        System.out.println("-----------------------------------------");

        /**
         * 2. Basic properties.
         */
        LocalTime now = LocalTime.now();
        int hour   = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int nano   = now.getNano();
        System.out.println("now    = " + now);
        System.out.println("hour   = " + hour);
        System.out.println("minute = " + minute);
        System.out.println("second = " + second);
        System.out.println("nano   = " + nano);
        System.out.println("-----------------------------------------");

        /**
         * 3. Utility methods.
         */
        LocalTime lt = LocalTime.now();
        LocalTime addTwoHours = lt.plusHours(2);
        LocalTime minus30Mins = lt.minus(30, ChronoUnit.MINUTES);
        LocalTime withHour3   = lt.withHour(3);
        System.out.println("now         = " + lt);
        System.out.println("addTwoHours = " + addTwoHours);
        System.out.println("minus30Mins = " + minus30Mins);
        System.out.println("withHour3   = " + withHour3);
        System.out.println("-----------------------------------------");
    }
}
