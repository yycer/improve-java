package com.frankie.demo.basiclib.datetimetest;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: Yao Frankie
 * @date: 2020/9/12 16:23
 */
public class CompatibilityTest {

    public static void main(String[] args) {

        Date date = new Date();
        Instant dateInstant = date.toInstant();
        LocalDateTime ldt1 = LocalDateTime.ofInstant(dateInstant, ZoneId.systemDefault());
        System.out.println("-----------------------------------------");
        System.out.println("date     = " + date);
        System.out.println("ldt1     = " + ldt1);
        System.out.println("-----------------------------------------");

        Calendar calendar = Calendar.getInstance();
        Instant calInstant = calendar.toInstant();
        LocalDateTime ldt2 = LocalDateTime.ofInstant(calInstant, ZoneId.of("Asia/Shanghai"));
        System.out.println("calendar = " + calendar.getTime());
        System.out.println("ldt2     = " + ldt2);
        System.out.println("-----------------------------------------");
    }
}
