package com.mph.cn.syn;

import com.mph.cn.utils.SleepTools;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class UseRWLockImpl implements GoodsService {
    private GoodsInfo goodsInfo;
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private final Lock rLock = rwLock.readLock();
    private final Lock wLock = rwLock.writeLock();

    public UseRWLockImpl(GoodsInfo goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    @Override
    public GoodsInfo getNum() {
        rLock.lock();
        try {
            SleepTools.currentSleep(5);
            System.out.println("查询数据---->>>>>"+goodsInfo);
            return this.goodsInfo;
        } finally {
            rLock.unlock();
        }

    }

    @Override
    public void setNum(int number) {
        wLock.lock();
        try{
            SleepTools.currentSleep(5);
            goodsInfo.changeNumber(number);
            System.out.println(Thread.currentThread().getName()
                    +"写数据商品数：--------->>>>"+ goodsInfo);
        }finally {
            wLock.unlock();
        }
    }
}
