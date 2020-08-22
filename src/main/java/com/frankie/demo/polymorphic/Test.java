package com.frankie.demo.polymorphic;

/**
 * @author: Yao Frankie
 * @date: 2020/8/21 07:51
 */
public class Test {

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new B();
        B b  = new B();
        C c  = new C();
        D d  = new D();

        System.out.println("1--" + a1.show(b)); // aa
        System.out.println("2--" + a1.show(c)); // aa
        System.out.println("3--" + a1.show(d)); // ad
        System.out.println("4--" + a2.show(b)); // bb -> ba
        System.out.println("5--" + a2.show(c)); // bb -> ba
        System.out.println("6--" + a2.show(d)); // ad
        System.out.println("7--" + b.show(b));  // bb
        System.out.println("8--" + b.show(c));  // bb
        System.out.println("9--" + b.show(d));  // bb -> ad
    }
}
