package com.frankie.demo.basiclib.datetimetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Yao Frankie
 * @date: 2020/9/11 14:12
 */
public class DateTest {

    public static void main(String[] args) {

        // 1. Years start from 1900, months are zero-index based.
        Date date1 = new Date(120, 5, 10);
        // Wed Jun 10 00:00:00 CST 2020
        // System.out.println(date1);

        // 2. Lack of any kind of control or validation of what is given as input to the constructor.
        Date date2 = new Date(120, 5, 31);
        Date date3 = new Date(120, 6, 1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date2.equals(date3));


        // 3. Mutable.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            es.submit(() -> {
                try {
                    System.out.println(sdf.parse("15081947"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
        }
        es.shutdown();

//        Thu Aug 16 00:00:00 CST 1509
//        Thu Aug 16 00:00:00 CST 1509
//        Thu Aug 16 00:00:00 CST 1509
//        Sat Apr 16 00:00:00 CST 1137
//        Sat Apr 16 00:00:00 CST 1137
//        Thu Aug 16 00:00:00 CST 1509
//        Thu Aug 16 00:00:00 CST 1509
    }
}
