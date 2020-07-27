package com.frankie.demo.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author: Yao Frankie
 * @date: 2020/7/27 09:08
 */
public class ModCountTest {

    public static void main(String[] args) {

        List<String> names = new CopyOnWriteArrayList<>();
        names.add("yyc");
        names.add("frankie");
        names.add("asan");

        names.remove("asan");
        System.out.println(names);
    }

    private static void arrayListTest() {
        ArrayList<String> names = new ArrayList<>();
        names.add("yyc");
        names.add("frankie");
        names.add("asan");

        names.removeIf("asan"::equals);
        System.out.println(names);
    }
}
