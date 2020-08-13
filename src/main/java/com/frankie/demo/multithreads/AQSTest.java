package com.frankie.demo.multithreads;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Yao Frankie
 * @date: 2020/8/12 10:42
 */
public class AQSTest {

    private static ReentrantLock reentrantLock = new ReentrantLock(true);

    public static void main(String[] args) throws InterruptedException {

        Runnable t1 = () -> {
            reentrantLock.lock();
            try {
                System.out.println("Thread A get lock.");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }
        };

        Runnable t2 = () -> {
            reentrantLock.lock();
            try {
                System.out.println("Thread B get lock.");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }
        };

        Thread threadA = new Thread(t1, "Thread-A");
        Thread threadB = new Thread(t2, "Thread-B");
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();
    }
}
