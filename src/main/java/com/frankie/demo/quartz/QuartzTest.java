package com.frankie.demo.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.SimpleScheduleBuilder.*;

/**
 * @author: Yao Frankie
 * @date: 2020/9/30 09:41
 */
public class QuartzTest {

    public static void main(String[] args) throws SchedulerException {

        StdSchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();
        scheduler.start();

//        JobDetail job = newJob(HelloJob.class)
//                .withIdentity("myJob", "group1")
//                .build();

        JobDetail job = newJob(DumbJob.class)
                .withIdentity("dumbJob", "group1")
                .usingJobData("jobSays", "Hello World!")
                .usingJobData("myFloatValue", 3.14f)
                .build();

        SimpleTrigger trigger = newTrigger()
                .withIdentity("myTrigger", "group1")
                .startNow()
                .withSchedule(simpleSchedule()
                        .withIntervalInSeconds(10)
                        .repeatForever())
                .build();

        scheduler.scheduleJob(job, trigger);

    }
}
