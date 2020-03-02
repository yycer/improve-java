package com.frankie.demo.oopplus;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/3/2 21:17
 */
@Setter
@Getter
public class FinalVariable {

    private final int instanceVar;
    private final static int staticVar;

//    public FinalVariable(int instanceVar){
//        this.instanceVar = instanceVar;
//    }

    {
        instanceVar = 10;
    }

    static {
        staticVar = 10;
    }

    public static int getStaticVar(){
        return staticVar;
    }
}
