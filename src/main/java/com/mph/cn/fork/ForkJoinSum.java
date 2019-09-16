package com.mph.cn.fork;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

import static java.lang.Thread.sleep;

public class ForkJoinSum extends RecursiveTask<Integer> {
    public static int THRESHOLD = MakeArray.arr_length / 10;
    private int[] src; //实际需要统计的数组
    private int startIndex;//开始统计下标
    private int endIndex;//结束下标
    int[] array = MakeArray.makeArray();

    public ForkJoinSum(int[] src, int startIndex, int endIndex) {
        this.src = src;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    protected Integer compute() {
        if (endIndex - startIndex < THRESHOLD) {
            //定义数组长度小于分组计算长度
            int count = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count = count + src[i];
            }
            return count;
        } else {
            int midIndex = (startIndex + endIndex) / 2;
            ForkJoinSum left = new ForkJoinSum(src,startIndex,midIndex);
            ForkJoinSum right = new ForkJoinSum(src, midIndex+1, endIndex);
            invokeAll(left,right);
            return left.join()+right.join();
        }
    }


    public static void main(String[] args) {
        int[] array = MakeArray.makeArray();
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinSum forkJoinSum = new ForkJoinSum(array, 0, array.length - 1);
        long start = System.currentTimeMillis();
        Integer invoke = pool.invoke(forkJoinSum);//同步调用
        long end = System.currentTimeMillis();
        System.out.println(invoke);
        System.out.println("开始时间===>>>"+start+"结束时间====>>>"+end);

    }

}
