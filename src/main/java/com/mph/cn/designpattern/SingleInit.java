package com.mph.cn.designpattern;

/**
 * 懒汉式  单例线程安全方法
 */
public class SingleInit {

    private SingleInit() {
    }
    private static class SingleHolder {
        private static SingleInit singleInit =new SingleInit();
    }
    public static SingleInit  getInstance(){
        return SingleHolder.singleInit;
    }

}
