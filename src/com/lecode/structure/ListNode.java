package com.lecode.structure;

/**
 * /**
 * <p>链表</p>
 *
 * @author wzq 2023/2/9 19:27
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2023/2/9
 * @modify by reason:{方法名}:{原因}
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode init(int[] num) {
        if (num.length > 0) {
            ListNode listNode = new ListNode(num[0]);
            ListNode tail = listNode;
            for (int i = 1; i < num.length; i++) {
                ListNode temp = new ListNode(num[i]);
                tail.next = temp;
                tail = temp;
            }
            return listNode;
        } else {
            return new ListNode();
        }
    }
} 