package com.frankie.demo.aop.javaloopdemo;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 19:11
 */
public interface UserService {

    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
