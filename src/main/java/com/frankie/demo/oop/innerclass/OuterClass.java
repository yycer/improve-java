package com.frankie.demo.oop.innerclass;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 16:00
 */
public class OuterClass {

    int x = 10;

    private int a = 20;

    class InnerClass{
        int y = 5;

        public int getPrivateField(){
            return a;
        }
    }
}
