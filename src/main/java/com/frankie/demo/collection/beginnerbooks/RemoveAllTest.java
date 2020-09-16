package com.frankie.demo.collection.beginnerbooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Yao Frankie
 * @date: 2020/9/16 19:32
 */
public class RemoveAllTest {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

//        List<Integer> l2 = new ArrayList<>();
//        l2.add(1);
//        l2.add(3);
//        l2.add(5);

        List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 3, 5));

        // 使用removeAll(Collection)求交集
        l2.removeAll(l1); // 5
        l1.addAll(l2);
        System.out.println(l1); // 1, 2, 3, 5

        /** My way. */
//        l1.addAll(l2);
//        l1.stream().distinct().forEach(System.out::println);
    }
}
