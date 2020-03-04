package com.frankie.demo.oopplus;

/**
 * @author: Yao Frankie
 * @date: 2020/3/3 20:18
 */
public class Printer implements Output, Produce {

    private String[] printData = new String[MAX_CACHE_LINE];
    private int dataNum;

    @Override
    public void out() {
        while (dataNum > 0){
            System.out.println("Print " + printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getDate(String msg) {
        if (dataNum >= MAX_CACHE_LINE)
            System.out.println("The queue is full.");
        else
            printData[dataNum++] = msg;
    }

    @Override
    public void getProduceTime() {
        System.out.println(10);
    }
}
