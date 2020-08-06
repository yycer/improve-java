package com.frankie.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author: Yao Frankie
 * @date: 2020/8/5 09:33
 */
@Aspect
@Component
public class EmployeeAspect {

    @Before(value = "execution(* com.frankie.demo.aop.EmployeeService.*(..)) && args(name, id)")
    public void beforeAdvice(JoinPoint joinPoint, int id, String name){
        System.out.println("Before method:" + joinPoint.getSignature());
        System.out.println("Creating Employee with name - " + name + " and id - " + id);
    }

}
