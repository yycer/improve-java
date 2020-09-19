package com.frankie.demo.exception;

import javax.sql.rowset.spi.SyncResolver;
import java.util.concurrent.ExecutionException;

/**
 * @author: Yao Frankie
 * @date: 2020/9/19 14:31
 */
public class FlowControlTest {

    public static void main(String[] args) {

//        String ans1 = tryAndCatchContainsReturn();
//        System.out.println("ans1 = " + ans1);

        String ans2 = allContainsReturn("a");
        System.out.println("ans2 = " + ans2);
        System.out.println("-----------------------");
        String ans3 = allContainsReturn("b");
        System.out.println("ans3 = " + ans3);
    }

    private static String tryAndCatchContainsReturn() {
        try {
            System.out.println("Started executing try block.");
            return "Returning form try block"; // bingo
        } catch (Exception e){
            return "Returning form catch block";
        } finally {
            System.out.println("Print something from finally block.");
        }
    }

    private static String allContainsReturn(String name){
        try {
            if (name.endsWith("a")){
                System.out.println(name + " from try block.");
            } else{
                int a = 10 / 0;
            }
            return "Returning form try block";
        } catch (Exception e){
            System.out.println(name + " from catch block.");
            return "Returning form catch block";
        } finally {
            /**As a good practice, it is better to avoid writing return statements in finally block. */
            return "Returning form finally block"; // bingo
        }
    }
}
