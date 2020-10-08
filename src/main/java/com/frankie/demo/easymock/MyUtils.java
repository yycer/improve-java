package com.frankie.demo.easymock;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 10:48
 */
public class MyUtils {

    private IntegerUtils iu;
    private StringUtils  su;

    public MyUtils(IntegerUtils iu, StringUtils su) {
        this.iu = iu;
        this.su = su;
    }

    public int add(int x, int y){
        return iu.add(x, y);
    }

    public String reverse(String input){
        return su.reverse(input);
    }

    public String convert(int i){
        return su.convert(i);
    }
}
