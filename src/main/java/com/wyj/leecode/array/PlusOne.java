package com.wyj.leecode.array;

import java.util.Arrays;

/**
 * @author wangyujue
 */
public class PlusOne {

    public static void main(String[] args) {
//        int[] ints = plusOne(new int[]{1,2,3});
        int[] ints = plusOne(new int[]{9});
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ",");
        }
    }

    public static int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return new int[0];
        }
        return plus(digits, digits.length - 1);
    }

    private static int[] plus(int[] digits, int index) {
        if (digits[index] + 1 >= 10) {
            int[] newArray = new int[digits.length + 1];
            System.arraycopy(digits, 0, newArray, 0, digits.length);
            newArray[digits.length] = 0;
            return plus(newArray, index - 1);
        } else {
            digits[index] = digits[index] + 1;
            return digits;
        }
    }
}
