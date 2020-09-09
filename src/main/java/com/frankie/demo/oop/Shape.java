package com.frankie.demo.oop;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 14:28
 */
@Setter
@Getter
public abstract class Shape {

    {
        System.out.println("执行Shape抽象类的初始化块。");
    }

    private String color;

    /** 计算周长 */
    public abstract double calPerimeter();

    /** 返回形状 */
    public abstract String getType();

    public Shape(){}

    public Shape(String color){
        System.out.println("执行Shape的构造器。");
        this.color = color;
    }
}
