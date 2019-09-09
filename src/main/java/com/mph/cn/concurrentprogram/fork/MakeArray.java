package com.mph.cn.concurrentprogram.fork;

import java.util.Random;

public class MakeArray {

    public   static final  int arr_length= 4000;
    public  static  int[] makeArray(){
        Random random = new Random();
        int[] arr = new int[arr_length];
        //填充数组
        for (int i = 0 ;i< arr_length; i++){
            arr[i]=random.nextInt(arr_length*3);
        }
        return arr;
    }
}
