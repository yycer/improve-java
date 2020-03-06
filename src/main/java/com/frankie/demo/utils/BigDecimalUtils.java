package com.frankie.demo.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author: Yao Frankie
 * @date: 2020/3/6 22:27
 */
public class BigDecimalUtils {

    public static double add(double d1, double d2){
        BigDecimal bd1 = BigDecimal.valueOf(d1);
        BigDecimal bd2 = BigDecimal.valueOf(d2);
        return bd1.add(bd2).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double operate(double d1, double d2, BdAction bda){
        return bda.doAction(d1, d2);
    }
}
