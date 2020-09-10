package com.frankie.demo.basiclib.clonetest.jackson;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 16:00
 */
@Data
@AllArgsConstructor
public class Employee {

    private int id;
    private String name;
    private Department department;

    public Employee(){ }
}
