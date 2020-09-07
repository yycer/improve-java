package com.frankie.demo.multithreadsdemo;

import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author: Yao Frankie
 * @date: 2020/8/6 16:33
 */
public class BuildReviews {

//    private static final int N = 1000000;
    private static final int N = 100000;
//    private static final int N = 10;
    private static String pathName = "src/main/resources/reviews/reviews";
    private static final Path path = Paths.get("src/main/resources/reviews/reviews1.csv");

    private static final int start = 11;
    private static final int end = 20;

    public static void main(String[] args) throws InterruptedException, IOException {

//        for (int i = 1; i <= 20; i++){
//            writeData(pathName + i + ".csv");
//        }

        long s = System.currentTimeMillis();
        /** ans = 199646, cost = 584ms */
        /** ans = 1256409, cost = 6303ms */
//        countUsingMain();
//        countUsingCyclicBarrier();
        countUsingLatch();
        long e = System.currentTimeMillis();
        System.out.printf("Cost: %dms\n", e - s);
    }

    private static void countUsingLatch() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);
        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(N);
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = start; i <= end; i++){
            service.submit(new ReviewLatchRunner(latch, abq, i));
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.HOURS);
        latch.await();
        int ans = 0;
        while (!abq.isEmpty()){
            ans += abq.poll();
        }
        System.out.println("ans = " + ans);
    }

    private static void countUsingCyclicBarrier() throws InterruptedException {

        long s = System.currentTimeMillis();
        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(N);
        CyclicBarrier cb = new CyclicBarrier(1, new TotalRunner(abq));
        ExecutorService service = Executors.newFixedThreadPool(4);
        for (int i = 1; i <= 3; i++){
            service.submit(new ReviewRunner(cb, abq, i));
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.HOURS);
        long e = System.currentTimeMillis();
        /**
         * parties = 2, threads = 2, ans = 199646, cost time = 396ms
         * parties = 5, threads = 5, ans = 199646, cost time = 357ms
         * parties = 10, threads = 10, ans = 199646, cost time = 322ms
         */
        System.out.printf("Service Cost: %dms\n", e - s);
    }

    private static void countUsingForkJoin() {

    }

    private static void getAllStar() throws IOException {
        String allPathName = "src/main/resources/reviews/all.csv";
        Path path = Paths.get(allPathName);
        List<String> records = Files.readAllLines(path);
        int star = 0;
        int cnt  = 0;
        for (String r: records){
            String[] split = r.split(",");
            star += Integer.parseInt(split[0]);
            cnt  += Integer.parseInt(split[1]);
        }
        // 59989744
        System.out.println("all = " + star);
    }

    private static void countUsingThreads() {
        ExecutorService service = Executors.newFixedThreadPool(20);
        int ans = 0;

        for (int i = 1; i <= 20; i++){
            final int j = i;
            service.submit(() -> {
                try {
                    int count = count(pathName + j + ".csv");
//                    ans += count;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        service.shutdown();
    }

    /**
     * 9712ms
     */
    private static void countUsingMain() throws IOException {
        int ans = 0;
        for (int i = 1; i <= 3; i++){
            int a = count(pathName + i + ".csv");
            System.out.println("i = " + i + ", cnt = " + a);
            ans += a;
        }
//        ans = 4002430
//        9288ms
        System.out.println("ans = " + ans);
    }

    private static int count(String pathName) throws IOException {
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


    private static void writeData(String pathName) throws IOException {
        Path path = Paths.get(pathName);
        // 如何合成6位随机数
        for (int i = 0; i < N; i++){
            int userId = generateRandom(6);
            int prodId = generateRandom(8);
            int star   = RandomUtils.nextInt(1, 6);
            StringBuilder sb = new StringBuilder();
            sb.append(userId).append(",")
              .append(prodId).append(",")
              .append(star).append("\n");
            String s = sb.toString();
            if (!Files.exists(path)){
                Files.createFile(path);
            }
            Files.write(path, s.getBytes(), StandardOpenOption.APPEND);
        }
    }


    public static int generateRandom(int n){
        int l = (int) Math.pow(10, n - 1);
        int r = (int) Math.pow(10, n);
        return RandomUtils.nextInt(l, r);
    }

    private static void writeAndReadTest() throws IOException {
        String s = "yyc,asan,123\n";
//        for (int i = 0; i < 3; i++){
//            Files.write(path, s.getBytes(), StandardOpenOption.APPEND);
//        }

        List<String> ans = Files.readAllLines(path);
    }
}
