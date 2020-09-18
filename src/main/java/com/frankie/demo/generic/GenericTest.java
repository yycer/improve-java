package com.frankie.demo.generic;

import java.util.LinkedList;

/**
 * @author: Yao Frankie
 * @date: 2020/9/18 07:47
 */
public class GenericTest {

    public static void main(String[] args) {

        LinkedList<String>  strList = new LinkedList<>();
        LinkedList<Integer> intList = new LinkedList<>();
        System.out.println(strList.getClass());
        System.out.println(intList.getClass());
        System.out.println(strList.getClass() == intList.getClass());
    }
}
