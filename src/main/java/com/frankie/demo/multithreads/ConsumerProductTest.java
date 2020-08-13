package com.frankie.demo.multithreads;

import org.apache.commons.lang3.RandomUtils;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Yao Frankie
 * @date: 2020/8/12 19:32
 */
public class ConsumerProductTest {

    public static void main(String[] args) {

        MyBlockingQueue mbq = new MyBlockingQueue(1 << 1);

        Callable<Integer> t1 = () -> {
            Thread.sleep(RandomUtils.nextInt(0, 10));
            mbq.put(new Object());
            return -1;
        };

        Callable<Integer> t2 = () -> {
            Thread.sleep(RandomUtils.nextInt(1000, 10000));
            mbq.get();
            return -1;
        };

        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++){
            if ((i & 1) == 1){
                service.submit(t1);
            } else {
                service.submit(t2);
            }
        }
        service.shutdown();
    }
}
