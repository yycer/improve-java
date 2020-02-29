package com.frankie.demo.oop;

/**
 * @author: Yao Frankie
 * @date: 2020/2/29 18:51
 */
public class ChildClass extends ParentClass {

    private String name;
    public String book = "ChildBook";

    public void child(){
        System.out.println("child() method in ChildClass.");
    }

//    @Override
//    public void test(){
//        System.out.println("test() method in ChildClass.");
//    }

        @Override
    public void test(){
        System.out.println(String.format("name = %s in test() method", name));
    }
}
