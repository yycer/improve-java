package com.frankie.demo.aop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: Yao Frankie
 * @date: 2020/8/5 08:57
 */
@Setter
@Getter
@AllArgsConstructor(staticName = "of")
@ToString
public class Employee {

    private int id;
    private String name;
}
