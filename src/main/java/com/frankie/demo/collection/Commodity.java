package com.frankie.demo.collection;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * @author: Yao Frankie
 * @date: 2020/7/25 18:36
 */
@Setter
@Getter
public class Commodity {

    private String name;
    private Double price;

    public Commodity(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return Objects.equals(name, commodity.name) &&
                Objects.equals(price, commodity.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
