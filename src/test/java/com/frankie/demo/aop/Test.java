package com.frankie.demo.aop;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: Yao Frankie
 * @date: 2020/8/5 09:13
 */
@SpringBootTest(classes = Test.class)
@RunWith(SpringRunner.class)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Test {

    @org.junit.Test
    public void test(){
        EmployeeService employeeService = new EmployeeService();
        Employee frankie = employeeService.createEmployee(1, "frankie");
        System.out.println(frankie);
    }
}
