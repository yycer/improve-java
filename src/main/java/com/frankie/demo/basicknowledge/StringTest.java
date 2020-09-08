package com.frankie.demo.basicknowledge;

/**
 * @author: Yao Frankie
 * @date: 2020/9/8 14:44
 */
public class StringTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefg");
        // [)
        sb.delete(2, 5);
        System.out.println(sb);
    }
}
