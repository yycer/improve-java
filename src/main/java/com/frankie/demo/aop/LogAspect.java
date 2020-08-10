package com.frankie.demo.aop;

import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author: Yao Frankie
 * @date: 2020/8/7 11:29
 */
@Aspect
@Component
public class LogAspect {

    private Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(* com.frankie.demo.aop.Plan.*.*(..))")
    public void logPointCut(){}


    @Around("logPointCut()")
    public Object logTimeCost(ProceedingJoinPoint pjp) throws Exception {

        long s = System.currentTimeMillis();
        try {
            return pjp.proceed();
        } catch (Throwable throwable) {
            throw new Exception(throwable);
        } finally {
            long e = System.currentTimeMillis();
            logger.info(String.format("Cost %dms\n", e - s));
        }
    }
}
