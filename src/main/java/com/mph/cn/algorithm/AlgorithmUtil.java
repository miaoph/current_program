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


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

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

        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        int[] nums2 = new int[]{2, 5, 6};
        //       merge(nums1,3,nums2,3);
        //        removeDuplicates(new int []{0,0,1,1,1,2,2,3,3,4});

        //        removeDuplicates_1(new int []{0,0,1,1,1,1,2,3,3});
        ;
        //        rotate(nums1,3);
        //        maxProfit(nums1);

        //        String s ="flower";
        //         char[] chars = s.toCharArray();
        //        char c = 1;
        //Objects.toString(c);
        //        final HashMap<Object, Object> map = new HashMap<>();
        ////        map.values()
        //        String substring = s.substring(0, 1);


        //        System.out.println(canJump(nums1));
        //       String[] strs = new String[] {"flower","flow","flight"};
        //        longestCommonPrefix(strs);
        //        twoSum(nums1,9);
        //        isHappy(19);
        //        containsNearbyDuplicate(nums,2);
        //        simplifyPath("/.../a/../b/c/../d/./");
        //        calculate("   (  3 ) ");
        ListNode  head=  new ListNode(1);
        ListNode  next1=  new ListNode(2);
        head.next=next1;
        ListNode  next2=  new ListNode(3);
        next1.next=next2;
        ListNode  next3=  new ListNode(3);
        next2.next=next3;
        ListNode  next4=  new ListNode(4);
        next3.next=next4;
        ListNode  next5=  new ListNode(4);
        next4.next=next5;
        ListNode  next6=  new ListNode(5);
        next5.next=next6;
        ListNode  next7=  new ListNode(7);
        next6.next=next7;
//        reverseBetween(head,1,2);
//        ListNode tail = null;
//        ListNode  cur=head;
//        while (head != null) {
//            tail = head;
//            head = head.next;
//        }
//        reverseLinkedList(cur);
//        System.out.println(tail);

//        reverseKGroup(head,2);
        getDiffNode(head);
    }

    private static ListNode getDiffNode(ListNode node) {
        ListNode hard = null;
        ListNode diff = null;
        ListNode pre = node;
        ListNode cur = node.next;
        boolean flag = true;
        while (cur != null) {
            int p = pre.val;
            int n = cur.val;
            if (p == n) {
                flag = false;
            }
            if (p != n) {
                if (flag) {
                    if (hard == null) {
                        hard = pre;
                    } else {
                        diff.next = pre;
                    }
                    diff = pre;
                    diff.next = null;
                }
                pre = cur;
                flag = true;
            }
            cur = cur.next;
        }
        return hard;
    }




