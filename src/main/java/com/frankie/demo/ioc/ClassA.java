package com.frankie.demo.ioc;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/8/18 19:11
 */
@Setter
@Getter
public class ClassA {

    private ClassB b;

    public void print(){
        System.out.println("aaaa");
    }
}
