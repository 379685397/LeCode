package com.lecode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: DarkKing
 * @Date: 2019/7/22 21:20
 * @Description:
 */
public class LeetCode141 {

    static class Solution {
        public static boolean hasCycle(ListNode head) {
            Set<ListNode> nodesSeen = new HashSet<>();
            while (head != null) {
                if (nodesSeen.contains(head)) {
                    return true;
                } else {
                    nodesSeen.add(head);
                }
                head = head.next;
            }
            return false;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode list= new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(2);
        boolean result = Solution.hasCycle(list);
        System.out.println(result);
    }
}
