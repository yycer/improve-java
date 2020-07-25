package com.frankie.demo.java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author: Yao Frankie
 * @date: 2020/7/24 16:35
 */
public class Play {

    static List<Shop> shops = buildShops(12);

    static List<Apple> inventory = Arrays.asList(
            new Apple(80,  "green"),
            new Apple(155, "green"),
            new Apple(120, "red"));


    public static void main(String[] args) {
        long s = System.currentTimeMillis();
//        getAllPrices();
        getAllPricesUsingCF();
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }

    public static void getAllPricesUsingCF(){
        List<CompletableFuture<String>> futures = shops.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> s.getPrice("Mac")))
                .collect(Collectors.toList());

        List<String> ans = futures.stream().map(CompletableFuture::join)
                .collect(Collectors.toList());
    }

    public static List<String> getAllPrices(){
        return shops.parallelStream()
                .map(s -> String.format("%s", s.getPrice("Mac")))
                .collect(Collectors.toList());
    }

    public static List<Shop> buildShops(int n){
        return IntStream.range(0, n)
                .mapToObj(i ->  new Shop(String.valueOf(i)))
                .collect(Collectors.toList());
    }

    private static void localDateTimeTest() {
        LocalDateTime s = LocalDateTime.now();
//        Thread.sleep(1024);
        LocalDateTime e = LocalDateTime.now();

        long m = Duration.between(s, e).toMillis();
//        System.out.println(m);

        LocalDate date = LocalDate.of(2020, 10, 1);
        date.withYear(1996);
//        System.out.println(date);

        String s1 = "20200213091122";
        LocalDateTime ldt = LocalDateTime.parse(s1, DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        String s2 = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd:HH:mm:ss"));
        System.out.println(s2);
    }

    private static void streamPractice() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan  = new Trader("Alan" , "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan,  2012, 950)
        );

        // 8. 找到交易额最小的交易。
        Transaction c8 = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .orElse(null);
        System.out.println(c8);

        // 7. 所有交易中，最高的交易额是多少？
        int c7 = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .orElse(0);
//        System.out.println(c7);

        // 6. 打印生活在剑桥的交易员的所有交易额。
//        transactions.stream()
//                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
//                .mapToInt(Transaction::getValue)
//                .forEach(System.out::println);

        // 5. 有没有交易员是在米兰工作的？
        boolean c5 = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));
//        System.out.println(c5);


        // 4. 返回所有交易员的姓名字符串，按字母顺序排序。
        List<String> c4 = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .map(Trader::getName)
                .sorted(Comparator.comparing(x -> x))
                .collect(Collectors.toList());
//        System.out.println(c4);

        // 3. 查找所有来自于剑桥的交易员，并按姓名排序。
        List<Trader> c3 = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
//        System.out.println(c3);


        // 2. 交易员都在哪些不同的城市工作过？
        List<String> c2 = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
//        System.out.println(c2);


        // 1. 找出2011年发生的所有交易，并按交易额正序排序。
        List<Transaction> c1 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
//        System.out.println(c1);

    }

    private static void sort() {
        Product a = new Product("A", 50);
        Product b = new Product("B", 10);
        Product c = new Product("C", 15);

        ArrayList<Product> products = new ArrayList<>();
        products.add(a);
        products.add(b);
        products.add(c);
        List<Product> pros = products.stream()
                .sorted(Comparator.comparingInt(Product::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println(pros);
    }

    private static void stream() {
        List<Apple> green = inventory.stream()
                .filter(a -> a.getColor().equals("green"))
                .collect(Collectors.toList());

        long cnt = inventory.stream().filter(a -> a.getColor().equals("green")).count();

        int maxWeight = inventory.stream().mapToInt(Apple::getWeight).max().orElse(0);

        Apple apple = inventory.stream().max(Comparator.comparingInt(Apple::getWeight)).orElse(null);

        double ave = inventory.stream().mapToInt(Apple::getWeight).average().orElse(0);
        int sum = inventory.stream().mapToInt(Apple::getWeight).sum();
        System.out.println(sum);
    }
}
