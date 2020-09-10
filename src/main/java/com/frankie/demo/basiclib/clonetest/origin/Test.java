package com.frankie.demo.basiclib.clonetest.origin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 15:55
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Department dept = new Department(1, "Technical");
        Employee original = new Employee( 24, "yyc", dept);

        var cloned = (Employee) original.clone();

        System.out.println("Cloned   id           : " + cloned.getId());
        System.out.println("Cloned name           : " + cloned.getName());
        System.out.println("Cloned department   id: " + cloned.getDepartment().getId());
        System.out.println("Cloned department name: " + cloned.getDepartment().getName());
        System.out.println("-------------------------------------");

//        cloned.getDepartment().setName("Finance");
        cloned.setId(23);
        System.out.println("Original Employee id: " + original.getId());
        System.out.println("Cloned   Employee id: " + cloned.getId());
        System.out.println("-------------------------------------");

        cloned.setName("frankie");
        System.out.println("Original Employee name: " + original.getName());
        System.out.println("Cloned   Employee name: " + cloned.getName());
    }
}
