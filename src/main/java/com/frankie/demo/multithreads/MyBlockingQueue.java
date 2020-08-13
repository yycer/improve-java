package com.frankie.demo.multithreads;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Yao Frankie
 * @date: 2020/8/12 19:18
 */
public class MyBlockingQueue {

    public MyBlockingQueue(int cap) {
        this.cap = cap;
    }

    private int cap;
    private ReentrantLock reentrantLock = new ReentrantLock(false);
    private Condition nonFull  = reentrantLock.newCondition();
    private Condition nonEmpty = reentrantLock.newCondition();
    private ArrayDeque<Object> q = new ArrayDeque<>();

    public void put(Object o){
        reentrantLock.lock();
        try {
            if (q.size() == cap){
                nonFull.await();
            }
            q.offer(o);
            System.out.println(LocalDateTime.now() + " put()成功!");
            nonEmpty.signalAll();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    public Object get(){
        reentrantLock.lock();
        try {
            if (q.isEmpty()){
                nonEmpty.await();
            }
            q.poll();
            System.out.println(LocalDateTime.now() + " get()成功!");
            nonFull.signalAll();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
        return null;
    }
}
