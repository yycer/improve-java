package com.frankie.demo.lambda.restudy20200817;

/**
 * @author: Yao Frankie
 * @date: 2020/8/17 13:31
 */
public class AnonymousInnerClass {


    /**
     * 三种局部变量
     * 1. 非final局部变量
     * 2. final局部变量
     * 3. 外部类成员变量
     */
    private int n3 = 30;
    public void add(){
        int n1 = 10;
        final int n2 = 20;
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                int cur1 = n1 + 10;
                int cur2 = n2 + 10;
                int cur3 = n3 + 10;
                System.out.println(cur1);
                System.out.println(cur2);
                System.out.println(cur3);
                System.out.println("Anonymous inner class.");
            }
        };
    }
}
