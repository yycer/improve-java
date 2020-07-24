package com.frankie.demo.java8;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/7/24 16:54
 */
@Setter
@Getter
public class Transaction{

    private Trader trader;
    private int    year;
    private int    value;

    public Transaction(Trader trader, int year, int value)
    {
        this.trader = trader;
        this.year   = year;
        this.value  = value;
    }

    @Override
    public String toString(){
        return "{" + this.trader + ", " +
                "year: " + this.year   + ", " +
                "value:" + this.value  + "}";
    }
}
