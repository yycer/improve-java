package com.frankie.demo.quartz;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * @author: Yao Frankie
 * @date: 2020/10/6 21:18
 */
public class TimeTest {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.of(2020, 10, 6, 21, 18, 20);
        Date date = Date.from(now.atZone(ZoneId.of("Asia/Shanghai")).toInstant());
        System.out.println(now);
        System.out.println(date);
    }
}
