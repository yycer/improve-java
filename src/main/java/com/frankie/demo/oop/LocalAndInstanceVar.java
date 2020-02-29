package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/2/29 09:41
 */
public class LocalAndInstanceVar {

    public int num = 10;

    public void printNum(){
        int num = 20;
        System.out.println("num = " + num);
        // this is liv.
        System.out.println("this.num = " + this.num);
    }
}
