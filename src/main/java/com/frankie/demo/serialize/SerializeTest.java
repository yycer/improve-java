package com.frankie.demo.serialize;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

/**
 * @author: Yao Frankie
 * @date: 2020/8/16 13:03
 */
public class SerializeTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User chris = User.of("Chris", 24);
        ObjectMapper mapper = new ObjectMapper();
        String a = mapper.writeValueAsString(chris);

        User user = mapper.readValue(a, User.class);
        System.out.println(user);
    }
}
