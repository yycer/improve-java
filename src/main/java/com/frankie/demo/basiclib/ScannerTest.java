package com.frankie.demo.basiclib;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 11:06
 */
public class ScannerTest {

    public static void main(String[] args) {

        /** 1. Read input */
//        try (Scanner sc = new Scanner(System.in)){
//            System.out.println("Please enter your name: ");
//            String name = sc.nextLine();
//            System.out.println("name : " + name);
//
//            System.out.println("Please enter your age: ");
//            int age = sc.nextInt();
//            System.out.println("age: " + age);
//        }

        /** 2. Split input */
//        String input = "1,2,3,4,5";
//        try(var sc = new Scanner(input).useDelimiter(",")){
//            while (sc.hasNext()){
//                System.out.printf(sc.next() + " ");
//            }
//        }

        /** 3. Read file */
//        try (var sc = new Scanner(new File("D:/Playground/improve-java/src/main/resources/scannertest.txt"))){
//            while (sc.hasNext()){
//                System.out.println(sc.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


//        /** 4. Input types */
//        try(var sc = new Scanner(System.in)){
//            System.out.println("Please enter your name, age and salary: ");
//            String name   = sc.nextLine();
//            int    age    = sc.nextInt();
//            double salary = sc.nextDouble();
//            System.out.println("Name  : " + name);
//            System.out.println("Age   : " + age);
//            System.out.println("Salary: " + salary);
//        }


        /** 5. Scanner.next() vs nextLint() */

        try(var sc = new Scanner(System.in)){
            System.out.println("Please enter you name: ");
            sc.useDelimiter("\n");
//            String name = sc.next();
            String name = sc.nextLine();
            System.out.println("Name: " + name);
        }
    }
}
