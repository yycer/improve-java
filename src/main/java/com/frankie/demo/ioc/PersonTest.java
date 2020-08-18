package com.frankie.demo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Yao Frankie
 * @date: 2020/8/18 22:28
 */
public class PersonTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/ioc/person.xml");
        ac.close();
    }
}
