package com.frankie.demo.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.time.LocalDateTime;

/**
 * @author: Yao Frankie
 * @date: 2020/10/6 14:46
 */
public class HelloJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println(LocalDateTime.now() + " Hello Quartz!");
    }
}
