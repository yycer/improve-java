package com.frankie.demo.multithreadsdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author: Yao Frankie
 * @date: 2020/8/6 22:03
 */
public class ReviewRunner implements Runnable {

    private final static String pathName = "src/main/resources/reviews/reviews";
    private CyclicBarrier cb;
    private ArrayBlockingQueue<Integer> abq;
    private int id;

    public ReviewRunner(CyclicBarrier cb, ArrayBlockingQueue<Integer> abq, int id) {
        this.cb = cb;
        this.abq = abq;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            int cnt = count(pathName + id + ".csv");
            abq.put(cnt);
            cb.await();
        } catch (IOException | InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    private int count(String pathName) throws IOException {
        Path path = Paths.get(pathName);
        List<String> records = Files.readAllLines(path);
        int cnt  = 0;
        for (String r: records){
            String[] split = r.split(",");
            int star = Integer.parseInt(split[2]);
            if (star == 1) cnt++;
        }
        return cnt;
    }
}
