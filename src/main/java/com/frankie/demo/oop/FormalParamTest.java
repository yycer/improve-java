package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/9/8 19:24
 */
public class FormalParamTest {

    public static void main(String[] args) {

        DataWrap dw = new DataWrap(3, 5);
        swap(dw);
        System.out.println("----------------");
        System.out.println("a = " + dw.getA());
        System.out.println("b = " + dw.getB());
    }

    private static void swap(DataWrap dw) {
        dw.setA(10);
        dw.setB(20);
        dw = null;
//        System.out.println("a = " + dw.getA());
//        System.out.println("b = " + dw.getB());
    }
}
