package com.frankie.demo.quartz;

import org.quartz.*;

/**
 * @author: Yao Frankie
 * @date: 2020/10/6 16:51
 */
public class DumbJob implements Job {

    public DumbJob(){

    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobKey key = context.getJobDetail().getKey();
        JobDataMap dataMap = context.getJobDetail().getJobDataMap();
        String says = dataMap.getString("jobSays");
        float value = dataMap.getFloat("myFloatValue");
        System.out.println("Instance " + key + " of DumbJob says: " + says + ", and value is " + value);
    }
}
