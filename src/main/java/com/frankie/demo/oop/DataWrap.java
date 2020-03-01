package com.frankie.demo.oop;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/3/1 11:49
 */
@Setter
@Getter
public class DataWrap {

    private int a;
    private int b;

    public DataWrap(int a, int b){
        this.a = a;
        this.b = b;
    }
}
