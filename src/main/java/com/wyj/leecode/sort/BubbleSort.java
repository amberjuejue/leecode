package com.wyj.leecode.sort;

/**
 * @author wangyujue
 */
public class BubbleSort {

    public static void main(String[] args) {
        // 从后面比较的版本
//        int[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8};
//
//        for (int i = 1; i < array.length; i++) {
//            int index = i;
//            for (int j = i - 1; j >= 0; j--) {
//                if (array[index] < array[j]) {
//                    int temp = array[j];
//                    array[j] = array[index];
//                    array[index] = temp;
//                    index = j;
//                }
//            }
//        }
//        for (int i : array) {
//            System.out.print(i + " ");
//        }

        // 从前面比较的版本
        int[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8};

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }




    }
}
