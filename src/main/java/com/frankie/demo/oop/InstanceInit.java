package com.frankie.demo.oop;

import lombok.Getter;

/**
 * @author: Yao Frankie
 * @date: 2020/3/1 21:30
 */
@Getter
public class InstanceInit {

    public InstanceInit(){
        this.age = 40;
    }

    {
        age = 10;
    }

    int age = 20;

    {
        age = 30;
    }
}
