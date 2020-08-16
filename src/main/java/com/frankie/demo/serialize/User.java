package com.frankie.demo.serialize;

import lombok.*;

import java.io.Serializable;

/**
 * @author: Yao Frankie
 * @date: 2020/8/16 13:03
 */
@Setter
@Getter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@ToString
public class User implements Serializable {
    private static final long serialVersionUID = -5408563710031661342L;
    private String name;
    private int age;
}
