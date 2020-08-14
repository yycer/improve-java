package com.frankie.demo.aop.javaloopdemo;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 19:11
 */
public interface OrderService {

    Order createOrder(String username, String product);

    Order queryOrder(String username);
}
