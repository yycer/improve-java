package com.frankie.demo.aop;

import com.frankie.demo.aop.javaloopdemo.OrderService;
import com.frankie.demo.aop.javaloopdemo.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: Yao Frankie
 * @date: 2020/8/5 09:13
 */
@SpringBootTest(classes = Test.class)
@RunWith(SpringRunner.class)
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Test {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;


    @org.junit.Test
    public void test(){
        EmployeeService employeeService = new EmployeeService();
        Employee frankie = employeeService.createEmployee(1, "frankie");
        System.out.println(frankie);
    }

    @org.junit.Test
    public void javaloopTest(){
        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();

        orderService.createOrder("Leo", "随便买点什么");
        orderService.queryOrder("Leo");
    }
}
