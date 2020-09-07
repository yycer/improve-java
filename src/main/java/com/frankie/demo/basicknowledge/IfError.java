package com.frankie.demo.basicknowledge;

/**
 * @author: Yao Frankie
 * @date: 2020/9/7 10:41
 */
public class IfError {

    public static void main(String[] args) {

        int age = 45;
        if (age > 60){
            System.out.println("青年人");
        } else if (age > 40){
            System.out.println("中年人");
        } else if (age > 20){
            System.out.println("老年人");
        }
    }
}
