package com.lecode;


import java.util.HashMap;

/**
 * @Auther: 王正强
 * @Date: 2019/8/10 18:53
 * @Description:
 */
public class LeetCode7 {

    /**
     * https://leetcode-cn.com/problems/reverse-integer/
     *
     给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     示例 1:
     输入: 123
     输出: 321
     示例 2:
     输入: -123
     输出: -321
     示例 3:
     输入: 120
     输出: 21
     注意:
     假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
     来源：力扣（LeetCode）
     链接：https://leetcode-cn.com/problems/reverse-integer
     著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 解题思路，这种解法是否没救了。。。
     *
     */
    static class Solution {
        public int reverse(int x) {
            try {
                String str= String.valueOf(x);
                StringBuffer sb = new StringBuffer(str);
                sb.reverse();
                String temp = "";
                if(x<0){
                    temp =   sb.substring(sb.length()-1,sb.length())+sb.substring(0,sb.length()-1);
                }else{
                    temp = sb.toString();
                }
                int result = Integer.parseInt(temp);
                return result;
            }catch (NumberFormatException e) {
                return 0;
            }
        }

        public static void main(String[] args) {

            System.out.println( new LeetCode7.Solution().reverse(123));
        }

    }


}
