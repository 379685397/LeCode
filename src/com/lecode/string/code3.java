package com.lecode.string;

/**
 * 3. 无重复字符的最长子串 给定一个字符串 s ， 请你找出其中不含有重复字符的 最长子串 的长度。 示例 1: 输入: s = "abcabcbb" 输出: 3 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class code3 {

    // 滑动窗口，while实现，for循环更好，i当右指针。
    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() <= 1) {
            return s.length();
        }
        int head = 0;
        int tail = 1;
        int max = 0;
        String temp = s.substring(head, tail);
        while (tail < s.length()) {
            tail++;
            String curStr = s.substring(tail - 1, tail);
            if (temp.indexOf(curStr) >= 0) {
                head = head + temp.indexOf(curStr) + 1;
                temp = s.substring(head, tail);
                max = Math.max(max, tail - head);
            } else {
                temp = temp + curStr;
                max = Math.max(max, tail - head);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
        // System.out.println("abc".substring(0, 0));
    }


}