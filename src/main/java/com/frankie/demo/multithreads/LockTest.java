package com.frankie.demo.multithreads;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Yao Frankie
 * @date: 2020/5/1 19:49
 * https://pandaforme.github.io/2016/12/09/Java-lock%E3%80%81tryLock%E5%92%8ClockInterruptibly%E7%9A%84%E5%B7%AE%E5%88%A5/
 */
public class LockTest {

    private final ReentrantLock reentrantLock;

    public LockTest(){
        reentrantLock = new ReentrantLock();
    }

    public static void main(String[] args) throws InterruptedException {
        final LockTest lockTest = new LockTest();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                lockTest.reentrantLock.lock();
                System.out.println(String.format("%s %s locked.",
                        System.currentTimeMillis(), Thread.currentThread().getName()));
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
