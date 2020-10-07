package com.frankie.demo.quartz;

import com.mysql.cj.util.TimeUtil;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.SimpleScheduleBuilder.*;

/**
 * @author: Yao Frankie
 * @date: 2020/10/6 20:52
 */
public class SimpleTriggerTest {

    public static void main(String[] args) throws SchedulerException {

        StdSchedulerFactory ssf = new StdSchedulerFactory();
        Scheduler scheduler = ssf.getScheduler();
        scheduler.start();

        Date date = new Date();

        JobDetail jd = newJob(HelloJob.class)
                .withIdentity("j1", "g2")
                .build();

        /** 1. Build a trigger for a specific moment in time, with no repeats. */
//        Trigger trigger = newTrigger()
//                .withIdentity("trigger1", "g2")
//                .startAt(new Date())
//                .forJob("j1", "group2")
//                .build();

        /**
         *  2. Build a trigger for specific moment in time,
         *     then repeating every ten seconds three times.
         */
//        SimpleTrigger trigger = newTrigger()
//                .withIdentity("t2", "g2")
//                .startAt(date)
//                .withSchedule(simpleSchedule()
//                        .withIntervalInSeconds(10)
//                        .withRepeatCount(3))
//                .forJob("j1", "g2")
//                .build();

        /** 3. Build a trigger that will fire once. */
//        LocalDateTime startDT = LocalDateTime.of(2020, 10, 6, 21, 25, 01);
//        Trigger trigger = newTrigger()
//                .withIdentity("t3", "g2")
//                .startAt(TimeUtils.localDateTime2Date(startDT))
//                .forJob("j1", "g2")
//                .build();


        /**
         * 4. Build a trigger that will fire now, then repeat every ten seconds,
         *    util 2020-10-07 13:22:00
         */
        System.out.println(LocalDateTime.now());
        LocalDateTime endDT = LocalDateTime.of(2020, 10, 7, 13, 25, 00);
        SimpleTrigger trigger = newTrigger()
                .withIdentity("t4", "g2")
                .withSchedule(simpleSchedule()
                        .withIntervalInSeconds(10)
                        .repeatForever())
                .endAt(TimeUtils.localDateTime2Date(endDT))
                .build();

        scheduler.scheduleJob(jd, trigger);
    }
}
