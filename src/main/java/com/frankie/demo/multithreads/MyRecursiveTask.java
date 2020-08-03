package com.frankie.demo.multithreads;

import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * @author: Yao Frankie
 * @date: 2020/8/3 10:08
 */
public class MyRecursiveTask extends RecursiveTask<Integer> {

    private int l;
    private int r;
    private List<String> words;

    public MyRecursiveTask(int l, int r, List<String> words) {
        this.l = l;
        this.r = r;
        this.words = words;
    }

    @Override
    protected Integer compute() {
        int ans = 0;
        if (r - l < ForkJoinDemo.THRESHOLD){
            for (int i = l; i < r; i++){
                if (ForkJoinDemo.BLACK_WORDS.contains(words.get(i))){
                    ans++;
                }
            }
        } else {
            int mid = l + r >>> 1;
            MyRecursiveTask left  = new MyRecursiveTask(l, mid, words);
            MyRecursiveTask right = new MyRecursiveTask(mid, r, words);
            left.fork();
            right.fork();
            ans += left.join();
            ans += right.join();
        }
        return ans;
    }
}
