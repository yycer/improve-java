package com.frankie.demo.basiclib.clonetest.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 15:55
 */
public class Test {
    public static void main(String[] args) throws JsonProcessingException {

        Department   dept = new Department(1, "Technical");
        Employee original = new Employee( 24, "yyc", dept);

        ObjectMapper om = new ObjectMapper();
        Employee cloned = om.readValue(om.writeValueAsString(original), Employee.class);

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
