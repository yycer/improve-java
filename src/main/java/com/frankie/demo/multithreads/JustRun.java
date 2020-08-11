package com.frankie.demo.multithreads;

/**
 * @author: Yao Frankie
 * @date: 2020/8/11 15:17
 */
public class JustRun implements Runnable {
    @Override
    public void run() {
        int i = 10 / 0;
        System.out.println("aaa");
    }
}
