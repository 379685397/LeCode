package com.lecode;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class code3 {

    public static int lengthOfLongestSubstring(String s) {
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            if (temp.indexOf(s.substring(i, i + 1)) > 0) {
                temp = temp + s.substring(i, i + 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] v1 = new int[]{2, 2, 2, 1, 1, 1, 2};
        System.out.println(lengthOfLongestSubstring("123"));
    }


}