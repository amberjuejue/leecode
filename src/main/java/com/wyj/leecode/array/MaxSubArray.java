package com.wyj.leecode.array;

/**
 * @author wangyujue
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] array = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(array);
        System.out.println(i);
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < nums.length; i++) {// 子序列左端点
            for (int j = i; j < nums.length; j++) {// 子序列右端点
                sum = 0;
                for (int k = i; k <= j; k++) {//暴力计算
                    sum += nums[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
