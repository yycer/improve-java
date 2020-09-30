package com.frankie.demo.basicknowledge;

/**
 * @author: Yao Frankie
 * @date: 2020/9/30 14:25
 */
public class FloatingTest {

    public static void main(String[] args) {

//        test1();
        officialTest();
    }

    private static void officialTest() {
        double d1 = 1e308 * 5;
        System.out.println(d1);

        double d2 = 1e-305 * Math.PI;
        for (int i = 0; i < 4; i++) {
            System.out.println(d2 /= 100_000);
        }
    }

    private static void test1() {
        float f1 = 0.1f;
        float f2 = 0.2f;
        float ans1 = f1 + f2;
        System.out.println(ans1);

        double d1 = 0.11;
        double d2 = 0.22;
        double ans2 = d1 + d2;
        System.out.println(ans2);

        double ans3 = 1 / 3 + 2 / 3;
        System.out.println(ans3);

        System.out.println(Byte.MAX_VALUE);
    }
}
