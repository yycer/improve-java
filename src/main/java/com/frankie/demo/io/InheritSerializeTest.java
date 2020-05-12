package com.frankie.demo.io;

import java.io.*;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 17:21
 */
public class InheritSerializeTest {

    public final static String path = "src/main/resources/playio/inheritSerialize.txt";

    public static void main(String[] args) {
        inheritSerialize();
        inheritDeserialize();
    }

    private static void inheritDeserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            Child joe = (Child) ois.readObject();
            System.out.println(joe);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void inheritSerialize() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(new Child("Joe", "Male"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
