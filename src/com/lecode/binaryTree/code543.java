package com.lecode.binaryTree;

/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 * 示例 :
 * 给定二叉树
 * 1
 * / \
 * 2   3
 * / \
 * 4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 */
public class code543 {


    //======================递归算法2=================================
    static int ans = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        int ans = 1;
        read(root);
        return ans - 1;
    }

    public static int read(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int L = read(root.left);
        int R = read(root.right);
        ans = Math.max(ans, L + R + 1);
        return Math.max(L, R) + 1;
    }

    public static void main(String[] args) {
        TreeNode T1 = new TreeNode(1);
        TreeNode T2 = new TreeNode(2);
        TreeNode T3 = new TreeNode(3);
        TreeNode T4 = new TreeNode(4);
        TreeNode T5 = new TreeNode(5);
        TreeNode T6 = new TreeNode(6);
        TreeNode T7 = new TreeNode(9);
        T1.left = T2;
        T1.right = T3;
        T2.left = T4;
        T2.right = T5;
//        T3.left = T6;
//        T3.right = T7;
        System.out.println(diameterOfBinaryTree(T1));
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