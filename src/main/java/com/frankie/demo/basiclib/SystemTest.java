package com.frankie.demo.basiclib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 14:07
 */
public class SystemTest {

    public static void main(String[] args) throws IOException {

        /** 1. Fields: in, out, err */
//        var br = new BufferedReader(new InputStreamReader(System.in));
//        String inputLine = br.readLine();
//
//        var sb = new StringBuilder(inputLine);
//        sb.reverse();
//
//        System.out.println("Input    string: " + inputLine);
//        System.out.println("Reversed string: " + sb);
//        System.err.println("Reversed string: " + sb);
//
//        br.close();

        /** 2. Array Copy */
//        final int N = 10;
//        int[] src = new int[N];
//        for (int i = 0; i < N; i++){
//            src[i] = i;
//        }
//        System.out.println("src = " + Arrays.toString(src));
//
//        int[] des = new int[N >>> 1];
//        System.arraycopy(src, 3, des, 0, des.length);
//        System.out.println("des = " + Arrays.toString(des));


        /** 3. System Properties */
//        Properties properties = System.getProperties();
//        for (Object key: properties.keySet()){
//            System.out.println("key = " + key + ", val = "+ properties.getProperty((String) key));
//        }


        /** 4. Environmental variables */
//        Map<String, String> env = System.getenv();
//        for (var key: env.keySet()){
//            System.out.println("key = " + key + ", val = " + env.get(key));
//        }

        /** 5. Current Time */
//        System.out.println(System.currentTimeMillis());
        System.gc();


    }
}
