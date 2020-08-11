package com.frankie.demo.jvm;

/**
 * @author: Yao Frankie
 * @date: 2020/8/11 08:56
 */
public class AppleTest {

    public static void main(String[] args) {

        int cnt = 0;
        retry:
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 2; j++){
                cnt++;
                if (cnt == 3) continue retry;
                System.out.println(cnt);
            }
        }
    }
}
