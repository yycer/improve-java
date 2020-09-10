package com.frankie.demo.basiclib.clonetest.implclone;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 16:01
 */
@Data
@AllArgsConstructor
public class Department implements Cloneable {

    private int id;
    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
