package com.wyj.leecode.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author wangyujue
 */
public class DelArrayRepeatElement {

    public static void main(String[] args) {
        int[] array = new int[]{1,1,2};
        int i = removeDuplicates(array);
        System.out.println(i);
        for (int i1 : array) {
            System.out.print(i1 + ",");
        }
    }


    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int head = 0;
        int tail = 1;
        int size = nums.length;
        int returnSize = 1;
        while (tail < size) {
            if (nums[head] < nums[tail]) {
                nums[head + 1] = nums[tail];
                head++;
                tail++;
                returnSize++;
            } else {
                tail ++ ;
            }
        }
        return returnSize;
    }
}
