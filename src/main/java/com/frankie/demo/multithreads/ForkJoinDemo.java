package com.frankie.demo.multithreads;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;

/**
 * @author: Yao Frankie
 * @date: 2020/8/3 10:06
 */
public class ForkJoinDemo {

    public final static String CONTENT = "哇，好帅哟！哇，是啊，我好喜欢呢！哇，可否给个签名呢？";
    public final static int THRESHOLD  = 5;
    public static Set<String> BLACK_WORDS = new LinkedHashSet<>();

    static {
        BLACK_WORDS.add("哇");
    }

    public static void main(String[] args) {

        ForkJoinPool pool = new ForkJoinPool();
        MyRecursiveTask myRecursiveTask = new MyRecursiveTask(
                0, CONTENT.length() - 1, Arrays.asList(CONTENT.split("")));
        Integer ans = pool.invoke(myRecursiveTask);
        System.out.printf("包含%d个违禁字\n", ans);
    }
}
