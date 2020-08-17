package com.frankie.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Yao Frankie
 * @date: 2020/8/17 17:16
 */
@RestController
public class TestController {

    @Autowired
    ProductService productService;

    @GetMapping("/test/add")
    public String add(){
        productService.add();
        return "Success";
    }
}
