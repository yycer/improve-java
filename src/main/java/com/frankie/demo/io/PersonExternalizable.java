package com.frankie.demo.io;

import lombok.Getter;
import lombok.Setter;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 19:36
 */
@Setter
@Getter
public class PersonExternalizable implements Externalizable {

    private static final long serialVersionUID = -5206410052080077540L;

    public PersonExternalizable(){

    }

    public PersonExternalizable(String name, int age, String accountNo) {
        this.name = name;
        this.age = age;
        this.accountNo = accountNo;
    }

    private String name;
    private int age;
    private String accountNo;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
        out.writeObject(new StringBuilder(accountNo).append("888").toString());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = in.readObject().toString();
        this.age  = in.readInt();
        this.accountNo = in.readObject().toString();
    }

    @Override
    public String toString() {
        return "PersonExternalizable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accountNo='" + accountNo + '\'' +
                '}';
    }
}
