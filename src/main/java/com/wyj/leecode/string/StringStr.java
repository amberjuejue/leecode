package com.wyj.leecode.string;

/**
 * @author wangyujue
 */

/**
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */
public class StringStr {

    public static void main(String[] args) {
//        String a = "hello";
//        String b = "ll";
        String a = "aaaaa";
        String b = "bba";
        int i = strStr(a, b);
        System.out.println(i + "---");

    }

    public static int strStr(String haystack, String needle) {

        if (needle == null || needle.length() == 0) {
            return 0;
        }

        char c = needle.charAt(0);
        String indexChar = String.valueOf(c);

        for (int i = 0; i < haystack.length(); i++) {
            // 相等
            if (String.valueOf(haystack.charAt(i)).equals(indexChar)) {
                int j = i;
                int count = 0;
                // 如果needle的长度大于haystack, 直接返回-1
                if (i + needle.length() > haystack.length()) {
                    return -1;
                }
                for (int k = 0; k < needle.length(); k++) {
                    if (String.valueOf(haystack.charAt(j)).equals(String.valueOf(needle.charAt(k)))) {
                        j++;
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == needle.length()) {
                    return i;
                }
            }
            // 不相等
            else {

            }

        }
        return -1;
    }
}
