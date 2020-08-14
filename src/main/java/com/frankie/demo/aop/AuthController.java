package com.frankie.demo.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Yao Frankie
 * @date: 2020/8/13 15:23
 */
@Controller
public class AuthController {

    private Logger logger = LoggerFactory.getLogger(AuthController.class);

    @GetMapping("/login")
    @LogTimeCost(msg = "Just for test", threshold = 500)
    public String login(String user, String pass) throws InterruptedException {
        logger.info("user = " + user);
        logger.info("pass = " + pass);
        Thread.sleep(1000);
        return "success";
    }
}
