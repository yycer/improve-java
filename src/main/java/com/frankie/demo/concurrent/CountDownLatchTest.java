package com.frankie.demo.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @author: Yao Frankie
 * @date: 2020/4/29 17:16
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        countDownLatchTest();
    }

    private static void countDownLatchTest() throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(3);
        for(int i = 0; i < 3; i++){
            new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("子线程执行");
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println("主线程执行");
    }
}
