package com.frankie.demo.basiclib.datetimetest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author: Yao Frankie
 * @date: 2020/9/12 16:09
 */
public class TemporalAdjustersTest {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDate firstDayOfMonth     = date.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate firstDayOfYear      = date.with(TemporalAdjusters.firstDayOfYear());
        LocalDate firstDayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
        LocalDate firstDayOfNextYear  = date.with(TemporalAdjusters.firstDayOfNextYear());
        LocalDate firstFriday         = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY));
        LocalDate lastDayOfMonth      = date.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate lastDayOfYear       = date.with(TemporalAdjusters.lastDayOfYear());
        LocalDate lastSaturday        = date.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));

        System.out.println("firstDayOfMonth     = " + firstDayOfMonth);
        System.out.println("firstDayOfYear      = " + firstDayOfYear);
        System.out.println("firstDayOfNextMonth = " + firstDayOfNextMonth);
        System.out.println("firstDayOfNextYear  = " + firstDayOfNextYear);
        System.out.println("firstFriday         = " + firstFriday);
        System.out.println("lastDayOfMonth      = " + lastDayOfMonth);
        System.out.println("lastDayOfYear       = " + lastDayOfYear);
        System.out.println("lastSaturday        = " + lastSaturday);
    }
}
