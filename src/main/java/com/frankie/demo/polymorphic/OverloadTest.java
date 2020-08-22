package com.frankie.demo.polymorphic;

/**
 * @author: Yao Frankie
 * @date: 2020/8/21 08:11
 */
public class OverloadTest {

    class Father {}

    class Son extends Father {}

    public void doSomething(Father f){
        System.out.println("Father do something");
    }

    private void doSomething(Son s){
        System.out.println("Sun do something");
    }

    public static void main(String[] args) {
        OverloadTest overloadTest = new OverloadTest();
        Father father = overloadTest.new Father();
        Father son = overloadTest.new Son();
        // 重载[overload]是静态绑定、重写是动态绑定！！！
        overloadTest.doSomething(father);
        // (OverrideTest.Father)
        overloadTest.doSomething(son);
    }
}
