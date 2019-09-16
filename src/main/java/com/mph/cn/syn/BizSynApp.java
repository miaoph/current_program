package com.mph.cn.syn;

import com.mph.cn.utils.SleepTools;

import java.util.Random;

/**
 * syn 同步业务启动类
 * 对商品进行业务应用
 */
public class BizSynApp {
    static final int readWriteRatio = 10;//读写线程的比例
    static final int minThreadCount = 3;//最少线程数

//进行读操作

    private static class getThreadNum implements Runnable {

        private GoodsService goodsService;

        public getThreadNum(GoodsService goodsService) {
            this.goodsService = goodsService;
        }

        @Override
        public void run() {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                goodsService.getNum();
            }
            System.out.println(Thread.currentThread().getName() + "读取商品数据耗时："
                    + (System.currentTimeMillis() - start) + "ms" + "------");
        }
    }

    private  static  class  setThreadNum implements Runnable{
        private GoodsService goodsService;

        public setThreadNum(GoodsService goodsService) {
            this.goodsService = goodsService;
        }

        @Override
        public void run() {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                SleepTools.currentSleep(50);
                goodsService.setNum(i);
            }
            System.out.println(Thread.currentThread().getName()
                    +"写商品数据耗时："+(System.currentTimeMillis()-start)+"ms--------->>>>");
        }
    }
    public static void main(String[] args) {
        GoodsInfo goodsInfo = new GoodsInfo("ticket", 0, 1000);
        System.out.println(goodsInfo);
        GoodsService goodsService =
//                new UseSynLockImpl(goodsInfo);
        new UseRWLockImpl(goodsInfo);
        for(int i = 0;i<minThreadCount;i++){
            Thread setT = new Thread(new setThreadNum(goodsService));
            for(int j=0;j<readWriteRatio;j++) {
                Thread getT = new Thread(new getThreadNum(goodsService));
                getT.start();
            }
            SleepTools.currentSleep(100);
            setT.start();
        }

    }
}
