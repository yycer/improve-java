package com.frankie.demo.lambda.crazy;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 17:28
 */
@FunctionalInterface
public interface SubStringFI {

    String substring(String s, int l, int r);
}
