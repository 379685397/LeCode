package com.lecode;

/**
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 * 示例 1：
 * 输入：x = 1, y = 4
 * 输出：2
 * 解释：
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * 上面的箭头指出了对应二进制位不同的位置。
 */
public class code461 {
    public static int hammingDistance(int x, int y) {
        String xs = Integer.toBinaryString(x);
        String ys = Integer.toBinaryString(y);
        if (xs.length() > ys.length()) {
            int len = xs.length() - ys.length();
            for (int i = 0; i < len; i++) {
                ys = "0" + ys;
            }
        } else {
            int len = ys.length() - xs.length();
            for (int i = 0; i < len; i++) {
                xs = "0" + xs;
            }
        }
        int count = 0;//计数
        for (int i = 0; i < xs.length(); i++) {
            if (xs.charAt(i) != ys.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] v1 = new int[]{1, 1};
        int[] v2 = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        int result = hammingDistance(1, 4);
        System.out.println(result);
    }
}