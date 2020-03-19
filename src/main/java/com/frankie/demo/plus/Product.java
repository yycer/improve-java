package com.frankie.demo.plus;

import lombok.Getter;

/**
 * @author: Yao Frankie
 * @date: 2020/3/19 21:47
 */
@Getter
public class Product implements Comparable<Product>{

    private String name;
    private int    price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice() - o.getPrice();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
