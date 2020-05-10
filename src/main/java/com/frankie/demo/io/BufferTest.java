package com.frankie.demo.io;

import java.nio.CharBuffer;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 20:31
 */
public class BufferTest {

    public static void main(String[] args) {
        playBuffer();
    }

    private static void playBuffer() {
        CharBuffer buf = CharBuffer.allocate(4);
        System.out.println("-------- Round 1 --------");
        System.out.println("position = " + buf.position());
        System.out.println("limit    = " + buf.limit());
        System.out.println("capacity = " + buf.capacity());

        buf.put('a');
        buf.put('b');
        buf.put('c');
        System.out.println("-------- Round 2 --------");
        System.out.println("position = " + buf.position());
        System.out.println("limit    = " + buf.limit());
        System.out.println("capacity = " + buf.capacity());

        buf.flip();
        System.out.println("-------- Round 3 --------");
        System.out.println("position = " + buf.position());
        System.out.println("limit    = " + buf.limit());
        System.out.println("capacity = " + buf.capacity());

        System.out.println("-------- Round 4 --------");
        System.out.println(buf.get());
        System.out.println("position = " + buf.position());
        System.out.println("limit    = " + buf.limit());
        System.out.println("capacity = " + buf.capacity());

        buf.clear();
        System.out.println("-------- Round 5 --------");
        System.out.println("position = " + buf.position());
        System.out.println("limit    = " + buf.limit());
        System.out.println("capacity = " + buf.capacity());

        System.out.println("-------- Round 5 --------");
        System.out.println(buf.get(2));
        System.out.println("position = " + buf.position());
        System.out.println("limit    = " + buf.limit());
        System.out.println("capacity = " + buf.capacity());
    }
}
