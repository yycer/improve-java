package com.frankie.demo.aop.javaloopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 19:15
 */
@Aspect
@Component
public class LogAspect2 {

    @Pointcut("execution(* com.frankie.demo.aop.javaloopdemo.*.create*(..))")
    public void logArgs(){ }

    @Pointcut("execution(* com.frankie.demo.aop.javaloopdemo.*.query*(..))")
    public void logResult(){ }


    @Before("logArgs()")
    public void logArgsAdvice(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("准备执行方法: " + method.getName()
                         + ", 参数列表：" + Arrays.toString(joinPoint.getArgs()));
    }

    @Around("logResult()")
    public void logResultAdvice(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        System.out.println(method.getName() + "方法返回：" + pjp.proceed());
    }
}
