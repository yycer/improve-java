package com.frankie.demo.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author: Yao Frankie
 * @date: 2020/8/25 19:11
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @GetMapping("/user/add")
    public String addUser(){
        User user = new User();
        user.setAge(30);
        user.setId(2019L);
        user.setCreateTime(LocalDateTime.now());
        user.setPhone("123");
        user.setName("Jack");
        userMapper.insert(user);
        return "Success";
    }

    @GetMapping("/user/update")
    public String updateUser(){
        userService.transfer2();
        return "Update success.";
    }
}
