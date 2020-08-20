package com.frankie.demo.basicknowledge;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author: Yao Frankie
 * @date: 2020/8/20 19:30
 */
public class StaticBindingTest {

    public static void main(String[] args) {
        Collection<String> set = new HashSet<>();
        StaticBindingTest test = new StaticBindingTest();
        test.sort(set);
    }

    /**
     * 重载方法使用静态绑定，而重写的方法则是用动态绑定。
     */
    public void sort(Collection<String> c){
        System.out.println("Sort collection.");
    }

    public void sort(HashSet<String> set){
        System.out.println("Sort set");
    }
}
