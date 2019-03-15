package com.wyj.leecode.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 基数排序
 *
 * @author wangyujue
 */
public class RadixSort {

    public static void main(String[] args) {

        int[] array = { 49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1 };

        sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] array) {

        // 确定最大值
        // 确定最大值是几位数，之后就需要循环多少次来排序
        // 新建10个队列
        // 分别确定对应位数上的数字是几，就查到对应的队列里面
        // 从队列取出数据加入到原数组中

        int max = 0;
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        int length = String.valueOf(max).length();

        List<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new ArrayList<Integer>());
        }
        
        
        for (int i = 0; i < length; i++) {
            // 分配
            for (int j = 0; j < array.length; j++) {
                int index = (int) (array[j] % (Math.pow(10, i + 1)) / Math.pow(10, i));
                ArrayList<Integer> indexList = list.get(index);
                indexList.add(array[j]);
                list.set(index, indexList);
            }
            // 合并
            int count = 0;
            for (int j = 0; j < 10; j++) {
                while (list.get(j).size() > 0) {
                    Integer data = list.get(j).get(0);
                    array[count] = data;
                    list.get(j).remove(0);
                    count++;
                }
            }
        }
    }
}
