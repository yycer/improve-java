package com.frankie.demo.basiclib.clonetest.commonlang3;

import org.apache.commons.lang3.SerializationUtils;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 15:55
 */
public class Test {
    public static void main(String[] args) {

        Department   dept = new Department(1, "Technical");
        Employee original = new Employee( 24, "yyc", dept);
        Employee cloned = SerializationUtils.clone(original);

        System.out.println("Cloned   id           : " + cloned.getId());
        System.out.println("Cloned name           : " + cloned.getName());
        System.out.println("Cloned department   id: " + cloned.getDepartment().getId());
        System.out.println("Cloned department name: " + cloned.getDepartment().getName());
        System.out.println("-------------------------------------");

        cloned.getDepartment().setName("Finance");
        System.out.println("Original department name: " + original.getDepartment().getName());
        System.out.println("Cloned   department name: " + cloned.getDepartment().getName());

    }
}
