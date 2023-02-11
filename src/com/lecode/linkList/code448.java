package com.lecode.linkList;

import java.util.ArrayList;
import java.util.List;

import com.lecode.structure.ListNode;

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 * <p>
 *  
 * 示例 1：
 * <p>
 * 输入：head = [1,2,2,1]
 * 输出：true
 * 输入：head = [1,2]
 * 输出：false
 */
public class code448 {
    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        if (head == null) {
            return false;
        }
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //双指针
    public static boolean isPalindrome2(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        if (head == null) {
            return false;
        }
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int first = 0;
        int last = list.size() - 1;
        while (first < last) {
            if (list.get(first) != list.get(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        int[] num = new int[]{1, 2};
        listNode = listNode.init(num);
        System.out.println(isPalindrome2(listNode));
    }


}