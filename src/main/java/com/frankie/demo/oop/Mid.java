package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/2/29 20:05
 */
public class Mid extends Root{

    static {
        System.out.println("Mid static init block.");
    }

    {
        System.out.println("Mid init block.");
    }

    public Mid(){
        System.out.println("Mid constructor.");
    }

    public Mid(String name){
        this();
        System.out.println(name + " in Mid constructor.");
    }
}
