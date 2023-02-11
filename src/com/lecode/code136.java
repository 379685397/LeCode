package com.lecode;

import java.util.HashMap;

/**
 * 输入：nums = [2,2,1]
 * 输出：1
 * 异或运算更简单
 * 任何数和0做异或都为原本的数
 */
public class code136 {

    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer) == 1) {
                return integer;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] v1 = new int[]{2, 2, 1};
        System.out.println(singleNumber(v1));
    }


}