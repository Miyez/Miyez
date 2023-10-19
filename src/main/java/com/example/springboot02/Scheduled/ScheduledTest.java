package com.example.springboot02.Scheduled;/*
 *@title Scheduled
 *@description 定时任务
 *@author 24844
 *@version 1.0
 *@create 2023/10/17 14:12
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@EnableScheduling
public class ScheduledTest {

    //@Scheduled(cron = "0/5 * * * * ?")
    @Async
//    @Transactional
    public void show(){
//        System.out.println("定时任务执行中。。。。"+System.currentTimeMillis());
    }
}
