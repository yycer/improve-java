package com.frankie.demo;

import com.frankie.demo.oop.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Yao Frankie
 * @date: 2020/2/29 09:42
 */
@SpringBootTest
public class OOPTest {

    @Test
    void localAndInstanceVariableTest(){
        LocalAndInstanceVar liv = new LocalAndInstanceVar();
        liv.printNum();
    }

    @Test
    void returnThisTest(){
        ReturnThis returnThis = new ReturnThis();
        returnThis.grow().grow().grow();
        System.out.println("returnThis.age = " + returnThis.age);
    }

    @Test
    void methodOverloadAndChangeableParamTest(){
        Utils.paramDynamic( "frankie","asan");
        Utils.paramDynamic("frankie");
    }

    @Test
    void instanceTest(){
        Object obj = "Hello";
        System.out.println("obj instanceof Object: " + (obj instanceof Object));
        System.out.println("obj instanceof String: " + (obj instanceof String));
        System.out.println("obj instanceof Math  : " + (obj instanceof Math));

//        obj instanceof Object: true
//        obj instanceof String: true
//        obj instanceof Math  : false

        Frankie frankie = new Frankie();
        System.out.println("frankie instanceof Person: " + (frankie instanceof Person));
//        frankie instanceof Person: true
    }

    @Test
    void extendsTest(){
        var child = new ChildClass();
    }

    @Test
    void initBlockTest(){
        InitBlock initBlock = new InitBlock();
        System.out.println("b = " + initBlock.getB());
    }


    /**
     * OOP
     */
    @Test
    void thisTest(){
//        Dog dog = new Dog();
//        dog.run();
//        dog.getName();

        Dog puppy = new Dog("puppy");
        System.out.println("The name of dog is " + puppy.getName());
    }

    @Test
    void primitiveTransferTest(){
        int a = 5, b = 8;
        Utils.swap(a, b);
        System.out.println(String.format("after swap(): a = %d, b = %d", a, b));
    }

    @Test
    void referenceTransferTest(){
        DataWrap dw = new DataWrap(5, 8);
        Utils.swapDataWrap(dw);
        System.out.println(String.format("after swap(): a = %d, b = %d", dw.getA(), dw.getB()));
    }

    @Test
    void recursionTest(){
//        int ret = Utils.func(10);
//        Assert.assertEquals(ret, 10497);
        int ret = Utils.fn(10);
        System.out.println(ret);
    }

    @Test
    void parameterDynamicTest(){
        Utils.paramDynamic(10, "frankie", "asan", "paangzi");
//        String[] names = {"frankie", "asan", "paangzi"};
//        Utils.paramDynamic(20, names);
    }

    @Test
    void superTest(){
        Child child = new Child();
        child.test();
    }

    @Test
    void inheritTreeCreationSeqTest(){
        new Wolf();
    }

    @Test
    void variableOverrideTest(){
        var name = "frankie";
        System.out.println("name is " + name);
        VariableOverride vo = new VariableOverride();
        System.out.println("name in VariableOverride is " + vo.getName());
    }

    @Test
    void polymorphismTest(){
        BaseClass base = new BaseClass();
        System.out.println("base book is " + base.book);
        base.base();
        base.test();
//
//        System.out.println("--------------------");
//        SubClass sub = new SubClass();
//        System.out.println("sub book is " + sub.book);
//        sub.sub();
//        sub.test();

        System.out.println("--------------------");
        BaseClass polymorphism = new SubClass();
        System.out.println("polymorphism book is " + polymorphism.book);
        // Only allow runtime methods can be called.
        polymorphism.base();
        polymorphism.test();
        // Cannot resolve method 'sub' in BaseClass.
        // polymorphism.sub();
    }

    @Test
    void typeConversionTest(){
        String name = "";
        Object obj = "yyc";
        if (obj instanceof String) {
            name = (String) obj;
        }

        System.out.println("name is " + name);
    }

    @Test
    void instanceInitTest(){
        InstanceInit ii = new InstanceInit();
        System.out.println("Age is " + ii.getAge());
    }

    @Test
    void instanceInitSeqTest(){
        new SubClass();
    }

    @Test
    void staticInitBlockTest(){
        new Leaf();
        System.out.println("----------------");
        new Leaf();
    }

    @Test
    void staticInitTest(){
        System.out.println("a = " + StaticInit.a);
    }
}
