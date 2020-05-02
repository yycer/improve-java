package com.frankie.demo.collection;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Yao Frankie
 * @date: 2020/4/26 14:14
 */
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>(4);
        chm.put("city2", "sh2");
        chm.put("city3", "sh3");
        chm.put("city13", "sh13");
        chm.put("city14", "sh14");
        String city2 = chm.get("city2");
        System.out.println(city2);
//
//        for (int i = 0; i < 100; i++){
//            StringBuilder city = new StringBuilder("city");
//            int hash = hash(new String(city.append(i)));
//            if (((hash >>> 28) & 15) == 2){
//                System.out.println(i);
//            }
//        }
    }

    public static int hash(Object k){

        int h = 0;
        h ^= k.hashCode();

        // Spread bits to regularize both segment and index locations,
        // using variant of single-word Wang/Jenkins hash.
        h += (h <<  15) ^ 0xffffcd7d;
        h ^= (h >>> 10);
        h += (h <<   3);
        h ^= (h >>>  6);
        h += (h <<   2) + (h << 14);
        return h ^ (h >>> 16);
    }
}
