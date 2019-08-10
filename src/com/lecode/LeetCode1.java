package com.lecode;

import java.util.HashMap;

/**
 * @Auther: 王正强
 * @Date: 2019/8/10 18:53
 * @Description:
 */
public class LeetCode1 {

    /**
     * https://leetcode-cn.com/problems/two-sum/
     *
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * 示例:
     *
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * 解题思路，hash表法
     *
     */
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i =0;i<nums.length;i++){
                int temp = target - nums[i];
                if(map.containsKey(temp)&&map.get(temp)!=i){
                    return new int[]{i,map.get(temp)};
                }else{
                    map.put(nums[i],i);
                }
            }
            return null;
        }
        public static void main(String[] args) {
            int nums[] = new int[]{2,7,11,12,15};
            int target = 9;
            int[] result = new Solution().twoSum(nums,target);
            for (int i : result) {
                System.out.print(i+" ");
            }

        }

    }


}
