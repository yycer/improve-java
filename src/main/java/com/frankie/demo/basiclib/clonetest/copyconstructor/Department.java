package com.frankie.demo.basiclib.clonetest.copyconstructor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 16:01
 */
@Data
@AllArgsConstructor
public class Department {

    private int id;
    private String name;

    public Department(Department d){
        this(d.getId(), d.getName());
    }
}
