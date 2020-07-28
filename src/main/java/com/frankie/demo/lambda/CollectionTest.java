package com.frankie.demo.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: Yao Frankie
 * @date: 2020/7/27 10:14
 */
public class CollectionTest {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        Map<String, Integer> map = stream.collect(Collectors.toMap(x -> x, x -> x.length()));
//        Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length));
//        map.forEach((k, v) -> System.out.println("k = " + k + ", v = "+ v));

//        CopyOnWriteArrayList<String> collect = stream.collect(Collectors.toCollection(CopyOnWriteArrayList::new));
//        System.out.println(collect);

//        String a1 = stream.collect(Collectors.joining(":", "{", "}"));
//        System.out.println(a1);



    }

    private static void streamTest() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

//        for (int k: map.keySet()){
//            System.out.println("k = " + k + ", v = " + map.get(k));
//        }

//        map.forEach((k, v) -> System.out.println("k = " + k + ", v = " + v));
        map.replaceAll((k, v) -> v.toUpperCase());
        map.forEach((k, v) -> System.out.println("k = " + k + ", v = " + v));
    }

    private static void playList() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        /** 1. 打印长度大于3的字符串 */
        List<String> ans1 = list.stream()
                .filter(x -> x.length() > 3)
                .collect(Collectors.toList());
//        System.out.println(ans1);

        /** 2. 删除列表中长度大于3的字符串 */
//        list.removeIf(x -> x.length() > 3);

        /** 3. 将列表中所有长度大于3的字符串转换成大写字母 */
//        list.replaceAll(x -> {
////            if (x.length() > 3){
////                return x.toUpperCase();
////            }
//            return x;
//        });
//        System.out.println(list);

        /** 4. 将列表中的字符串正序排列 */
        list.sort(Comparator.comparing(x -> x));
        System.out.println(list);
    }
}
