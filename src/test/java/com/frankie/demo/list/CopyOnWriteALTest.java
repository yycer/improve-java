package com.frankie.demo.list;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author: Yao Frankie
 * @date: 2020/4/25 16:22
 */
@SpringBootTest(classes = CopyOnWriteALTest.class)
public class CopyOnWriteALTest {

    @Test
    public void Test(){
        List<String> ll = new CopyOnWriteArrayList<>();
        boolean ret1 = ll.add("yyc");
        boolean ret2 = ll.add("frankie");
        boolean ret3 = ll.add("Jack");
        ll.get(0);
    }
}
