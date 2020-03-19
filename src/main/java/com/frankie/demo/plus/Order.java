package com.frankie.demo.plus;

import lombok.Getter;

/**
 * @author: Yao Frankie
 * @date: 2020/3/19 21:54
 */
@Getter
public class Order {

    private String userName;
    private double total;

    public Order(String userName, double total) {
        this.userName = userName;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userName='" + userName + '\'' +
                ", total=" + total +
                '}';
    }
}
