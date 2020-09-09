package com.frankie.demo;

import com.frankie.demo.jvm.ExceptionTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Yao Frankie
 * @date: 2020/3/9 08:52
 */
@SpringBootTest(classes = JvmTest.class)
public class JvmTest {

    @Test
    void testException(){
        int ret = ExceptionTest.testException();
        System.out.println(ret);
    }
}
