package com.frankie.demo.basiclib.clonetest.implclone;

/**
 * @author: Yao Frankie
 * @date: 2020/9/10 15:55
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Department   dept = new Department(1, "Technical");
        Employee original = new Employee( 24, "yyc", dept);

        var cloned = (Employee) original.clone();
        System.out.println("Cloned   id           : " + cloned.getId());
        System.out.println("Cloned name           : " + cloned.getName());
        System.out.println("Cloned department   id: " + cloned.getDepartment().getId());
        System.out.println("Cloned department name: " + cloned.getDepartment().getName());
        System.out.println("-------------------------------------");

//        System.out.println("original == cloned: " + (original == cloned));
//        System.out.println("original.getClass() == cloned.getClass(): " + (original.getClass() == cloned.getClass()));
//        System.out.println("original.equals(cloned): " + original.equals(cloned));

        cloned.getDepartment().setName("Finance");
        System.out.println("Original department name: " + original.getDepartment().getName());
        System.out.println("Cloned   department name: " + cloned.getDepartment().getName());

    }
}
