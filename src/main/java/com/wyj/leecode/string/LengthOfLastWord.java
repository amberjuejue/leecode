package com.wyj.leecode.string;

/**
 * @author wangyujue
 */

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
//        int hello_world = lengthOfLastWord("Hello World");
        int hello_world = lengthOfLastWord(" ");
        System.out.println(hello_world);
    }

    public static int lengthOfLastWord(String s) {
            if (s.length() == 0) {
                return 0;
            }
            String[] s1 = s.split(" ");
            if (s1.length == 0) {
                return 0;
            }
            int length = s1.length;
            String s2 = s1[length - 1];
            return s2.length();
    }
}
