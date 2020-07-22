package com.frankie.demo.dynamicproxy;

/**
 * @author: Yao Frankie
 * @date: 2020/7/22 08:58
 */
public class StudentImpl implements IStudent{
    @Override
    public void add() {
        System.out.println("添加一个学生");
    }

    @Override
    public void delete() {
        System.out.println("删除一个学生");
    }
}
