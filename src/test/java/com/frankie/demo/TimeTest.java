package com.frankie.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;

/**
 * @author: Yao Frankie
 * @date: 2020/3/6 08:41
 */
@SpringBootTest(classes = TimeTest.class)
public class TimeTest {

    @Test
    void calendarTest(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2003, 7, 31);
        calendar.set(Calendar.MONTH, 8);
//        System.out.println(calendar.getTime());
        calendar.set(Calendar.DATE, 5);
        System.out.println(calendar.getTime());
    }

    @Test
    void dateTest(){
        Date date = new Date();
        System.out.println(date);
//        System.out.println(date.toInstant());
    }

    @Test
    void dateVsLocalDateTimeTest(){
        Date date = new Date();
        System.out.println(date);
//        date.setMonth(0);
//        date.setHours(0);
//        date.setMinutes(0);
//        date.setSeconds(0);
        System.out.println(date);

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//
//        now = now.withMonth(1);
//        System.out.println(now);
    }
}
