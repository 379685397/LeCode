package com.lecode;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 示例 1:
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class code283 {

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    //双指针
    public static void moveZeroes2(int[] nums) {
        int head = 0;
        int tail = 0;


    }

    public static void main(String[] args) {
        int[] v1 = new int[]{0, 1, 0, 3, 6, 4};
        int[] v2 = new int[]{1, 2};
        moveZeroes(v1);
        for (int i : v1) {
            System.out.print(i + " ");
        }


    }


}