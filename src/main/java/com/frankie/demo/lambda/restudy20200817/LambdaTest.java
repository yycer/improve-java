package com.frankie.demo.lambda.restudy20200817;

/**
 * @author: Yao Frankie
 * @date: 2020/8/17 13:50
 */
public class LambdaTest {

    public static void run(Runnable runnable){
        System.out.println(runnable.getClass().getCanonicalName());
    }

    /**
     * 1. 非final局部变量
     * 2. final局部变量
     * 3. 外部类的成员变量
     */
    static int n3 = 30;
    public static void main(String[] args) {
        int n1 = 10;
        final int n2 = 20;
        Runnable t1 = () -> {
            int cur1 = n1 + 10;
            int cur2 = n2 + 10;
            int cur3 = n3 + 10;
            System.out.println(cur1);
            System.out.println(cur2);
            System.out.println(cur3);
            System.out.println("aa");
        };
    }
}
