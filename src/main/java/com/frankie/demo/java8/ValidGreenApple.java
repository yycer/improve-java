package com.frankie.demo.java8;

/**
 * @author: Yao Frankie
 * @date: 2020/7/24 16:39
 */
public class ValidGreenApple implements ApplePredicate {

    @Override
    public boolean valid(Apple a) {
        return a.getColor().equals("green");
    }
}
