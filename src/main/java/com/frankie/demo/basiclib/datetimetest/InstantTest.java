package com.frankie.demo.basiclib.datetimetest;

import java.time.Instant;

/**
 * @author: Yao Frankie
 * @date: 2020/9/12 15:16
 */
public class InstantTest {

    public static void main(String[] args) {

        // UTC: 2020-09-12T07:16:31.666012400Z
        Instant now = Instant.now();
        int nano = now.getNano();
        long epochSecond = now.getEpochSecond();
        long milliseconds = now.toEpochMilli();

        System.out.println("now          = " + now);
        System.out.println("nano         = " + nano);
        System.out.println("epochSecond  = " + epochSecond);
        System.out.println("milliseconds = " + milliseconds);
    }
}
