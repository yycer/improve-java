package com.frankie.demo.basiclib.clonetest.commonlang3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 16:00
 */
@Data
@AllArgsConstructor
public class Employee implements Serializable {

    private int id;
    private String name;
    private Department department;
}
