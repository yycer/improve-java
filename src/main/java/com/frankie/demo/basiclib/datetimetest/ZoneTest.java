package com.frankie.demo.basiclib.datetimetest;

import java.time.ZoneId;
import java.util.Set;

/**
 * @author: Yao Frankie
 * @date: 2020/9/11 13:56
 */
public class ZoneTest {

    public static void main(String[] args) {

        Set<String> zonedIds = ZoneId.getAvailableZoneIds();
        zonedIds.forEach(System.out::println);
        System.out.println(zonedIds.size());
    }
}
