package com.frankie.demo.oop.studyenum;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 19:50
 */
public class SeasonTest {

    public void judge(Season s){
        switch (s){
            case SPRING:
                System.out.println("春暖花开");
                break;
            case SUMMER:
                System.out.println("夏日炎炎");
                break;
            case AUTUMN:
                System.out.println("秋高气爽");
                break;
            case WINTER:
                System.out.println("冬雪飘飘");
                break;
            default:
                System.out.println("请输入争取的季节");
        }
    }

    public static void main(String[] args) {

        for (Season s: Season.values()){
            System.out.println(s);
        }

        new SeasonTest().judge(Season.SPRING);
    }
}
