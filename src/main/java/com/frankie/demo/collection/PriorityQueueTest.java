package com.frankie.demo.collection;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author: Yao Frankie
 * @date: 2020/8/10 13:44
 */
public class PriorityQueueTest {

    public static void main(String[] args) {


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(5);
        maxHeap.offer(7);
        maxHeap.offer(2);
        if (maxHeap.size() > 2) System.out.println(maxHeap.poll());
        maxHeap.offer(9);
        if (maxHeap.size() > 2) System.out.println(maxHeap.poll());
        System.out.println(maxHeap);
    }
}
