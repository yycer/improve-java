package com.frankie.demo.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author: Yao Frankie
 * @date: 2020/9/19 14:51
 */
public class CommonExceptionsTest {

    public static void main(String[] args) {


        /** 1. ArithmeticException */
        arithmeticTest();

        /** 2. ArrayIndexOutOfBoundsException */
        indexTest();

        /** 3. NullPointerException */
        nullTest();

        /** 4. FileNotFoundException & IOException */
        ioTest();

        /** 5. InterruptedException */
        interruptTest();

        /** 6. DateTimeParseException */
        parseTest();

        /** 7. NumberFormatException */
        numberFormatTest();
    }



    private static void arithmeticTest() {
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        int a = 10 / 0;
    }

    private static void numberFormatTest() {
        String s = "10a";
        // java.lang.NumberFormatException: For input string: "10a"
        int n = Integer.parseInt(s);
    }

    private static void indexTest() {
        int[] nums = {1, 2, 3};
        // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        int t = nums[3];
    }

    private static void nullTest() {
        String s = null;
        // java.lang.NullPointerException
        s.equals("a");
    }

    static class ChildThread extends Thread{

        @Override
        public void run(){
            try {
                // java.lang.InterruptedException: sleep interrupted
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void interruptTest() {
        ChildThread ct = new ChildThread();
        ct.start();
        // java.lang.InterruptedException: sleep interrupted
        ct.interrupt();
    }

    private static void parseTest() {
        String date = "1234";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // java.time.format.DateTimeParseException: Text '1234' could not be parsed at index 4
        LocalDate ld = LocalDate.parse(date, formatter);
    }

    private static void ioTest() {

        try {
            // java.io.FileNotFoundException: path (系统找不到指定的文件。)
            new FileReader(new File("path"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
