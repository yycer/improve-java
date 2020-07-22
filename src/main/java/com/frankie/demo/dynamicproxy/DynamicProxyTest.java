package com.frankie.demo.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author: Yao Frankie
 * @date: 2020/7/22 08:58
 */
public class DynamicProxyTest {

    public static void main(String[] args) {

        StudentImpl student = new StudentImpl();
        IStudent s = (IStudent) Proxy.newProxyInstance(
                StudentImpl.class.getClassLoader(),
                StudentImpl.class.getInterfaces(),
                new MyHandler(student));
        s.add();
        s.delete();

        TeacherImpl teacher = new TeacherImpl();
        ITeacher t = (ITeacher) Proxy.newProxyInstance(
                TeacherImpl.class.getClassLoader(),
                TeacherImpl.class.getInterfaces(),
                new MyHandler(teacher));
        t.add();
        t.delete();
    }
}
