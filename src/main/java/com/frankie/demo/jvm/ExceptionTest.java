package com.frankie.demo.jvm;

/**
 * @author: Yao Frankie
 * @date: 2020/3/9 08:51
 */
public class ExceptionTest {

    public static int testException(){
        int x;
        try {
            x = 1;
            int i = 10 / 0;
            return x;
        } catch (Exception e){
            x = 2;
            return x;
        } finally {
            x = 3;
            return x;
        }
    }
}
