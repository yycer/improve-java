package com.frankie.demo.basicknowledge;

/**
 * @author: Yao Frankie
 * @date: 2020/9/14 10:17
 */
public class BooleanLogicalOperatorTest {

    public static void main(String[] args) {

        var b1 = true;
        var b2 = true;
        var b3 = false;
        var b4 = false;
        System.out.println("----------------------------");
        System.out.println("true  & true  = " + (b1 & b2));
        System.out.println("true  & false = " + (b1 & b3));
        System.out.println("false & true  = " + (b3 & b1));
        System.out.println("false & false = " + (b3 & b4));
        System.out.println("----------------------------");

        System.out.println("true  | true  = " + (b1 | b2));
        System.out.println("true  | false = " + (b1 | b3));
        System.out.println("false | true  = " + (b3 | b1));
        System.out.println("false | false = " + (b3 | b4));
        System.out.println("----------------------------");

        System.out.println("true  ^ true  = " + (b1 ^ b2));
        System.out.println("true  ^ false = " + (b1 ^ b3));
        System.out.println("false ^ true  = " + (b3 ^ b1));
        System.out.println("false ^ false = " + (b3 ^ b4));
        System.out.println("----------------------------");
    }
}
