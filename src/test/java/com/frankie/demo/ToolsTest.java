package com.frankie.demo;

import com.frankie.demo.oopplus.User;
import com.frankie.demo.utils.BigDecimalUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.Properties;

/**
 * @author: Yao Frankie
 * @date: 2020/3/6 20:53
 */
@SpringBootApplication
public class ToolsTest {

    @Test
    void systemInfoTest(){
        Map<String, String> envs = System.getenv();
        System.out.println(envs);
        System.out.println("-----------------------");
        Properties properties = System.getProperties();
        System.out.println(properties);
    }

    @Test
    void runtimeInfoTest(){
        Runtime rt = Runtime.getRuntime();

        System.out.println("rt.availableProcessors() = " + rt.availableProcessors());
        System.out.println("rt.freeMemory() = " + rt.freeMemory());
        System.out.println("rt.totalMemory() = " + rt.totalMemory());
        System.out.println("rt.maxMemory() = " + rt.maxMemory());
    }

    @Test
    void cloneTest() throws CloneNotSupportedException {
        User u1 = new User(25);
        User u2 = u1.clone();
        System.out.println("u1 == u2 -> " + (u1 == u2));
        System.out.println("u1.getAddress() == u2.getAddress() -> " + (u1.getAddress() == u2.getAddress()));
    }

    @Test
    void stringBuilderTest(){
        StringBuilder sb = new StringBuilder("Yao");
        sb.append("Frankie");
        String yyc = new String("yyc");
        System.out.println(yyc);
        System.out.println(sb);
    }

    @Test
    void bigDecimalTest(){
        double d1 = 0.15f;
        double d2 = 0.12f;
        double ret1 = d1 + d2;
        System.out.println("ret1 = " + ret1); // ret1 = 0.27539999783039093

        double ret2 = BigDecimalUtils.add(d1, d2);
        System.out.println("ret2 = " + ret2); // ret2 = 0.27

        double ret = BigDecimalUtils.operate(d1, d2, (d11, d22) ->
                        BigDecimal.valueOf(d11)
                        .add(BigDecimal.valueOf(d22))
                        .setScale(2, RoundingMode.HALF_UP).doubleValue());

        System.out.println("ret = " + ret);
    }
}
