package com.frankie.demo.aop;

/**
 * @author: Yao Frankie
 * @date: 2020/8/5 09:30
 */
public class EmployeeService {

    public Employee createEmployee(int id, String name){
        Employee employee = Employee.of(id, name);
        return employee;
    }

    public void deleteEmployee(int id){

    }
}
