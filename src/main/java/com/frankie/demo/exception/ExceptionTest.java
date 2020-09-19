package com.frankie.demo.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author: Yao Frankie
 * @date: 2020/9/19 11:12
 */
public class ExceptionTest {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
