package com.frankie.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Yao Frankie
 * @date: 2020/2/28 20:42
 */
@SpringBootTest(classes = ArrayTest.class)
public class ArrayTest {

    @Test
    void defineAndInitializeTest(){
        int[] num1 = new int[]{1, 2, 3};
        int[] num2 = {1, 2, 3};

        Object[] strArr = new String[4];
//        strArr[0] = new Object();
        strArr[0] = "yyc";
        System.out.println(strArr[0]);
    }

    @Test
    void rememberExceptionTest(){
//        var names = new String[]{"yyc", "asan", "pangzi"};
        String[] names = {"yyc", "asan", "pangzi"};
//        String name = names[3];
    }
}
