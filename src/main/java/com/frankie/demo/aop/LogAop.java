package com.frankie.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 15:29
 */
@Aspect
@Component
public class LogAop {

    /**
     * 定义切入点
     * execution(方法修饰符_返回类型_类路径_方法名_参数)
     */
//    @Pointcut("execution(public * com.frankie.demo.aop.*.*(..))")
//    public void controllerLog(){
//    }

    /** 切点 */
    @Pointcut("@annotation(com.frankie.demo.aop.LogTimeCost)")
    public void logPointCut(){

    }

    @Around("logPointCut()")
    public Object logCostTime(ProceedingJoinPoint pjp) throws Exception {
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        Logger logger = LoggerFactory.getLogger(method.getClass());

        // 记录方法执行方法参数
        Object[] args = pjp.getArgs();
        logger.info("args = " + Arrays.toString(args));

        // 获取方法上LogTimeCost注解的参数
        String msg = "";
        int threshold = 0;
        if (method.isAnnotationPresent(LogTimeCost.class)){
            LogTimeCost annotation = method.getAnnotation(LogTimeCost.class);
            msg = annotation.msg();
            threshold = annotation.threshold();
        }

        long s = System.currentTimeMillis();
        try {
            return pjp.proceed();
        } catch (Throwable throwable) {
            throw new Exception(throwable);
        } finally {
            long e = System.currentTimeMillis();
            long gap = e - s;
            if (gap > threshold){
                logger.info("{} [{}] cost {}ms", method.getName(), msg, gap);
            }
        }
    }
}
