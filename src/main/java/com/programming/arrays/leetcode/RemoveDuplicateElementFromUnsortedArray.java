package com.programming.arrays.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author RS Software
 */
public class RemoveDuplicateElementFromUnsortedArray {

    private static void removeDuplicateElement(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (hash.contains(nums[i]))
                continue;
            else {
                System.out.print(nums[i] + " ");
                hash.add(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        removeDuplicateElement(new int[]{1, 2, 5, 1, 7, 2, 4, 2});
    }
}
