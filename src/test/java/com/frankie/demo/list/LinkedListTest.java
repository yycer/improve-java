package com.frankie.demo.list;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedList;

/**
 * @author: Yao Frankie
 * @date: 2020/4/25 14:59
 */
@SpringBootTest(classes = LinkedListTest.class)
public class LinkedListTest {

    @Test
    public void addTest(){
        LinkedList<String> ll = new LinkedList<>();
        boolean ret1 = ll.add("yyc");
        boolean ret2 = ll.add("frankie");
    }

    @Test
    public void removeTest(){
        LinkedList<String> ll = new LinkedList<>();
        boolean ret1 = ll.add("yyc");
        boolean ret2 = ll.add("frankie");
        boolean ret3 = ll.add("Jack");
        ll.remove("frankie");
    }

}
