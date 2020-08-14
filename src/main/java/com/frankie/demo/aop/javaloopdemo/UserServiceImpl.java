package com.frankie.demo.aop.javaloopdemo;

import org.springframework.stereotype.Component;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 19:12
 */
@Component
public class UserServiceImpl implements UserService{
    @Override
    public User createUser(String firstName, String lastName, int age) {

        System.out.println("创建user = " + firstName);
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @Override
    public User queryUser() {
        User user = new User();
        user.setFirstName("test");
        user.setLastName("test");
        user.setAge(20);
        return user;
    }
}
