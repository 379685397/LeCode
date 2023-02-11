package com.lecode.linkList;

/**
 * 输入：n = 2
 * 输出：2
 * 解释：有两种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶
 * 2. 2 阶
 */
public class code70 {

    public static int climbStairs(int n) {
        int p = 0;
        int q = 0;
        int temp = 1;
        for (int i = 0; i < n; i++) {
            p = q;
            q = temp;
            temp = p + q;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }


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


} 