package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 14:32
 */
public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double calPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
