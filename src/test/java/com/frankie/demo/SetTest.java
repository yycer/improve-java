package com.frankie.demo;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author: Yao Frankie
 * @date: 2020/4/25 10:23
 */
@SpringBootTest
public class SetTest {

    @Test
    public void addTest(){
        HashSet<String> set = new HashSet<>(3);
        set.add(null);
        boolean r1 = set.add("yyc");
        boolean r2 = set.add("yyc");

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(2);
//        treeSet.add(null);
        /** [1, 2, 3, 5] */
        System.out.println(treeSet);
        /** (-∞, 3): [1, 2] */
        System.out.println("(-∞, 3): " + treeSet.headSet(3));
        /** [3, +∞): [3, 5] */
        System.out.println("[3, +∞): " + treeSet.tailSet(3));
        /** [-2, 3): [1, 2] */
        System.out.println("[-2, 3): " + treeSet.subSet(-2, 3));
    }

}
