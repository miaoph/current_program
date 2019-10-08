package com.mph.cn.pool;


import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestScheduleWork {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor =
                new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new ScheduleWork(1),1000,3000, TimeUnit.MILLISECONDS);
    }
}
