package com.programming.leetcode;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeTwoSortedArray {

    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int nums3[] = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j])
                nums3[k++] = nums1[i++];
            else
                nums3[k++] = nums2[j++];
        }

        while (i < m)
            nums3[k++] = nums1[i++];

        while (j < n)
            nums3[k++] = nums2[j++];

        return nums3;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 10, 11, 13};
        int n1 = arr1.length;

        int[] arr2 = {2, 4, 6, 8, 12};
        int n2 = arr2.length;

        int[] arr3 = merge(arr1, n1, arr2, n2);

        System.out.println("Array after merging");
        for (int i = 0; i < n1 + n2; i++)
            System.out.print(arr3[i] + " ");
    }
}
