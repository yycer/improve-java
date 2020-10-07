package com.frankie.demo.quartz;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.CronScheduleBuilder.*;
/**
 * @author: Yao Frankie
 * @date: 2020/10/7 13:27
 */
public class CronTriggerTest {

    public static void main(String[] args) throws SchedulerException {

        StdSchedulerFactory ssf = new StdSchedulerFactory();
        Scheduler scheduler = ssf.getScheduler();
        scheduler.start();


        JobDetail jd = newJob(HelloJob.class)
                .withIdentity("j1", "g3")
                .build();


        CronTrigger ct = newTrigger()
                .withIdentity("t1", "g3")
                // seconds, minutes, hours, day-of-month, month, day-of-week, (year)
                .withSchedule(cronSchedule("0/10 48 13 * * ?"))
                .forJob("j1", "g3")
                .build();

        scheduler.scheduleJob(jd, ct);
    }
}
