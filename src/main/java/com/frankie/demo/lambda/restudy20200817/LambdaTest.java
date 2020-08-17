package com.frankie.demo.lambda.restudy20200817;

/**
 * @author: Yao Frankie
 * @date: 2020/8/17 13:50
 */
public class LambdaTest {

    public static void run(Runnable runnable){
        System.out.println(runnable.getClass().getCanonicalName());
    }

    public static void main(String[] args) {
        run(() -> {});
    }
}
