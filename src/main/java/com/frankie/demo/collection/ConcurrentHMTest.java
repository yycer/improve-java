package com.frankie.demo.collection;

import org.apache.commons.lang3.RandomUtils;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 14:55
 */
public class ConcurrentHMTest {

    public static void main(String[] args) {
        ConcurrentHashMap map = new ConcurrentHashMap<Order, String>(8);
        for (int i = 0; i < 1000000; i++){
            int a = RandomUtils.nextInt(0, 100000);
            map.put(Order.of(a + "", "2"), "1");
        }
        System.out.println("Done");
    }
}
