package com.frankie.demo.mockito.l1;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Yao Frankie
 * @date: 2020/11/28 16:02
 */
public class AccountLoginController {

    @Autowired
    private AccountDao accountDao;

    public String login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            Account account = accountDao.findAccount(username, password);
            if (account == null){
                return "/login";
            } else {
                return "/index";
            }
        } catch (Exception e){
            return "/505";
        }
    }
}
