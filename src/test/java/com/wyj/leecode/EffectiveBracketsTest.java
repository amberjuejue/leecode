package com.wyj.leecode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class EffectiveBracketsTest {
    @Test
    public void test() {
        try {
            Assert.assertTrue(verify("{[()]}"));
            Assert.assertTrue(verify("{}()[]"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean verify(String s) {
        if (s == null) {
            return false;
        }
        if (s.equals("")) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        // 使用堆来实现
        Stack<Character> stack = new Stack<Character>();
        int i = 0;
        while (i < s.length()) {
            if (stack.empty()) {
                stack.push(s.charAt(i));

            } else {
                Character peek = stack.peek();
                if ((String.valueOf(peek).equals("{") && String.valueOf(s.charAt(i)).equals("}"))
                        || (String.valueOf(peek).equals("(") && String.valueOf(s.charAt(i)).equals(")")
                        || (String.valueOf(peek).equals("[") && String.valueOf(s.charAt(i)).equals("]")))) {
                    stack.pop();
                } else{
                    stack.push(s.charAt(i));
                }
            }
            i++;
        }
        return stack.empty();
    }

}