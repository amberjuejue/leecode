package com.wyj.leecode.sort;

import java.util.Arrays;

/**
 * @author wangyujue
 */
public class DirectInsertSort {

    /**
     * 从小到大排序
     * @param array
     */
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int data = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (data > array[j]) {
                    break;
                } else {
                    array[j + 1] = array[j];
                }
            }
            array[j + 1] = data;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{11,23,8,44,1,6,89};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        sort(array);
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
