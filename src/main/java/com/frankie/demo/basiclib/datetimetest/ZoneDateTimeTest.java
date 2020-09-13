package com.frankie.demo.basiclib.datetimetest;

import java.time.*;

/**
 * @author: Yao Frankie
 * @date: 2020/9/12 15:02
 */
public class ZoneDateTimeTest {

    public static void main(String[] args) {

        /**
         * 1. Create a ZonedDateTime instance.
         */
        ZonedDateTime shDt    = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime lsDT    = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime parisDT = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("shDt    = " + shDt);
        System.out.println("lsDT    = " + lsDT);
        System.out.println("parisDT = " + parisDT);
//        shDt    = 2020-09-12T15:06:46.609112900+08:00[Asia/Shanghai]
//        lsDT    = 2020-09-12T00:06:46.610617900-07:00[America/Los_Angeles]
//        parisDT = 2020-09-12T09:06:46.612123200+02:00[Europe/Paris]


//        OffsetDateTime offsetDT = OffsetDateTime.now();
//        System.out.println("offsetDT = " + offsetDT);

        LocalDateTime ldt = LocalDateTime.of(2020, 10, 1, 8, 30, 00);
        ZoneOffset offset = ZoneOffset.of("-15:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(ldt, offset);
        System.out.println("offsetDateTime = " + offsetDateTime);

    }
}
