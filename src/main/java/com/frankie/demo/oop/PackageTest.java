package com.frankie.demo.oop;

import java.util.*;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 09:04
 */
public class PackageTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter username: ");

        String username = in.nextLine();
        System.out.println("Username is " + username);

        int[] a = {2, 3, 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        HashSet<Integer> set = new HashSet<>();
    }
}
