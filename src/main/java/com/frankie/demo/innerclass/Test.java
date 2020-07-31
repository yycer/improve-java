package com.frankie.demo.innerclass;

/**
 * @author: Yao Frankie
 * @date: 2020/7/29 09:01
 */
public class Test {

    public static void main(String[] args) {
//        Circle c = new Circle(10);
//        Circle.Draw draw = c.new Draw();
//        draw.drawShape();

        Out out = new Out();
        Out.Inner inner = out.getInnerInstance();
        inner.printNum();
    }

    public static void m1(int a){
        System.out.println(a);
    }

    public static void m1(int a, int b){
        System.out.println(a + b);
    }
}
