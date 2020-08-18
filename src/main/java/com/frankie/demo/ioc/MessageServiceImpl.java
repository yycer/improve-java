package com.frankie.demo.ioc;

/**
 * @author: Yao Frankie
 * @date: 2020/8/18 14:22
 */
public class MessageServiceImpl implements MessageService {

    @Override
    public String getMessage() {
        return "hello world";
    }
}
