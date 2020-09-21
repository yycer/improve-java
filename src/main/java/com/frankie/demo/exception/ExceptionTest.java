package com.frankie.demo.exception;

/**
 * @author: Yao Frankie
 * @date: 2020/9/19 11:12
 */
public class ExceptionTest {

    public static void main(String[] args) {

        try {
            System.out.println("Start try block.");
            int a = 10 / 0;
            System.out.println("End try block.");
        } catch (ArithmeticException e) {
            System.out.println("Start catch block");
            e.printStackTrace();
        } finally {
            System.out.println("Start finally block");
        }
    }
}
