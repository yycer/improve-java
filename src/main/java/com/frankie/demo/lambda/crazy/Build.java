package com.frankie.demo.lambda.crazy;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 17:33
 */
@FunctionalInterface
public interface Build {

    User buildUser(String name, int age);
}
