package com.frankie.demo.lambda.restudy20200817;

/**
 * @author: Yao Frankie
 * @date: 2020/8/17 13:28
 */
public class CommonInnerClass {

    public class InnerClass implements Runnable{
        @Override
        public void run() {
            System.out.println("Inner class.");
        }
    }
}
