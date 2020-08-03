package com.frankie.demo.multithreads;

/**
 * @author: Yao Frankie
 * @date: 2020/8/3 10:43
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        /** 1. Using Object.wait()、 */
//        OddEvenPrinterUsingWN print = new OddEvenPrinterUsingWN(10, 0);
//        new Thread(print::print, "thread-1").start();
//        new Thread(print::print, "thread-2").start();

        /** 2. Using ReentrantLock and condition */

        OddEvenPrintUsingLock printLock = new OddEvenPrintUsingLock(10, 0);
        new Thread(printLock::print, "thread-1").start();
        new Thread(printLock::print, "thread-2").start();
    }
}
