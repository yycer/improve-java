package com.frankie.demo.oop;

import lombok.Getter;

/**
 * @author: Yao Frankie
 * @date: 2020/3/1 16:48
 */
@Getter
public class VariableOverride {

    private String name = "yyc";
    private static double height = 172.5;


    private String classInstanceVariable = "classInstanceVariable";
    public  String classStaticVariable   = "classStaticVariable";

    public void getName(String formalParameter){
        String localVariable = "localVariable";
    }

    {
        String blockLocalVariable = "blockLocalVariable";
    }
}
