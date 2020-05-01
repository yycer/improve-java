package com.frankie.demo.collection;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Yao Frankie
 * @date: 2020/4/26 14:14
 */
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
        chm.put("name", "yyc");
        chm.put("city", "Shanghai");
        chm.get("city");
        chm.size();
    }
}
