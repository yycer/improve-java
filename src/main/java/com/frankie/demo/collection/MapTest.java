package com.frankie.demo.collection;

import java.util.HashMap;

/**
 * @author: Yao Frankie
 * @date: 2020/4/26 12:53
 */
public class MapTest {

    public static void testMap(){
        HashMap<String, String> map = new HashMap<>(2);
        map.put("K1", "V1");
        map.put("K2", "V2");
        map.put("K2", "V3");
        map.put(null, "V4");
        map.put(null, "V5");
        map.remove("K2");
        System.out.println(map);
    }

    public static void main(String[] args) {
//        testMap();
//        justTest();
        resizeTest();
    }

    private static void resizeTest() {
        HashMap<String, String> map = new HashMap<>(2);
        map.put("K1", "V1");
        map.put("K2", "V2");
        map.put("K3", "V3");
//        String k2 = map.get("K2");
        System.out.println(map);
    }

    private static void justTest() {
        HashMap<String, String> map = new HashMap<>(2);
        map.put("K1", "V1");
        map.put(null, "1");
        System.out.println(map);
    }



    public static int hash(Object k){
        int h = 0;

        h ^= k.hashCode();

        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
}
