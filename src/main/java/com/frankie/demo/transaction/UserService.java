package com.frankie.demo.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Yao Frankie
 * @date: 2020/8/25 19:28
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public void transfer(){
        User user1 = userMapper.get(2018);
        user1.setAge(user1.getAge() - 5);
        userMapper.update(user1);
        int i = 1 / 0;
        User user2 = userMapper.get(2019);
        user2.setAge(user2.getAge() + 5);
        userMapper.update(user2);
    }

    public void transfer2(){
        User user1 = userMapper.get(2018);
        user1.setAge(user1.getAge() - 10);
        userMapper.update(user1);
        int i = 1 / 0;
        User user2 = userMapper.get(2019);
        user2.setAge(user2.getAge() + 10);
        userMapper.update(user2);
    }
}
