package com.frankie.demo;

import com.frankie.demo.playcollection.A;
import com.frankie.demo.playcollection.B;
import com.frankie.demo.playcollection.C;
import com.frankie.demo.playcollection.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

/**
 * @author: Yao Frankie
 * @date: 2020/3/7 15:45
 */
@SpringBootApplication
public class CollectionTest {

    /**
     * 1. 无序
     * 2. 可存null
     * 3. 非线程安全
     */

    @Test
    void hashSetAddTest(){
        HashSet<Object> set = new HashSet<>();
        set.add(new A());
        set.add(new A());
        set.add(new B());
        set.add(new B());
        set.add(new C());
        set.add(new C());
        System.out.println(set);
    }

    @Test
    void compareToTest(){
        Integer a = Integer.valueOf(3);
        Integer b = Integer.valueOf(5);
        Integer c = Integer.valueOf(5);

        System.out.println("5.compareTo(3) = " + b.compareTo(a));
        System.out.println("3.compareTo(5) = " + a.compareTo(b));
        System.out.println("5.compareTo(5) = " + b.compareTo(c));
    }

    /** -----------------------------------------------------**/

    /**
     * HashSet
     * 1. 不可重复
     * 2. 无序
     * 3. 可以添加null
     * 4. 非线程安全
     */
    @Test
    void hashSetTest(){
        HashSet<Student> students = new HashSet<>();
        students.add(new Student(20, "yyc"));
        students.add(new Student(22, "Jack"));
        students.add(new Student(24, "Marion"));
        students.add(new Student(20, "yyc"));
        students.add(null);

        System.out.println(students);
    }


    /**
     * LinkedHashSet
     * 1. 是否允许重复元素: 不允许
     * 2. 是否有序：       保持元素插入的顺序。
     * 3. 是否允许null:    允许
     * 4. 是否线程安全:    非线程安全
     */
    @Test
    void linkedHashSetTest(){
        LinkedHashSet<String> lhSet = new LinkedHashSet<>();
        lhSet.add("yyc");
        lhSet.add("yyc");
        lhSet.add("frankie");
        lhSet.add("Jack");
        lhSet.add("Marion");
        lhSet.add(null);
        System.out.println("Origin  Sequence: " + lhSet);
        lhSet.remove("yyc");
        lhSet.add("yyc");
        System.out.println("Changed Sequence: " + lhSet);
    }

    /**
     * TreeSet
     * 1. 是否允许重复元素: 不允许
     * 2. 是否有序:        根据元素值正序排序
     * 3. 是否允许null:    不允许
     * 4. 是否线程安全:    非线程安全
     */
    @Test
    void treeSetTest(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(2);
//        treeSet.add(null);
        System.out.println(treeSet); // [1, 2, 3, 5]
        System.out.println("treeSet.headSet(3)    -> " + treeSet.headSet(3));
        System.out.println("treeSet.tailSet(3)    -> " + treeSet.tailSet(3));
        System.out.println("treeSet.subSet(-2, 3) -> " + treeSet.subSet(-2, 3));
    }

    @Test
    void priorityQueueTest(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        /** Insert -> add() and offer() **/
        pq.offer(5);
        pq.offer(2);
        pq.offer(3);
        pq.offer(1);
        pq.offer(1);
//        pq.offer(null);

        /** Select -> element() and **/
        System.out.println("Just peek: " + pq.peek());

        /** Delete -> remove() and poll() **/
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.println("Do   poll: " + pq.poll());
        }
    }
}













