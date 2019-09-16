package com.mph.cn.syn;

import com.mph.cn.utils.SleepTools;

/**
 * 使用同步锁
 */
public class UseSynLockImpl implements  GoodsService{
    private  GoodsInfo goodsInfo;

    public UseSynLockImpl(GoodsInfo goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    @Override
    public synchronized GoodsInfo getNum() {
        SleepTools.currentSleep(5);
        return this.goodsInfo;
    }

    @Override
    public synchronized void setNum(int number) {
        SleepTools.currentSleep(5);
        goodsInfo.changeNumber(number);
    }
}
