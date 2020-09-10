package com.frankie.demo.basiclib;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 11:05
 */
public class ArgsTest {

    public static void main(String[] args) {

        System.out.println(args.length);

        for (var s: args){
            System.out.println(s);
        }
    }
}
