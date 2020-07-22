package com.frankie.demo.dynamicproxy;

/**
 * @author: Yao Frankie
 * @date: 2020/7/22 09:02
 */
public class TeacherImpl implements ITeacher {
    @Override
    public void add() {
        System.out.println("添加一个老师");
    }

    @Override
    public void delete() {
        System.out.println("删除一个老师");
    }
}
