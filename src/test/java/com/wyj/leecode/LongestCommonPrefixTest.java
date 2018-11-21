package com.wyj.leecode;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import static org.junit.Assert.*;

@Component
public class LongestCommonPrefixTest extends LeecodeApplicationTests {

    @Test
    public void test() {
        Assert.assertEquals("lee", longestCommonPrefix(new String[]{"leets", "leetcode", "leet", "leeds"}));
    }

    // Horizontal Scanning
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // 找出S1与Si间的最长公共字符串
            // indexOf：当存在串时返回>0；不存串时返回-1
            // 只要不存在串，就缩减串的规模，再进行查找
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}