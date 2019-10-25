package com.mph.cn.designpattern;

/**
 * 单例模式
 */
public class SingleDcl {
    private static volatile SingleDcl singleDcl;

    private SingleDcl() {
    }

    public static SingleDcl getSingleDcl() {
        if (singleDcl == null) {
            synchronized (SingleDcl.class) {
                //单例模式 双重检测
                if (singleDcl == null) {
                    singleDcl = new SingleDcl();
                }
            }
        }
        return singleDcl;
    }
}



