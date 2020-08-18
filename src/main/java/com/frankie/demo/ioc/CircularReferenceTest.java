package com.frankie.demo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Yao Frankie
 * @date: 2020/8/18 19:13
 */
public class CircularReferenceTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/ioc/circularreference.xml");
//        ac.setAllowCircularReferences(false);
//        ac.refresh();
        ClassA classA = (ClassA) ac.getBean("classA");
        classA.print();
        ClassB classB = (ClassB) ac.getBean("classB");
        classB.run();
    }
}
