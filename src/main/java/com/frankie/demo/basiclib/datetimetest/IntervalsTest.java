package com.frankie.demo.basiclib.datetimetest;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author: Yao Frankie
 * @date: 2020/9/12 15:22
 */
public class IntervalsTest {

    public static void main(String[] args) throws InterruptedException {

        LocalDateTime born = LocalDateTime.of(1949, 10, 1, 10, 00, 00);
        LocalDateTime now  = LocalDateTime.now();

        long years   = ChronoUnit.YEARS.between(born, now);
        long months  = ChronoUnit.MONTHS.between(born, now);
        long weeks   = ChronoUnit.WEEKS.between(born, now);
        long days    = ChronoUnit.DAYS.between(born, now);
        long hours   = ChronoUnit.HOURS.between(born, now);
        long minutes = ChronoUnit.MINUTES.between(born, now);
        long seconds = ChronoUnit.SECONDS.between(born, now);

        System.out.println("years   = " + years);
        System.out.println("months  = " + months);
        System.out.println("weeks   = " + weeks);
        System.out.println("days    = " + days);
        System.out.println("hours   = " + hours);
        System.out.println("minutes = " + minutes);
        System.out.println("seconds = " + seconds);

        LocalDateTime beg = LocalDateTime.now();
        Thread.sleep(1230);
        LocalDateTime end = LocalDateTime.now();
        long gap = ChronoUnit.MILLIS.between(beg, end);
        System.out.printf("Cost %sms \n", gap);
    }
}
