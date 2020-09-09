package com.frankie.demo.lambda.crazy;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 17:38
 */
@FunctionalInterface
public interface Displayable {

    void display();

    default int add(int a, int b){
        return a + b;
    }
}
