package com.wyj.leecode.dynamicprogramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wangyujue
 */
public class countcat {

    public static void main(String[] args) {
        String goal = "catpuat";
        int count = count(goal);
        System.out.println("最终数量：" + count);
    }

    private static int count(String str) {
        // 拿到所有cat
        int totalCount = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals("c") ||
                    String.valueOf(str.charAt(i)).equals("a") ||
                    String.valueOf(str.charAt(i)).equals("t")) {
                list.add(String.valueOf(str.charAt(i)));
            }
        }
        LinkedList<String> newList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals("c")) {
                // 遍历有多少个cat
                totalCount += count2(newList);
            } else {
                newList.addFirst(list.get(i));
            }
        }
        return totalCount;
    }

    private static int count2(LinkedList<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
             if (list.get(i).equals("a")) {
                 for (int j = i + 1; j < list.size(); j++) {
                      if (list.get(j).equals("t")) {
                          count +=1;
                      }
                 }
             }
        }
        return count;
    }
}
