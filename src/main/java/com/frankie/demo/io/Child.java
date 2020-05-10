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
public class Child extends Parent implements Serializable{

    private static final long serialVersionUID = 6529685298267757394L;

    public Child(String childName, String gender) {
        super("father");
        this.childName = childName;
        this.gender = gender;
    }

    private String childName;
    private String gender;

    @Override
    public String toString() {
        return "Child{" +
                "childName='" + childName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
