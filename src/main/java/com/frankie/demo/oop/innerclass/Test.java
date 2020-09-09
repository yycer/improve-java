package com.frankie.demo.oop.innerclass;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 16:00
 */
public class Test {

    public static void main(String[] args) {

        /** 1. Create the inner class instance. */
//        OuterClass oc = new OuterClass();
//        OuterClass.InnerClass ic = oc.new InnerClass();
//        System.out.println(oc.x + ic.y);

        /** 2. Access the private filed in outer class from the inner class */
        OuterClass.InnerClass ic = new OuterClass().new InnerClass();
        int a = ic.getPrivateField();
        System.out.println(a);
    }
}
