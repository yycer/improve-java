package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 14:30
 */
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calPerimeter() {
        return a + b + c;
    }

    @Override
    public String getType() {
        return "Triangle";
    }
}
