package com.frankie.demo.jdbc;

/**
 * @author: Yao Frankie
 * @date: 2020/10/3 10:53
 */
public interface Config {

    String url = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT&characterEncoding=utf8";
    String user = "root";
    String pass = "123456";
    String jdbcUrl = "jdbc:mysql://localhost:3306/test?user=root&password=123456&serverTimezone=GMT&characterEncoding=utf8";
}
