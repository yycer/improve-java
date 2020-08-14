package com.frankie.demo.aop.javaloopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 19:30
 */
@Controller
public class JavaLoopController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @GetMapping("/javaloop/test")
    public void test(){

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();

//        orderService.createOrder("Leo", "随便买点什么");
//        orderService.queryOrder("Leo");
    }
}
