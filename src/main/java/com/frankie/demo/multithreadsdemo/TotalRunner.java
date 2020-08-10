package com.frankie.demo.multithreadsdemo;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author: Yao Frankie
 * @date: 2020/8/6 22:00
 */
public class TotalRunner implements Runnable{

    public TotalRunner(ArrayBlockingQueue<Integer> abq) {
        this.abq = abq;
    }

    private ArrayBlockingQueue<Integer> abq;

    @Override
    public void run() {
        int ans = 0;
        for (Iterator<Integer> it = abq.iterator(); it.hasNext();){
            Integer cur = it.next();
            ans += cur;
        }
        System.out.println("ans = " + ans);
    }
}