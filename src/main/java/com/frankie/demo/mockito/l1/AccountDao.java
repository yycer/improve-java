package com.frankie.demo.mockito.l1;

import org.springframework.stereotype.Component;

/**
 * @author: Yao Frankie
 * @date: 2020/11/28 16:04
 */
@Component
public class AccountDao {

    public Account findAccount(String username, String password){
        throw  new UnsupportedOperationException();
    }
}
