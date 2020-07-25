package com.frankie.demo.java8;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author: Yao Frankie
 * @date: 2020/7/24 19:43
 */
public class Shop {

    public Shop(String name) {
        this.name = name;
    }

    private String name;

    public Future<String> getPriceAsync(String productName){
        return CompletableFuture.supplyAsync(() -> getPrice(productName));
    }

    public Future<String> getPriceUsingFuture(String productName){

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        Future<String> future = cachedThreadPool
                .submit(() -> getPrice(productName));
        return future;
    }


    public String getPrice(String productName){
        delay();
        return getRandomPrice(productName);
    }

    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String getRandomPrice(String productName) {
        BigDecimal priceBd = BigDecimal
                .valueOf(new Random().nextDouble() * productName.charAt(0))
                .setScale(2, BigDecimal.ROUND_UP);
        return String.valueOf(priceBd);
    }
}
