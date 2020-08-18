package com.frankie.demo.ioc;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/8/18 19:11
 */
@Setter
@Getter
public class ClassB {

    private ClassA a;

    public void run(){
        System.out.println("ClassB start to run.");
    }
}
