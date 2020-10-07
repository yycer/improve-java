package com.frankie.demo.quartz;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author: Yao Frankie
 * @date: 2020/10/6 21:25
 */
public class TimeUtils {

    public static Date localDateTime2Date(LocalDateTime ldt){
        return Date.from(ldt.atZone(ZoneId.of("Asia/Shanghai")).toInstant());
    }
}
