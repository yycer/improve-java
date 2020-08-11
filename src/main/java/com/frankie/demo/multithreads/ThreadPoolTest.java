package com.frankie.demo.multithreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Yao Frankie
 * @date: 2020/8/11 14:58
 */
public class ThreadPoolTest {

    public static void main(String[] args) {

//        ExecutorService threadPool = Executors.newCachedThreadPool();
//        threadPool.submit(new JustRun());
//        threadPool.execute(new JustRun());
//        threadPool.submit(() -> System.out.println("123"));
//        threadPool.shutdown();

        int i = 1 << 0;
        System.out.println(i);
    }
}
