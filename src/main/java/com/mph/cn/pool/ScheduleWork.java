package com.mph.cn.pool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ScheduleWork implements Runnable {
    private final static  int NORMAL =1;
    private final  static  int EXCEPTION =-1;
    private  final  static  int  CATCH_EXCEPTION = 1;

    private int taskNum;

    public ScheduleWork(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        if(taskNum==NORMAL){
            System.out.println("normal"+sdf.format(new Date()));
        }else if(taskNum==EXCEPTION){
            System.out.println("has exception"+ sdf.format(new Date()));
         throw    new RuntimeException("has exception");
        }else if(taskNum==CATCH_EXCEPTION){
           try{
               System.out.println("has exception but catch"+ sdf.format(new Date()));
             throw   new RuntimeException("has exception but catch");
           }catch (Exception e){
               System.out.println("has exception but catch"+ sdf.format(new Date()));
           }
        }

    }
}
