package com.frankie.demo.stream;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;

/**
 * @author: Yao Frankie
 * @date: 2020/8/18 08:59
 */
public class ParallelStreamTest {

    private static final int N = 500_0000;
    private static ArrayList<Person> person = new ArrayList<>();

    static {
        for (int i = 0; i < N; i++){
            int height = RandomUtils.nextInt(150, 210);
            person.add(Person.of("yyc" + i, 24, height));
        }
    }

    public static void main(String[] args) {
//        doFor();
        doStream();
        doParallelStream();
    }

    /**
     * doParallelStream(): 1451206
     * Cost time: 15ms
     */
    private static void doParallelStream() {
        ArrayList<Person> personCopy = new ArrayList<>(person);
        long l = System.currentTimeMillis();
        long ans = personCopy.parallelStream().filter(p -> p.getHeight() > 180).count();
        System.out.println("doParallelStream(): " + ans);
        long e = System.currentTimeMillis();
        System.out.println("Cost time: " + (e - l) + "ms");
        System.out.println("----------------------------");
    }

    /**
     * doStream(): 1449026
     * Cost time: 66ms
     */
    private static void doStream() {
        ArrayList<Person> personCopy = new ArrayList<>(person);
        long l = System.currentTimeMillis();
        long ans = personCopy.stream().filter(p -> p.getHeight() > 180).count();
        System.out.println("doStream(): " + ans);
        long e = System.currentTimeMillis();
        System.out.println("Cost time: " + (e - l) + "ms");
        System.out.println("----------------------------");
    }

    /**
     * doFor(): 1449026
     * Cost time: 32ms
     */
    public static void doFor(){
        ArrayList<Person> personCopy = new ArrayList<>(person);
        long l = System.currentTimeMillis();
        int ans = 0;
        for (Person p: personCopy){
            if (p.getHeight() > 180){
                ans++;
            }
        }
        System.out.println("doFor(): " + ans);
        long e = System.currentTimeMillis();
        System.out.println("Cost time: " + (e - l) + "ms");
        System.out.println("----------------------------");
    }
}
