package com.frankie.demo.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: Yao Frankie
 * @date: 2020/7/22 08:57
 */
public class MyHandler implements InvocationHandler {

    public MyHandler(Object realObject) {
        this.realObject = realObject;
    }

    private Object realObject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("验证权限");
        method.invoke(realObject, args);
        System.out.println("添加日志");
        System.out.println("--------------------");
        return null;
    }
}
