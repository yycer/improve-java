package com.frankie.demo;

import com.frankie.demo.plus.Order;
import com.frankie.demo.plus.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author: Yao Frankie
 * @date: 2020/3/19 21:50
 */
@SpringBootApplication
public class PlusTest {

    @Test
    void comparableTest(){
        Product olay  = new Product("Olay" , 50);
        Product tempo = new Product("Tempo", 10);
        Product cup   = new Product("Cup"  , 15);

        if (olay.compareTo(tempo) > 0){
            System.out.println("The price of Olay is more expensive than Tempo.");
        } else if (olay.compareTo(tempo) < 0){
            System.out.println("The price of Olay is cheaper than Tempo.");
        } else {
            System.out.println("The price of Olay is equals to Tempo.");
        }

        ArrayList<Product> products = new ArrayList<>();
        products.add(olay);
        products.add(tempo);
        products.add(cup);
        Collections.sort(products);
        System.out.println(products);
    }

    @Test
    void comparatorTest1(){
        Order jack = new Order("jack", 200.00d);
        Order asan = new Order("asan", 200.00d);
        Order yyc  = new Order("yyc" , 188.00d);
        Order qin  = new Order("qin" , 300.00d);

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(jack);
        orders.add(asan);
        orders.add(yyc);
        orders.add(qin);

//        Collections.sort(orders, new OrderComparator());
//        System.out.println(orders);

        // Situation1: Create a orderComparator class.
//        orders.sort(new OrderComparator());
//        System.out.println(orders);

        // Situation2: Using anonymous class.
//        orders.sort(new Comparator<Order>() {
//            @Override
//            public int compare(Order o1, Order o2) {
//                return (int) (o1.getTotal() - o2.getTotal());
//            }
//        });
//        System.out.println(orders);

        // Situation3: Using lambda.
//        orders.sort((o1, o2) -> (int) (o1.getTotal() - o2.getTotal()));
//        System.out.println(orders);

        // Situation4: Using comparing.
//        orders.sort(Comparator.comparing(Order::getTotal));
//        System.out.println(orders);


        orders.sort(Comparator.comparing(Order::getTotal)
            .reversed()
            .thenComparing(Order::getUserName));
        System.out.println(orders);
    }
}















