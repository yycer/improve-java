package com.frankie.demo.io;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 17:18
 */
@Setter
@Getter
public class Parent implements Serializable {

    private static final long serialVersionUID = 6529685298267757395L;

    public Parent(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentName='" + parentName + '\'' +
                ", age=" + age +
                '}';
    }

    private String parentName;
    private int age;
}
