package com.frankie.demo.interceptor;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Yao Frankie
 * @date: 2020/8/17 08:11
 */
@RestController
public class MainController {

    @GetMapping(value = { "/", "/test" })
    public String test(Model model) {

        System.out.println("\n-------- MainController.test --- ");

        System.out.println(" ** You are in Controller ** ");

        return "test";
    }

    // This path is no longer used.
    // It will be redirected by OldLoginInterceptor
    @Deprecated
    @GetMapping(value = { "/admin/oldLogin" })
    public String oldLogin(Model model) {

        // Code here never run.
        return "oldLogin";
    }

    @GetMapping(value = { "/admin/login" })
    public String login(Model model) {

        System.out.println("\n-------- MainController.login --- ");

        System.out.println(" ** You are in Controller ** ");

        return "login";
    }
}
