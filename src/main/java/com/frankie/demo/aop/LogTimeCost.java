package com.frankie.demo.aop;

import java.lang.annotation.*;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 15:41
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogTimeCost {

    /** 自定日志写入消息 */
    String msg() default "";

    /** 自定义记录耗时的阈值 */
    int threshold() default 0;
}
