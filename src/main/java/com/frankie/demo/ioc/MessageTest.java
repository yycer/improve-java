package com.frankie.demo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Yao Frankie
 * @date: 2020/8/18 14:24
 */
public class MessageTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:message.xml");
        MessageService messageService = ac.getBean(MessageService.class);
        System.out.println(messageService.getMessage());
    }
}
