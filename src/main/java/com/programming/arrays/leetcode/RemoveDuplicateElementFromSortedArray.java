package com.programming.arrays.leetcode;

/**
 * @author RS Software
 */
public class RemoveDuplicateElementFromSortedArray {

    // Function to remove duplicate elements This function returns new size of modified array.
    private static int removeDuplicateElement(int nums[]) {
        int length = nums.length;
        int j = 0;
        for (int i = 0; i < length - 1; i++) {
            // If current element is not equal to next element then store that current element
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        // Store the last element as whether it is unique or repeated, it hasn't stored previously
        nums[j++] = nums[length - 1];

        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5};
        int n = removeDuplicateElement(nums);

        for (int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");
    }
}
