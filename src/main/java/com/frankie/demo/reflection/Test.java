package com.frankie.demo.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: Yao Frankie
 * @date: 2020/7/24 16:17
 */
public class Test {

    public int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) throws
            IllegalAccessException, InstantiationException,
            NoSuchMethodException, InvocationTargetException {

        Class<Test> testClass = Test.class;

        Test t = testClass.newInstance();
        Method add = testClass.getMethod("add", new Class[]{int.class, int.class});
        int ans = (int) add.invoke(t, 1, 2);
        System.out.println(ans);

    }
}
