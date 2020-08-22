package com.frankie.demo.inherit;

/**
 * @author: Yao Frankie
 * @date: 2020/8/21 07:34
 */
public class Student extends Person{

    /**
     * 继承是为了复用父类的属性或行为。
     */
    public Student(String name, int age){
        super(name, age);
    }

    public void print(){
        System.out.println("l am a student.");
    }
}
