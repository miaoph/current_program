package com.mph.cn.algorithm;

import com.mph.cn.algorithm.dto.ListNode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: 基本算法实现
 * @author: miaoph
 * @time: 2022/6/2 上午10:28
 */
public class AlgorithmUtil {


    public static void main(String[] args) {

        //         Solution solution = new Solution();
////        solution.reverseBetween()


//        int i=4243129;
//        int calc=i;
//        List<Integer> list = Arrays.asList(2, 4, 9);
//         int len= String.valueOf(i).length();
//         char[] chars = String.valueOf(calc).toCharArray();
//         List<Integer> exList = new ArrayList<>();
//        for(int k=0;k<=list.size()-1;k++){
//          int ck=  list.get(k);
//            for(int j=0;j<chars.length;j++){
//                char aChar = chars[j];
//                Integer curr = Integer.valueOf(aChar+"");
//                if(ck==curr){
//                    exList.add(ck);
//                }
//            }
//        }
//
//        Integer max=0;
//        while (len >0){
//            Integer tempMax=0;
//            for(int j=0;j<= exList.size()-1;j++){
//                int curr= exList.get(j);
//                 Integer calcNum= getMax(len,curr);
//                Integer tempCurrMax=calcNum+max;
//                if(tempCurrMax < calc){
//                    tempMax=tempCurrMax;
//                }
//            }
//
//            max= tempMax;
//            len--;
//        }
//        System.out.println(max);






    }

//    public  void  getMaxNum(List<Integer> exList,int target){
//
//
//
//    }


    public static Integer getMax(int len,int target ){
         Integer num=1;
        for(;;){
            len--;
            if(len<=0){
                break;
            }
            num=num *10;
        }
       Integer  total =target*num;
        return  total;
    }







//    public static class Solution {
//        /***
//         *
//         * 将一个节点数为 size 链表 m 位置到 n 位置之间的区间反转，要求时间复杂度 O(n)O(n)，空间复杂度 O(1)O(1)。
//         * 例如：
//         * 给出的链表为 1\to 2 \to 3 \to 4 \to 5 \to NULL1→2→3→4→5→NULL, m=2,n=4m=2,n=4,
//         * 返回 1\to 4\to 3\to 2\to 5\to NULL1→4→3→2→5→NULL.
//         *
//         * 数据范围： 链表长度 0 < size \le 10000<size≤1000，0 < m \le n \le size0<m≤n≤size，链表中每个节点的值满足 |val| \le 1000∣val∣≤1000
//         * 要求：时间复杂度 O(n)O(n) ，空间复杂度 O(n)O(n)
//         * 进阶：时间复杂度 O(n)O(n)，空间复杂度 O(1)O(1)
//         *
//         * 输入：
//         * {1,2,3,4,5},2,4
//         * 返回值：
//         * {1,4,3,2,5}
//         */
//        /**
//         *
//         * @param head ListNode类
//         * @param m int整型
//         * @param n int整型
//         * @return ListNode类
//         */
//        public ListNode reverseBetween (ListNode head, int m, int n) {
//            // write code here
//            ListNode mPreNode=null;
//            ListNode mNode=null;
//            ListNode nPreNode=null;
//            ListNode nNode=null;
//            ListNode temp =head;
//            int i=1;
//            while(head != null){
//                if(i== m){
//                    mNode =head;
//                }
//                if(i+1==m){
//                    mPreNode=head;
//                }
//                if(i ==n){
//                    nNode =head;
//                }
//                if(i+1 ==n){
//                    nPreNode = head;
//                }
//                ListNode  next=  head.getNext();
//                head=next;
//                i++;
//            }
//            mPreNode .setNext(nNode);
//            ListNode nNext=  nNode.getNext();
//            nPreNode.setNext(mNode);
//            ListNode mNext=  mNode.getNext();
//            nNode.setNext(mNext);
//            mNode.setNext(nNext);
//            return temp;
//        }
//
//        /***
//         * 给定一个单链表的头结点pHead(该头节点是有值的，比如在下图，它的val是1)，长度为n，反转该链表后，返回新链表的表头。
//         *
//         * 数据范围： 0\leq n\leq10000≤n≤1000
//         * 要求：空间复杂度 O(1)O(1) ，时间复杂度 O(n)O(n) 。
//         *
//         * 如当输入链表{1,2,3}时，
//         * 经反转后，原链表变为{3,2,1}，所以对应的输出为{3,2,1}。
//         * 以上转换过程如下图所示：
//         */
//        //反转链表
//        public ListNode ReverseList(ListNode head) {
//            if(head == null){
//                return null;
//            }
//            ListNode pre=null;
//            ListNode curr=head;
//            while(curr !=null){
//                ListNode next=  curr.getNext();
//                //当前next 指向前一个
//                curr.setNext(pre);
//                //前一个更新为当前
//                pre=curr;
//                //当前更新为刚刚记录的后一个
//                curr= next;
//
//            }
//            return pre;
//
//        }
//    }

}
