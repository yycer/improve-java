package com.frankie.demo.multithreads;

/**
 * @author: Yao Frankie
 * @date: 2020/8/3 10:54
 */
public class OddEvenPrinterUsingWN {

    private final Object monitor = new Object();
    private final int limit;
    private volatile int cnt;

    public OddEvenPrinterUsingWN(int limit, int cnt) {
        this.limit = limit;
        this.cnt = cnt;
    }

    public void print(){
        synchronized (monitor){
            while (cnt < limit){
                try {
                    System.out.printf("线程[%s]打印数字:[%d]\n", Thread.currentThread().getName(), ++cnt);;
                    monitor.notifyAll();
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
