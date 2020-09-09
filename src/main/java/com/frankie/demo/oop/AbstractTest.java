package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 14:34
 */
public class AbstractTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle("绿色", 3, 4, 5);
        Shape s2 = new Circle("红色", 5);
        System.out.println(s1.getType());
        System.out.println(s1.getColor());
        System.out.println(s2.getType());
        System.out.println(s2.getColor());
    }
}
