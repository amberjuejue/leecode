package com.wyj.leecode.sort;

import sun.security.util.Length;

/**
 * @author wangyujue
 */
public class DirectSelectSort {

    public static void main(String[] args) {
        int[] array = {13,56,1,46,78,12,43,6,79,12,24,7};
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i; j < length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
