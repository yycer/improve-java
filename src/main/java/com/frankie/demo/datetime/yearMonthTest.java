package com.frankie.demo.datetime;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 * @author: Yao Frankie
 * @date: 2020/4/28 14:36
 */
public class yearMonthTest {

    public static void main(String[] args) {
        compareTest();
    }

    public static void compareTest(){
        String ym1 = "202004";
        String ym2 = "201908";
        String ym3 = "202002";
        String ym4 = "202006";
        String ym5 = "202012";
        String ym6 = "201008";

        ArrayList<String> list = new ArrayList<>();
        list.add(ym1);
        list.add(ym2);
        list.add(ym3);
        list.add(ym4);
        list.add(ym5);
        list.add(ym6);

        for (String s: list){
            compare(s);
        }
    }

    public static void compare(String ym){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMM");
        YearMonth curYM = YearMonth.from(LocalDate.now());
        YearMonth inputYM = YearMonth.parse(ym, formatter);
        long monthsBetween = ChronoUnit.MONTHS.between(curYM, inputYM);
        System.out.println(monthsBetween);
    }
}
