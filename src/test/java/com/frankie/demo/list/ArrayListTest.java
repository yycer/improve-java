package com.frankie.demo.list;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author: Yao Frankie
 * @date: 2020/4/25 14:35
 */
@SpringBootTest
public class ArrayListTest {

    /**
     * 了解内部存储结构
     * elementData
     * size()
     */
    @Test
    public void arrayListTest(){
        ArrayList<String> al = new ArrayList<>(11);
        al.add("yyc");
        al.add("frankie");
    }

    /**
     * 扩容源码跟踪
     */
    @Test
    public void resizeTest(){
        ArrayList<String> al = new ArrayList<>(2);
        al.add("yyc");
        al.add("frankie");
        al.add("Jack");
    }

    /**
     * 删除元素源码跟踪
     */
    @Test
    public void deleteElementTest(){
        ArrayList<String> al = new ArrayList<>(5);
        al.add("yyc");
        al.add("frankie");
        al.add("Jack");
        al.add("Marion");
        al.add("Alina");
        al.remove("frankie");
    }

    /**
     * 序列化源码跟踪
     */
    @Test
    public void serializeTest() throws IOException {
        ArrayList<String> al = new ArrayList<>(10);
        al.add("yyc");
        al.add("frankie");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SerializeTest"));
        oos.writeObject(al);
    }
}
