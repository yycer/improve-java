package com.frankie.demo.algorithm;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author: Yao Frankie
 * @date: 2020/9/14 18:27
 */
public class HeapTest {

    public static void main(String[] args) {

        int threshold = 3;
        var maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        maxHeap.offer(2);
        maxHeap.offer(6);
        maxHeap.offer(4);
        maxHeap.offer(1);
        if (maxHeap.size() > threshold) maxHeap.poll();
        maxHeap.offer(3);
        if (maxHeap.size() > threshold) maxHeap.poll();
        while (!maxHeap.isEmpty()){
            System.out.print(maxHeap.poll() + " ");
        }
    }
}
