package com.frankie.demo.jvm;

import java.util.concurrent.CountDownLatch;

/**
 * @author: Yao Frankie
 * @date: 2020/8/11 08:14
 */
public class SortTest {

    private static int x = 0, y = 0;
    private static int a = 0, b = 0;


    public static void main(String[] args) throws InterruptedException {

        int i = 0;
        for (;;){
            i++;
            x = 0; y = 0;
            a = 0; b = 0;
            CountDownLatch latch = new CountDownLatch(1);

            Runnable task1 = () -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a = 1;
                x = b;
            };

            Runnable task2 = () -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                b = 1;
                x = a;
            };

            Thread t1 = new Thread(task1);
            Thread t2 = new Thread(task2);
            t1.start();t2.start();
            latch.countDown();
            t1.join();t2.join();

            String result = "第" + i + "次 (" + x + "," + y + "）";
            if(x == 0 && y == 0) {
                System.err.println(result);
                break;
            } else {
                System.out.println(result);
            }
        }
    }
}
