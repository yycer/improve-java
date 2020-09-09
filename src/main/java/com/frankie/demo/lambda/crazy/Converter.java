package com.frankie.demo.lambda.crazy;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 17:21
 */
@FunctionalInterface
public interface Converter {

    /** 将字符串整数转换成整数 */
    Integer convert(String s);
}
