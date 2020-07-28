package com.frankie.demo.stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author: Yao Frankie
 * @date: 2020/7/28 10:34
 */
public class SpliteratorTest {

    public static void main(String[] args) {

        String[] s = {"1.0", "2.0", "3.0", "4.0", "5.0"};
        Double ans = Stream.of(s)
                .map(Double::valueOf)
                .filter(d -> d > 2)
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .reduce(Double::sum)
                .orElse(0d);
        System.out.println(ans);
    }

    private static int regExpMethod(String s) {
        String[] ss = s.replaceAll("[^1-9]", " ").split(" ");
        int ans = 0;
        for (String c: ss){
            if ("".equals(c)){
                continue;
            }
            ans += Integer.parseInt(c);
        }
        return ans;
    }
}
