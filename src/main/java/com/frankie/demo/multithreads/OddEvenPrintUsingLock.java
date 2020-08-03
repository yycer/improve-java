package com.frankie.demo.multithreads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Yao Frankie
 * @date: 2020/8/3 10:58
 */
public class OddEvenPrintUsingLock {

    private final ReentrantLock lock  = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private final int limit;
    private volatile int cnt;

    public OddEvenPrintUsingLock(int limit, int cnt) {
        this.limit = limit;
        this.cnt = cnt;
    }

    public void print(){
        lock.lock();
        try {
            while (cnt < limit){
                System.out.printf("线程[%s]打印数字:[%d]\n", Thread.currentThread().getName(), ++cnt);
                condition.signalAll();
                condition.await();
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
