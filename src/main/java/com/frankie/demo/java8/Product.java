package com.frankie.demo.java8;

import lombok.Getter;

/**
 * @author: Yao Frankie
 * @date: 2020/7/24 16:49
 */
@Getter
public class Product{

    private String name;
    private int    price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}