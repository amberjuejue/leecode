package com.wyj.leecode.sort;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.util.Random;

/**
 * @author wangyujue
 */
public class BinaryInsertSort {

    public static void main(String[] args) {

        int[] array = new int[]{22,11,4,6,36,89,12,35,67,16};
//        for (int i = 0; i < 10; i++) {
//            Random random = new Random();
//            array[i] = random.nextInt(10);;
//        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i++) {
            sort(array, i);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



    }



    public static void sort(int[] array, int index) {
        int data = array[index];

        int left = 0;
        int right = index - 1;


        while (left <= right) {
            int mid = (right + left) / 2;
            if (array[mid] >= data) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        for (int i = index -1; i >= left; i--) {
            array[i + 1] = array[i];
        }
        if (left != index) {
            array[left] = data;
        }


    }
}
