package com.lecode.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 */
public class code94 {
    static List<Integer> list = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

    public static void main(String[] args) {
        TreeNode T = new TreeNode(1);
        TreeNode T2 = new TreeNode(2);
        T.right = T2;
        TreeNode T3 = new TreeNode(3);
        T2.left = T3;
        List<Integer> list = inorderTraversal(T);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static void read(TreeNode root) {
        if (root == null) {
            return;
        }
        read(root.left);
        System.out.println(root.val);
        read(root.right);
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