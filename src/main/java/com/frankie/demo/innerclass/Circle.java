package com.frankie.demo.innerclass;

/**
 * @author: Yao Frankie
 * @date: 2020/7/29 09:00
 */
public class Circle {

    private double radius = 0d;
    public static int count = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    class Draw{
        public void drawShape() {
            System.out.println(radius); // 外部类的private成员
            System.out.println(count);  // 外部类的静态成员
        }
    }
}
