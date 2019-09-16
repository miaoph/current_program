package com.mph.cn.fork;

import static java.lang.Thread.sleep;

public class MainSum {

    public static void main(String[] args) throws InterruptedException {
        int[] array = MakeArray.makeArray();
        int sum=0;
        long start = System.currentTimeMillis();
        System.out.println(start);
        for (int i=0;i<array.length;i++) {
            sleep(1);
            sum=sum+array[i];
        }
        System.out.println("开始时间===>>>"+start+"结束时间====>>>"+System.currentTimeMillis());
    }
}
