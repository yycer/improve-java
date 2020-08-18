package com.frankie.demo.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/8/18 09:01
 */
@AllArgsConstructor(staticName = "of")
@Setter
@Getter
public class Person {

    private String name;
    private int age;
    private int height;
}
