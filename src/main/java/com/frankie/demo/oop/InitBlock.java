package com.frankie.demo.oop;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/2/29 19:55
 */
@Setter
@Getter
public class InitBlock {

    {
        b = 10;
    }

    int b = 20;

    public InitBlock(){
        System.out.println("InitBlock constructor.");
    }

//    {
//        var a = 10;
//        if (a > 5){
//            System.out.println("First init block");
//        }
//    }

    {
        System.out.println("Second init block");
    }


}
