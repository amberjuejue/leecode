package com.wyj.leecode.string;

/**
 * @author wangyujue
 */

/**
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 *
 * 注意：整数顺序将表示为一个字符串。
 *
 *
 */

public class CountAndSay {

    public static void main(String[] args) {
        String s = countAndSay(6);
        System.out.println(s);
    }

    public static String countAndSay(int n) {
        return countAndSay("1", 1, n);
    }

    private static String countAndSay(String str, int deep, int n) {
        if (deep == n) {
            return str;
        }
        int count = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if ((i+1) >= str.length()) {
                sb.append(count).append(str.charAt(i));
                break;
            }
            char first = str.charAt(i);
            char second = str.charAt(i+1);
            if (first == second) {
                count++;
            } else {
                sb.append(count).append(str.charAt(i));
                count = 1;
            }
        }
        return countAndSay(sb.toString(), deep+1, n);
    }
}
