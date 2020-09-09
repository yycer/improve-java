package com.frankie.demo;

import com.frankie.demo.generic.WildCard;
import com.frankie.demo.playcollection.A;
import com.frankie.demo.playcollection.B;
import com.frankie.demo.playcollection.C;
import com.frankie.demo.playcollection.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

/**
 * @author: Yao Frankie
 * @date: 2020/3/7 15:45
 */
@SpringBootTest(classes = CollectionTest.class)
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

        /** Select -> element() and peek() **/
        System.out.println("Just peek: " + pq.peek());

        /** Delete -> remove() and poll() **/
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.println("Do   poll: " + pq.poll());
        }
    }

    @Test
    void arrayDequeTest(){
        /** As stack **/
        System.out.println("/** As stack **/");
        ArrayDeque<Integer> adStack = new ArrayDeque<>();
        adStack.push(5); // addFirst()
        adStack.push(2);
        adStack.push(3);
        adStack.push(3);
//        adStack.push(null);
        System.out.println(adStack);

        while (!adStack.isEmpty()){
            System.out.println("Polled element in adStack is " + adStack.poll()); // pollFirst()
        }

        System.out.println("/** As queue **/");
        /** As queue **/

        ArrayDeque<Integer> adQueue = new ArrayDeque<>();
        adQueue.offer(5); // offerLast()
        adQueue.offer(2);
        adQueue.offer(3);
        System.out.println(adQueue);
        while (!adQueue.isEmpty()){
            System.out.println("Polled element in adQueue is " + adQueue.poll()); // pollFirst();
        }
    }

    @Test
    void linkedListTest(){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.add(null);
        System.out.println(ll);
    }

    @Test
    void hashMapTest(){
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "yyc");
        map.put("age", "25");

//        Set<String> keySet = map.keySet();
//        Collection<String> values = map.values();
//        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(String.format("key = %s, val = %s", entry.getKey(), entry.getValue()));
        }
    }

    @Test
    void arrayListGenericTest(){
        ArrayList<String>  strings  = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("strings.getClass()  is " + strings.getClass());
        System.out.println("integers.getClass() is " + integers.getClass());
    }

    @Test
    void wildCardTest(){
//        ArrayList<Object> objects = new ArrayList<>();
//        ArrayList<String> strings = new ArrayList<>();
//
//        WildCard.processListObject(objects);
//        WildCard.processListObject(strings);

        Number[]  nums = {1, 2, 3};
        Integer[] ints = {1, 2, 3};
        WildCard.processArray(nums);
        WildCard.processArray(ints);
    }
}













