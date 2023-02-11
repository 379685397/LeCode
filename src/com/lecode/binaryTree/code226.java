package com.lecode.binaryTree;

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 * <p>
 * 示例 1：
 * <p>
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：true
 */
public class code226 {


    //======================递归算法2=================================
    public static TreeNode isSymmetric(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = isSymmetric(root.left);
        TreeNode right = isSymmetric(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {
        TreeNode T1 = new TreeNode(4);
        TreeNode T2 = new TreeNode(2);
        TreeNode T3 = new TreeNode(7);
        TreeNode T4 = new TreeNode(1);
        TreeNode T5 = new TreeNode(3);
        TreeNode T6 = new TreeNode(6);
        TreeNode T7 = new TreeNode(9);
        T1.left = T2;
        T1.right = T3;
        T2.left = T4;
        T2.right = T5;
        T3.left = T6;
        T3.right = T7;
        isSymmetric(T1);
        System.out.println();
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