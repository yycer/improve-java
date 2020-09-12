package com.frankie.demo.basiclib.datetimetest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: Yao Frankie
 * @date: 2020/9/12 16:15
 */
public class FormatAndParseTest {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("-----------------------------------------");
        System.out.println("now         = " + now);
        String formattedDT = now.format(formatter);
        System.out.println("formattedDT = " + formattedDT);
        System.out.println("-----------------------------------------");

        String dtStr = "2020-10-01 08:30:30";
        LocalDateTime ldt = LocalDateTime.parse(dtStr, formatter);
        System.out.println("dtStr       = " + dtStr);
        System.out.println("ldt         = " + ldt);
        System.out.println("-----------------------------------------");
    }
}
