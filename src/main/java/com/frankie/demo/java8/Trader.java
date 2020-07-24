package com.frankie.demo.java8;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/7/24 16:54
 */
@Setter
@Getter
public  class Trader{

    private String name;
    private String city;

    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }

    @Override
    public String toString(){
        return "Trader:" + this.name + " in " + this.city;
    }
}