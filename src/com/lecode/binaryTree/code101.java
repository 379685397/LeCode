package com.lecode.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 * <p>
 * 示例 1：
 * <p>
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 */
public class code101 {

    static List<Integer> list = new ArrayList<>();

    //======================递归算法2=================================
    public boolean isSymmetric2(TreeNode root) {
        return check2(root, root);
    }

    public boolean check2(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check2(p.left, q.right) && check2(p.right, q.left);
    }

    //======================算法2=================================
    //======================3迭代=================================
    public boolean isSymmetric3(TreeNode root) {
        return check3(root, root);
    }

    public boolean check3(TreeNode u, TreeNode v) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()) {
            u = q.poll();
            v = q.poll();
            if (u == null && v == null) {
                continue;
            }
            if ((u == null || v == null) || (u.val != v.val)) {
                return false;
            }

            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }
        return true;
    }

    //======================3迭代=================================
    public static void main(String[] args) {
        TreeNode T1 = new TreeNode(1);
        TreeNode T2 = new TreeNode(2);
        TreeNode T3 = new TreeNode(2);
        TreeNode T4 = new TreeNode(3);
        TreeNode T5 = new TreeNode(4);
        TreeNode T6 = new TreeNode(4);
        TreeNode T7 = new TreeNode(3);
        T1.left = T2;
        T1.right = T3;
        T2.left = T4;
        T2.right = T5;
        T3.left = T4;
        T3.right = T5;

    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


} 