package com.frankie.demo.jvm;

/**
 * @author: Yao Frankie
 * @date: 2020/3/14 16:59
 */
public class Order{

    public static int orderType = 20;
    private String orderId;

    public Order(String orderId){
        this.orderId = orderId;
    }

    public String getOrderDetail(String orderId){
        justDoSomething();
        return "mockOrderDetail";
    }

    private void justDoSomething() {
    }
}
