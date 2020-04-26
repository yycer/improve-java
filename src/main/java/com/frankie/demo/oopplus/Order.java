package com.frankie.demo.oopplus;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/3/2 20:40
 */
@Setter
@Getter
public class Order {

    private static int orderType = 10;
    public int a = 0;
    private String orderId;

    static {
//        orderType = a;
    }

    public Order(String orderId){
        this.orderId = orderId;
    }

    public void justTest(){
        System.out.println(orderType);
    }

//    @Override
//    public boolean equals(Object o){
//        if (this == o)
//            return true;
//
//        if (o != null && o.getClass() == Order.class){
//            var order = (Order) o;
//            return order.getOrderId().equals(this.getOrderId());
//        }
//        return false;
//    }
}