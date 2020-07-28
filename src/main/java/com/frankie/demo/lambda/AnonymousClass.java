package com.frankie.demo.stream;

/**
 * @author: Yao Frankie
 * @date: 2020/7/27 10:00
 */
public class AnonymousClass {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run.");
            }
        }).start();
    }
}
