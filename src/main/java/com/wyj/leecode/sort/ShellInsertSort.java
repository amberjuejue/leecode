package com.wyj.leecode.sort;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @author wangyujue
 */
public class ShellInsertSort {

    public static void main(String[] args) {

    }

    public static void sort(int[] array) {
        int length = array.length;


        while (true) {
            int offset = length / 2;
            for (int i = 0; i < offset; i++) {
                for (int j = i + offset; j < length; j = j + offset) {
                    int data = array[j];
                    for (int k = j - offset; k >= 0; k = k - offset) {
                        if (array[k] > data) {
                            array[k + 1] = array[k];
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }
}
