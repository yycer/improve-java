package com.frankie.demo.transaction;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author: Yao Frankie
 * @date: 2020/8/25 19:08
 */
@Data
public class User {
    private Long id;
    private String name;
    private int age;
    private LocalDateTime createTime;
    private String phone;
}
