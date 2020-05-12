package com.frankie.demo.io;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 17:00
 */
@Setter
@Getter
public class Person implements Serializable {

    private static final long serialVersionUID = 6529685298267757390L;

    private String name;
    private int age;
    private transient String accountNo;
//    private String accountNo;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String accountNo) {
        this.name = name;
        this.age = age;
        this.accountNo = accountNo;
    }


    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.writeObject(name);
        oos.writeInt(age);
        oos.writeObject(new StringBuilder(accountNo).append("666"));
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        this.name = (String) ois.readObject();
        this.age  = ois.readInt();
        this.accountNo = ((StringBuilder) ois.readObject()).toString();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accountNo='" + accountNo + '\'' +
                '}';
    }
}
