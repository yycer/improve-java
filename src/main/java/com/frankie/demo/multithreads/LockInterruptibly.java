package com.frankie.demo.multithreads;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Yao Frankie
 * @date: 2020/5/1 20:11
 */
public class LockInterruptibly {

    private final ReentrantLock reentrantLock;

    public LockInterruptibly(){
        reentrantLock = new ReentrantLock();
    }

    public static void main(String[] args) throws InterruptedException {

        final LockInterruptibly lockInterruptibly = new LockInterruptibly();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    lockInterruptibly.reentrantLock.lockInterruptibly();
                    System.out.println(String.format("%s %s locked.", System.currentTimeMillis(), Thread.currentThread().getName()));
                } catch (InterruptedException e) {
                    System.out.println(String.format("%s %s interrupted.", System.currentTimeMillis(), Thread.currentThread().getName()));
                }
            }
        };

        Thread threadA = new Thread(runnable, "threadA");
        Thread threadB = new Thread(runnable, "threadB");

        threadA.start();
        Thread.sleep(1000);
        threadB.start();
        threadB.interrupt();
    }
}
