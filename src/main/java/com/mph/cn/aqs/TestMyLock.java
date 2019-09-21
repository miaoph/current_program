package com.mph.cn.aqs;

import com.mph.cn.utils.SleepTools;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 解释aqs链接地址
 * https://blog.csdn.net/fxkcsdn/article/details/82217760
 */
public class TestMyLock {
    public void test() {
        final Lock lock =
//                new ReentrantLock();
                new MyLock();

        class Worker extends Thread {
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        SleepTools.currentSleep(1);
                        System.out.println(Thread.currentThread().getName()+"---->>>>");
                        SleepTools.currentSleep(1);
                    } finally {
                        lock.unlock();
                    }
                    SleepTools.currentSleep(2);
                }
            }
        }
        // 启动10个子线程
        for (int i = 0; i < 10; i++) {
            Worker w = new Worker();
            w.setDaemon(true);
            w.start();
        }
        // 主线程每隔1秒换行
        for (int i = 0; i < 10; i++) {
            SleepTools.currentSleep(10);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TestMyLock testMyLock = new TestMyLock();
        testMyLock.test();
    }
}
