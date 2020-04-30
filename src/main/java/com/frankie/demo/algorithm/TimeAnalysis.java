package com.frankie.demo.algorithm;

/**
 * @author: Yao Frankie
 * @date: 2020/4/29 20:31
 */
public class TimeAnalysis {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        int m = 1;
        int n = 2;
        for (int i = 0; i < 3; i++){
            System.out.println(i);
            for (int j = 0; j < 3; j++){
                System.out.println(String.format("i = %d, j = %d", i, j));
            }
        }
    }

    public void method(int n){
        int i = 0;   // line 2
        int j = 0;   // line 3
        for (; i < n; i++){            // line 3
            System.out.println(i);     // line 4
            for (; j < n; i++){        // line 5
                System.out.println(j); // line 6
            }
        }
    }
}
