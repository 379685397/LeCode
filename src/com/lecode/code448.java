package com.lecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 * 示例 1：
 * 输入：nums = [4,3,2,7,8,2,3,1]
 * 输出：[5,6]
 */
public class code448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap map = new HashMap();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            map.put(num, 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.get(i) == null) {
                list.add(i);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] v1 = new int[]{1, 1};
        int[] v2 = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDisappearedNumbers(v1);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }


}