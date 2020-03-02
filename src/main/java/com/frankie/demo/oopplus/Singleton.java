package com.frankie.demo.oopplus;

/**
 * @author: Yao Frankie
 * @date: 2020/3/2 21:06
 */
public class Singleton {

    // Caching the created singleton.
    private static Singleton singleton;

    // Seal constructor.
    private Singleton(){

    }

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
