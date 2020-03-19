package com.frankie.demo.plus;

import java.util.Comparator;

/**
 * @author: Yao Frankie
 * @date: 2020/3/19 22:03
 */
public class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return (int) (o1.getTotal() - o2.getTotal());
    }
}
