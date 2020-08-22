package com.frankie.demo.polymorphic;

/**
 * @author: Yao Frankie
 * @date: 2020/8/21 08:17
 */
public class OverrideTest {

    class Father{
        public void doSomething(){
            System.out.println("Father do something");
        }
    }

    class Sun extends Father {
        @Override
        public void doSomething(){
            System.out.println("Sun do something");
        }
    }

    public static void main(String [] args){
        OverrideTest overrideTest = new OverrideTest();
        Father sun = overrideTest.new Sun();
        Father father = overrideTest.new Father();
        sun.doSomething();
        father.doSomething();
    }
}
