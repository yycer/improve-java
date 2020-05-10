package com.frankie.demo.io;

import java.io.*;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 17:01
 */
public class SerializeTest {

    public final static String path = "src/main/resources/playio/person.txt";
    public final static String transientPath = "src/main/resources/playio/transient.txt";
    public final static String customSerializePath1 = "src/main/resources/playio/customSerialize1.txt";
    public final static String externalizablePath = "src/main/resources/playio/externalizable.txt";

    public static void main(String[] args) {
//        serializeTest();
//        deserializeTest();
//        transientSerializeTest();
//        transientDeserializeTest();
//        customSerializeTest();
//        customDeserializeTest();
        externalizableSerializeTest();
        externalizableDeserializeTest();
    }

    private static void externalizableDeserializeTest() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(externalizablePath))){
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void externalizableSerializeTest() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(externalizablePath))){
            oos.writeObject(new PersonExternalizable("frankie", 28, "135"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void customDeserializeTest() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(customSerializePath1))){
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void customSerializeTest() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(customSerializePath1))){
            Person frankie = new Person("frankie", 30, "456");
            oos.writeObject(frankie);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void transientDeserializeTest() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(transientPath))){
            // Person{name='frankie', age=25}
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void transientSerializeTest() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(transientPath))){
            Person frankie = new Person("frankie", 25, "123");
            oos.writeObject(frankie);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializeTest() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            Person yyc   = (Person) ois.readObject();
            Student asan = (Student) ois.readObject();
            System.out.println(yyc);
            System.out.println(asan);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serializeTest() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(new Person("yyc", 25));
            oos.writeObject(new Student("asan", 10));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
