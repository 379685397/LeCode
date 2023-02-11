package com.lecode;

/**
 * 给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。
 * 输入：n = 2
 * 输出：[0,1,1]
 * 解释：
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 */
public class code338 {

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            String temp = Integer.toBinaryString(i);
            int count = 0;
            if (temp.length() == 1) {
                if (temp.equals("1")) {
                    count++;
                }
                ans[i] = count;
            } else {
                for (int j = 0; j < temp.length(); j++) {
                    if (temp.charAt(j) == '1') {
                        count++;
                    }
                }
                ans[i] = count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] v1 = new int[]{7, 1, 5, 3, 6, 4};
        int[] v2 = new int[]{1, 2};
        int[] result = countBits(5);
        for (int i : result) {
            System.out.print(i + ",");
        }

    }


}