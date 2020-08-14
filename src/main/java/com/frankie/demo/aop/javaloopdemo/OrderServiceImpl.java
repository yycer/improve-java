package com.frankie.demo.aop.javaloopdemo;

import org.springframework.stereotype.Component;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 19:12
 */
@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public Order createOrder(String username, String product) {
        Order order = new Order();
        order.setUsername(username);
        order.setProduct(product);
        return order;
    }

    @Override
    public Order queryOrder(String username) {
        Order order = new Order();
        order.setUsername("test");
        order.setProduct("test");
        return order;
    }
}
