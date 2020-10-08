package com.frankie.demo.easymock;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 09:52
 */
public class MathUtils {

    private Calculator c;

    public MathUtils(Calculator c){
        this.c = c;
    }

    public int add(int x, int y){
        return this.c.add(x, y);
    }

    public int multiply(int x, int y){
        return this.c.multiply(x, y);
    }
}
