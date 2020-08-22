package com.frankie.demo.directmemory;

import java.nio.ByteBuffer;

/**
 * @author: Yao Frankie
 * @date: 2020/8/22 09:29
 */
public class DirectMemoryTest {

    public static void main(String[] args) {
        ByteBuffer dbb = ByteBuffer.allocateDirect(1024);
        String name = "yyc";
        dbb.put(name.getBytes());
    }
}
