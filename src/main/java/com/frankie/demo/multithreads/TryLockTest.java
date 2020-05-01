package com.frankie.demo.multithreads;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Yao Frankie
 * @date: 2020/5/1 20:06
 */
public class TryLockTest {

    private final ReentrantLock reentrantLock;

    public TryLockTest(){
        reentrantLock = new ReentrantLock();
    }

    public static void main(String[] args) {
        final TryLockTest tryLockTest = new TryLockTest();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                boolean ret = tryLockTest.reentrantLock.tryLock();
                System.out.println(String.format("%s %s locked? %s",
                        System.currentTimeMillis(), Thread.currentThread().getName(), ret));
            }
        };
        Thread threadA = new Thread(runnable, "threadA");
        Thread threadB = new Thread(runnable, "threadB");

        threadA.start();
        threadB.start();
    }
}
