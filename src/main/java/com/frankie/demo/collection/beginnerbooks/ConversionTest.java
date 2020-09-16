package com.frankie.demo.collection.beginnerbooks;

import java.util.LinkedList;

/**
 * @author: Yao Frankie
 * @date: 2020/9/16 19:40
 */
public class ConversionTest {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("yyc");
        ll.add("Jack");
        ll.add("Alina");

//        String[] str = ll.toArray(new String[0]);
        String[] str = ll.toArray(new String[ll.size()]);
        for (String s: str){
            System.out.println(s);
        }
    }
}
