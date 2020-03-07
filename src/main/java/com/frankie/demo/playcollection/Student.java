package com.frankie.demo.playcollection;

import lombok.Getter;

/**
 * @author: Yao Frankie
 * @date: 2020/3/7 18:50
 */
@Getter
public class Student {

    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Student stu = (Student) obj;
        boolean ret = this.getId() == stu.getId() &&
                this.getName().equals(stu.getName());

        System.out.println("The result of equals() is " + ret + ", by " + name);
        return ret;
    }

//    @Override
//    public boolean equals(Object obj){
//        boolean ret = super.equals(obj);
//        System.out.println("The result of equals() from Object is " + ret);
//        return ret;
//    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int ret = 1;
        ret = prime * ret + id;
        ret = prime * ret + (("".equals(name) ? 0 : name.hashCode()));
        System.out.println("The result of hasCode is " + ret + ", by " + name);
        return ret;
    }

    @Override
    public String toString(){
        return String.format("Student[id=%d, name=%s]", id, name);
    }
}
