package com.frankie.demo.classloader;

import java.lang.reflect.InvocationTargetException;

/**
 * @author: Yao Frankie
 * @date: 2020/3/29 22:12
 */
public class Child {

    public static void main(String[] args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException,
            InstantiationException {
        /** 1.1. new **/
//        new Parent();

//        Execute static block in Parent class.
//        Execute common block in Parent class.
//        Execute constructor in Parent class.

        /** 1.2. getStatic **/
//         int ret = Parent.staticVar;
//        Execute static block in Parent class.

        /** 1.3. putStatic **/
//        Parent.staticVar = 2;
//        Execute static block in Parent class.

        /** 1.4. invokeStatic **/
//        Parent.staticMethod();
//        Execute static block in Parent class.
//        Execute staticMethod() in Parent class.

        /** 2. Parent first **/
//        new Child();
//        Execute static block in Parent class.
//        Execute common block in Parent class.
//        Execute constructor in Parent class.

        /** 3. Reflection **/
        Class<Parent> parentClass = Parent.class;
        Parent parent = parentClass.getConstructor().newInstance();
        parent.instanceMethod();

//        Execute static block in Parent class.
//        Execute common block in Parent class.
//        Execute constructor in Parent class.
//        Execute instanceMethod() in Parent class.
    }
}
