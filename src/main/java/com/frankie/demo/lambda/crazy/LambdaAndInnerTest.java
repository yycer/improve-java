package com.frankie.demo.lambda.crazy;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 17:39
 */
public class LambdaAndInnerTest {

    // 成员变量
    private int age = 24;
    // 类成员变量
    private static String name = "yyc";

    public void test(){
        // 局部变量
        var book = "Java";
        Displayable dis = () -> {
            System.out.println("book = " + book);
            System.out.println("age  = " + age);
            System.out.println("name = " + name);
        };
        dis.display();
        System.out.println(dis.add(1, 2));
    }

    public static void main(String[] args) {
        LambdaAndInnerTest test = new LambdaAndInnerTest();
        test.test();
    }
}