//    private ListNode getDiffNode(ListNode node) {
//        ListNode hard = null;
//        ListNode diff = null;
//        ListNode pre = node;
//        ListNode cur = node.next;
//        boolean flag = true;
//        while (cur != null) {
//            int p = pre.val;
//            int n = cur.val;
//            if (p == n) {
//                flag = false;
//            }
//            if (p != n) {
//                if (flag) {
//                    if (hard == null) {
//                        hard = pre;
//                    } else {
//                        diff.next = pre;
//                    }
//                    diff = pre;
//                    diff.next = null;
//                }
//                pre = cur;
//                flag = true;
//            }
//            cur = cur.next;
//        }
//
//        if (flag) {
//            if (diff != null) {
//                diff.next = pre;
//            } else {
//                hard = pre;
//            }
//
//        }
//        if (hard == null && node.next == null) {
//            return node;
//        }
//        return hard;
//    }

    private static void reverseLinkedList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode hhead = head;
        ListNode tail = null;
        ListNode preNode = head;
        Stack<ListNode> stack = new Stack();
        int i = 1;
        while (head != null) {
            if (i < left) {
                preNode = head;
            }
            if (i >= left && i <= right) {
                stack.push(head);
            }
            if (i > right) {
                break;
            }
            head = head.next;
            i++;
        }
        int j = 1;
        while (!stack.isEmpty()) {
            ListNode current = stack.pop();
            if (j == 1) {
                tail = current.next;
            }
            current.next = null;
            preNode.next = current;
            preNode = current;
            j++;
        }
        preNode.next = tail;

        return hhead;
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pre = null;
        ListNode currentNode = null;
        while (list1 != null && list2 != null) {
            int l1 = list1.val;
            int l2 = list2.val;
            if (l1 > l2) {
                // pre = setPreNode(pre, list2);
                if (pre == null) {
                    pre = list2;
                } else {
                    currentNode.next = list2;
                }
                currentNode = list2;
                list2 = list2.next;
            } else {
                if (pre == null) {
                    pre = list1;
                } else {
                    currentNode.next = list1;

                }
                currentNode = list1;
                list1 = list1.next;
            }
        }

        if (list1 != null) {
            currentNode.next = list1;
        }
        if (list2 != null) {
            currentNode.next = list2;
        }
        return pre;
    }

    public static int calculate(String s) {

        s = s.replaceAll(" ", "");
        if (!s.contains("+") && !s.contains("-")) {
            if (s.contains("(")) {
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < s.length(); i++) {
                    String c = Objects.toString(s.charAt(i));
                    if (isLeftf(c)) {
                        continue;
                    }
                    if (isRightf(c)) {
                        continue;
                    }
                    sb.append(c);
                }
                s = sb.toString();
            }
            return Integer.valueOf(s.trim());
        }
        Deque<Integer> addstack = new LinkedList<Integer>();
        Deque<Integer> subStack = new LinkedList<Integer>();
        boolean subFlag = false;
        boolean ssubFlag = false;
        Integer leftIndex = 0;
        Integer bNumFlag = 0;
        for (int i = 0; i < s.length(); i++) {
            String c = Objects.toString(s.charAt(i));
            if (isLeftf(c)) {
                if (subFlag) {
                    leftIndex++;
                }
                bNumFlag = 0;
                continue;
            }
            if (isRightf(c)) {
                leftIndex--;
                if (subFlag) {
                    subFlag = false;
                }
                if (leftIndex == 0) {
                    ssubFlag = false;
                }
                bNumFlag = 0;
                continue;
            }
            if (isAdd(c)) {
                bNumFlag = 0;
                continue;
            }
            if (isSub(c)) {
                if (subFlag && leftIndex > 0) {
                    ssubFlag = true;
                }
                subFlag = true;
                bNumFlag = 0;
                continue;
            }
            if (bNumFlag > 0) {
                Integer tmp = bNumFlag;
                while (tmp > 0) {
                    tmp--;
                }
            }
            if (subFlag) {
                if (ssubFlag) {
                    addstack.push(Integer.valueOf(c));
                } else {
                    subStack.push(Integer.valueOf(c));
                }
            } else {
                addstack.push(Integer.valueOf(c));
            }
            if (leftIndex == 0) {
                subFlag = false;
            }
            bNumFlag++;
        }
        Integer sum = 0;
        while (!addstack.isEmpty()) {
            sum += addstack.pop();
        }
        while (!subStack.isEmpty()) {
            sum -= subStack.pop();
        }
        return sum;
    }

    public static boolean isLeftf(String token) {
        return "(".equals(token);
    }

    public static boolean isRightf(String token) {
        return ")".equals(token);
    }

    public static boolean isAdd(String token) {
        return "+".equals(token);
    }

    public static boolean isSub(String token) {
        return "-".equals(token);
    }


    public static String simplifyPath(String path) {
        String[] dirs = path.split("/");
        int index = 0;
        for (String dir : dirs) {
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            }
            if (dir.equals("..")) {
                index = Math.max(0, index - 1);
            } else {
                dirs[index++] = dir;
            }
        }
        if (index == 0) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append("/").append(dirs[i]);
        }
        return sb.toString();
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            if (map.containsKey(c)) {
                if (nums[i - map.get(c)] <= k) {
                    return true;
                }
            } else {
                map.put(c, i);
            }
        }
        return false;
    }

    public static boolean isHappy(int n) {
        Integer sum = n;
        while (sum != 1) {
            if (sum >= 1000) {
                return false;
            }
            sum = calc(sum);
        }
        return true;
    }

    private static Integer calc(int num) {
        Integer sum = 0;
        Integer current = num;
        while (current != 0) {
            int c = current % 10;
            sum += c * c;
            current = current / 10;
        }
        return sum;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[]{map.get(result), i};
            } else {
                map.put(result, i);
            }
        }
        return new int[]{0};
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String preStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = Math.min(preStr.length(), strs[i].length());
            if (prefix != "") {
                j = Math.min(prefix.length(), strs[i].length());
                preStr = prefix;
            }

            for (int k = 0; k < j; k++) {
                if (preStr.charAt(k) == strs[i].charAt(k)) {
                    prefix = prefix + preStr.charAt(k);
                } else {
                    break;
                }
            }
        }
        return prefix;
    }

    public static boolean canJump(int[] nums) {
        int l = nums.length - 1;
        int s = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int c = nums[i];
            s = i;
            if (c + s >= l) {
                return true;
            }
        }
        return false;

    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > 0) {
                max = max + prices[i] - min;
                min = prices[i];
            }
        }
        return max;
    }

    public static void rotate(int[] nums, int k) {
        int[] knums = new int[nums.length];
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            knums[j] = nums[i];
            j++;
        }
        for (int i = 0; i < k; i++) {
            knums[j] = nums[i];
            j++;
        }
        nums = knums;
    }

    public static int removeDuplicates_1(int[] nums) {
        int f = 1;
        int s = 0;
        int flag = 0;
        while (f < nums.length) {
            if (nums[f] < nums[s]) {
                f++;
                continue;
            }
            if (nums[f] == nums[s]) {
                if (flag == 0) {
                    if (f - s > 1) {
                        int tmp = nums[s + 1];
                        nums[s + 1] = nums[f];
                        nums[f] = tmp;
                    }
                    s++;
                }
                flag++;
            } else {
                if (flag > 1) {
                    int tmp = nums[s + 1];
                    nums[s + 1] = nums[f];
                    nums[f] = tmp;
                } else {
                    if (f - s > 1) {
                        int tmp = nums[s + 1];
                        nums[s + 1] = nums[f];
                        nums[f] = tmp;
                    }
                }
                flag = 0;
                s++;
            }
            f++;
        }
        return s + 1;
    }

    public static int removeDuplicates(int[] nums) {
        int l = nums.length;
        if (l == 0) {
            return 0;
        }


        int f = 0;
        int s = 1;
        while (f <= l - 1) {
            int tf = nums[f];
            int ts = nums[s];
            if (tf != ts) {
                nums[s] = nums[f];
                s++;
            }
            f++;
            continue;
        }

        return s;

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = new int[m + n];

        for (int i = 0; i != m; ++i) {
            merge[i] = nums1[i];
        }

        for (int i = 0; i != n; ++i) {
            merge[m + i] = nums2[i];
        }

        Arrays.sort(merge);

        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i]);
        }

    }


    public static Integer getMax(int len, int target) {
        Integer num = 1;
        for (; ; ) {
            len--;
            if (len <= 0) {
                break;
            }
            num = num * 10;
        }
        Integer total = target * num;
        return total;
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
