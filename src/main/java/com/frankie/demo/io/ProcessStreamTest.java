package com.frankie.demo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 13:08
 */
public class ProcessStreamTest {


    public static void main(String[] args) {
        bufferReaderTest();
    }

    private static void bufferReaderTest() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String line;
            while ((line = br.readLine()) != null){
                if ("exit".equals(line)){
                    System.exit(2);
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
