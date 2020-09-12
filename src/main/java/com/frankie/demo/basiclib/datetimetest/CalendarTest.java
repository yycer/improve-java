package com.frankie.demo.basiclib.datetimetest;

import java.util.Calendar;

/**
 * @author: Yao Frankie
 * @date: 2020/9/11 14:52
 */
public class CalendarTest {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.SEPTEMBER, 12, 15, 56, 00);

        int year        = calendar.get(Calendar.YEAR);
        int month       = calendar.get(Calendar.MONTH);
        int dayOfMonth  = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek   = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear  = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        int hour        = calendar.get(Calendar.HOUR);
        int hourOfDay   = calendar.get(Calendar.HOUR_OF_DAY);
        int minute      = calendar.get(Calendar.MINUTE);
        int second      = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);

        System.out.println("year        = " + year);
        System.out.println("month       = " + month);
        System.out.println("dayOfMonth  = " + dayOfMonth);
        System.out.println("dayOfWeek   = " + dayOfWeek);
        System.out.println("weekOfYear  = " + weekOfYear);
        System.out.println("weekOfMonth = " + weekOfMonth);
        System.out.println("hour        = " + hour);
        System.out.println("hourOfDay   = " + hourOfDay);
        System.out.println("minute      = " + minute);
        System.out.println("second      = " + second);
        System.out.println("millisecond = " + millisecond);

    }
}
