package com.lecode;

/**
 * @Auther: DarkKing
 * @Date: 2019/7/22 21:20
 * @Description:
 */
public class LeetCode206 {

    static class Solution {
        public static ListNode reverseList(ListNode head) {
            ListNode cur = head;
            ListNode pre = null;
            ListNode next;
            while (cur != null) {
                //获取当前节点的下一个节点
                    next = cur.next;
                    //设置当前节点的前置节点
                    cur.next = pre;
                    //将当前节点设置为前置节点
                    pre = cur;
                    //将下一个节点设置为当前节点，继续循环。
                    cur = next;
            }
            return pre;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode list= new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        ListNode list2 = Solution.reverseList(list);
        System.out.println(list2.toString());
    }
}
