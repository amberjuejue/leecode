package com.wyj.leecode.sort;

/**
 * @author wangyujue
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = findMiddle(array, low, high);
            quickSort(array, 0, middle - 1);
            quickSort(array, middle + 1, high);
        }
    }

    public static int findMiddle(int[] array, int low, int high) {
        int data = array[low];
        while (low < high) {
            while (low < high && array[high] >= array[low]) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= array[high]) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = data;
        return low;
    }
}
