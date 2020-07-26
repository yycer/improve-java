package com.frankie.demo.collection;

import java.util.LinkedHashSet;

/**
 * @author: Yao Frankie
 * @date: 2020/7/25 18:36
 */
public class LinkedHashSetTest {

    public static void main(String[] args) {

        Commodity commodityA = new Commodity("Iphone6S", 6666.66);
        Commodity commodityB = new Commodity("Iphone7",  7777.77);
        Commodity commodityC = new Commodity("Iphone8",  8888.88);
        Commodity commodityD = new Commodity("IphoneX",  9999.99);
        Commodity commodityE = new Commodity("Iphone6S", 6666.66);
        Commodity commodityF = new Commodity("Iphone8",  6666.66);
        Commodity commodityG = new Commodity("IphoneX",  9999.99);

        LinkedHashSet<Commodity> commodities = new LinkedHashSet<>();
        commodities.add(commodityA);
        commodities.add(commodityB);
        commodities.add(commodityC);
        commodities.add(commodityD);
        commodities.add(commodityE);
        commodities.add(commodityF);
        commodities.add(commodityG);

        for (Commodity commodity : commodities){
            System.out.println(commodity);
        }
    }
}
