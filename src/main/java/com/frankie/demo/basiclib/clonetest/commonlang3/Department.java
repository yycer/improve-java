package com.frankie.demo.basiclib.clonetest.commonlang3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 16:01
 */
@Data
@AllArgsConstructor
public class Department implements Serializable {

    private int id;
    private String name;
}
