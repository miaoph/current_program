package com.mph.cn.threadpool;

import com.mph.cn.utils.SleepTools;

import java.util.concurrent.*;

/**
 * 线程池
 */
public class TestMyThreadPool {

    public static class  Worker implements Runnable{
        private String  name;

        public Worker(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            SleepTools.currentSleep(2000);
            System.out.println(Thread.currentThread().getName()+name);
        }
    }

    public  static  class  CallWorke implements Callable<String> {
        private String  name;

        public CallWorke(String name) {
            this.name = name;
        }

        @Override
        public String  call() throws Exception {
            SleepTools.currentSleep(2000);
            System.out.println(Thread.currentThread().getName()+name);
            return Thread.currentThread().getName();
        }
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 5000L, TimeUnit.MINUTES,
                new ArrayBlockingQueue<Runnable>(3),//队列大小
                new ThreadPoolExecutor.DiscardOldestPolicy()); //异常机制

        for (int i=0 ;i<6;i++ ){
            Worker worker = new Worker("work---->"+i);
            threadPoolExecutor.execute(worker);
        }

        for (int i=0 ;i<6;i++ ){
            CallWorke callWorke = new CallWorke("callWorker--->>" + i);
            Future<String> future = threadPoolExecutor.submit(callWorke);
            System.out.println(future.get());
        }
        threadPoolExecutor.shutdown();

    }
}
