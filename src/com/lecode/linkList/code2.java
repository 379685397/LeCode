package com.lecode.linkList;/**
 * 方法描述
 * <p></p>
 *
 * @author wzq 2023/2/1 9:45
 */

/**
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 9465
 * 942
 */
public class code2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sumOneFlag = 0;
        String result = "";
        while (l1 != null || l2 != null) {
            int num1 = 0;
            int num2 = 0;
            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }
            int tail = num1 + num2 + sumOneFlag;
            if (tail > 9) {
                sumOneFlag = 1;
            } else {
                sumOneFlag = 0;
            }
            tail = tail % 10;
            result = result + tail;
        }
        if (sumOneFlag == 1) {
            result = result + sumOneFlag;
        }
        ListNode listNode = new ListNode(Integer.valueOf(result.substring(0, 1)));
        ListNode tail = listNode;
        for (int i = 1; i < result.length(); i++) {
            ListNode temp = new ListNode(Integer.valueOf(result.substring(i, i + 1)));
            tail.next = temp;
            tail = temp;
        }
        return listNode;
    }

    public static void main(String[] args) {
        int[] v1 = new int[]{2, 4, 3};
        int[] v2 = new int[]{5, 6, 4};
        ListNode l1 = new ListNode(v1[0]);
        ListNode p1 = l1;
        ListNode l2 = new ListNode(v2[0]);
        ListNode p2 = l2;
        for (int i = 1; i < v1.length; i++) {
            ListNode temp = new ListNode(v1[i]);
            p1.next = temp;
            p1 = temp;
        }
        for (int i = 1; i < v2.length; i++) {
            ListNode temp = new ListNode(v2[i]);
            p2.next = temp;
            p2 = temp;
        }

        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
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