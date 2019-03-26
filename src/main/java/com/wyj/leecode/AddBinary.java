package com.wyj.leecode;

/**
 * 二进制求和
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * @author wangyujue
 */
public class AddBinary {

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int al = a.length();
        int bl = b.length();
        int carryNum = 0;
        for (int i = 0; i < (al > bl ? al : bl) ; i++) {
            char chara , charb;
            if (a.length() > i) {
                chara = a.charAt(a.length() - i - 1);
            } else {
                chara = '0';
            }
            if (b.length() > i) {
                charb = b.charAt(b.length() - i - 1);
            } else {
                charb = '0';
            }
            String s = String.valueOf(chara);
            String s1 = String.valueOf(charb);
            Integer sum = Integer.valueOf(s) + Integer.valueOf(s1) + carryNum;
            int remainder = sum % 2;
            str.insert(0, remainder);
            carryNum = sum / 2;
        }
        if (carryNum > 0) {
            str.insert(0, carryNum);
        }
        return str.toString();
    }
}
