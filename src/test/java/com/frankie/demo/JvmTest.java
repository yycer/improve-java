package com.frankie.demo;

import com.frankie.demo.jvm.ExceptionTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Yao Frankie
 * @date: 2020/3/9 08:52
 */
@SpringBootApplication
public class JvmTest {

    @Test
    void testException(){
        int ret = ExceptionTest.testException();
        System.out.println(ret);
    }
}
