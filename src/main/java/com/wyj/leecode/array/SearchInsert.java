package com.wyj.leecode.array;

/**
 * @author wangyujue
 */
public class SearchInsert {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,6};
        int i = searchInsert(array, 7);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        int returnIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                returnIndex = i;
                return i;
            }
        }
        return nums.length;
    }
}
