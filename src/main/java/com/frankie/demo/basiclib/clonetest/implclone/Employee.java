package com.frankie.demo.basiclib.clonetest.implclone;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 16:00
 */
@Data
@AllArgsConstructor
public class Employee implements Cloneable{

    private int id;
    private String name;
    private Department department;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee e = (Employee) super.clone();
        e.setDepartment((Department) this.department.clone());
        return e;
    }
}
