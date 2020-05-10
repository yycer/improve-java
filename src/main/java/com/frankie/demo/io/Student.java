package com.frankie.demo.io;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 17:14
 */
@Setter
@Getter
public class Student implements Serializable {

    private static final long serialVersionUID = 6529685298267757391L;

    private String studentName;
    private int id;

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", id=" + id +
                '}';
    }
}
