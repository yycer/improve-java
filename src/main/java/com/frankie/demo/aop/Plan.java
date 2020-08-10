package com.frankie.demo.aop;

import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author: Yao Frankie
 * @date: 2020/8/7 11:22
 */
public class Plan {

    private Logger logger = LoggerFactory.getLogger(Plan.class);

//    public void add(){
//        long s = System.currentTimeMillis();
//        logger.info("Execute add().");
//        try {
//            Thread.sleep(RandomUtils.nextInt(0, 2000));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            long e = System.currentTimeMillis();
//            System.out.printf("Cost %dms\n", e - s);
//        }
//    }

    public void add(){
        try {
            Thread.sleep(RandomUtils.nextInt(0, 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void update(){
        try {
            Thread.sleep(RandomUtils.nextInt(0, 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
