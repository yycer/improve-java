package com.frankie.demo;

import com.frankie.demo.plus.Order;
import com.frankie.demo.plus.OrderComparator;
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
        Product a = new Product("A", 50);
        Product b = new Product("B", 10);
        Product c = new Product("C", 15);

        ArrayList<Product> products = new ArrayList<>();
        products.add(a);
        products.add(b);
        products.add(c);
        Collections.sort(products);
        System.out.println(products);
    }

    @Test
    void comparatorTest1(){
        Order a = new Order("a", 200.00d);
        Order b = new Order("b", 200.00d);
        Order c = new Order("c", 188.00d);
        Order d = new Order("d", 300.00d);

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(a);
        orders.add(b);
        orders.add(c);
        orders.add(d);

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















