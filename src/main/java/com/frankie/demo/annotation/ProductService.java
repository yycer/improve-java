package com.frankie.demo.annotation;

import org.springframework.stereotype.Service;

/**
 * @author: Yao Frankie
 * @date: 2020/8/17 17:17
 */
@Service
public class ProductService {

    public void add(){
        System.out.println("Add one product.");
    }
}
