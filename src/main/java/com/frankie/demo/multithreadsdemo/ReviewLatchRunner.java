package com.frankie.demo.multithreadsdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 11:45
 */
public class ReviewLatchRunner implements Runnable {

    private final static String pathName = "src/main/resources/reviews/reviews";

    public ReviewLatchRunner(CountDownLatch latch, ArrayBlockingQueue<Integer> abq, int id) {
        this.latch = latch;
        this.abq = abq;
        this.id = id;
    }

    private CountDownLatch latch;
    private ArrayBlockingQueue<Integer> abq;
    private int id;

    @Override
    public void run() {
        try {
            int cnt = count(pathName + id + ".csv");
            System.out.println("id = " + id + ", cnt = " + cnt);
            abq.put(cnt);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
        }
    }

    private int count(String pathName) throws IOException {
        Path path = Paths.get(pathName);
        List<String> records = Files.readAllLines(path);
        int cnt = 0;
        for (String r: records){
            String[] split = r.split(",");
            int star = Integer.parseInt(split[2]);
            if (star == 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
