package com.wyj.leecode.array;

/**
 * @author wangyujue
 */
public class RemoveTargetElement {
    public static void main(String[] args) {
//        int[] arrays = new int[]{0,1,2,2,3,0,4,2};
        int[] arrays = new int[]{1};
        int i = removeElement(arrays, 1);
        System.out.println(i);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int size = nums.length;
        int temp = 0;
        int returnSize = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] != val) {
                nums[temp] = nums[i];
                temp++;
                returnSize++;
            } else {

            }

        }
        return returnSize;
    }
}
