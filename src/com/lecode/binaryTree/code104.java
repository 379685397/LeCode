package com.lecode.binaryTree;

/**
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 */
public class code104 {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode T = new TreeNode(1);
        TreeNode T2 = new TreeNode(2);
        T.right = T2;
        TreeNode T3 = new TreeNode(3);
        T2.left = T3;
        System.out.println(maxDepth(T));
//        List<Integer> list = maxDepth(T);
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
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