package com.frankie.demo.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Yao Frankie
 * @date: 2020/5/12 10:05
 */
public class StringJoinerTest {

    public static void main(String[] args) {

//        StringJoiner sj1 = new StringJoiner(":");
//        sj1.add("asan");
//        sj1.add("pangzi");
//        System.out.println(sj1);
//
//        StringJoiner sj2 = new StringJoiner(":", "[", "]");
//        sj2.add("yyc");
//        sj2.add("asan");
//        sj2.add("pangzi");
//        System.out.println(sj2);

//        connectTest1();
        connectTest2();
    }

    private static void connectTest2() {
        List<String> names = Arrays.asList("yyc", "asan", "pangzi");
        String ret = String.join(",", names);
        System.out.println(ret);
    }

    private static void connectTest1() {
        List<String> names = Arrays.asList("yyc", "asan", "pangzi");
        StringBuilder sb = new StringBuilder();
        for (String name: names){
            sb.append(name);
            sb.append(",");
        }
        System.out.println(sb.subSequence(0, sb.length() - 1));
    }
}
