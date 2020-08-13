package com.frankie.demo.multithreads;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 08:53
 */
public class InterruptedTest {

    public static void main(String[] args) throws InterruptedException {

        Runnable t1 = () -> {
            System.out.println("Start");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End");
        };

        Thread thread = new Thread(t1);
        thread.start();
        Thread.sleep(10);
        thread.interrupt();
        thread.join();
        System.out.println("Done");
    }
}
