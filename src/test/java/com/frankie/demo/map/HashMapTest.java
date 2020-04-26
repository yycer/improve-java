package com.frankie.demo.map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

/**
 * @author: Yao Frankie
 * @date: 2020/4/26 08:12
 */
@SpringBootTest(classes = HashMapTest.class)
public class HashMapTest {

    @Test
    public void addTest(){
        HashMap<String, String> map = new HashMap<>();
        map.put("K1", "V1");
        map.put("K2", "V2");
        map.put("K3", "V3");
        System.out.println(map);
    }
}
