package com.programming.arrays.geeks4geeks;

/**
 * Find an element in array such that sum of left array is equal to sum of right array
 * <p>
 * Input : 1 4 2 5
 * Output : 2
 * Explanation : If 2 is the partition,
 * Subarrays are : {1, 4} and {5}
 */
public class LeftSumRightSumInArray {

    // Function to compute partition
    private static int findElement(int[] arr, int size) {
        int leftSum = 0, rightSum = 0;

        // Computing right_sum
        for (int i = 1; i < size; i++)
            rightSum += arr[i];

        // Checking the point of partition
        // i.e. left_Sum == right_sum
        for (int i = 0, j = 1; j < size; i++, j++) {
            rightSum -= arr[j];
            leftSum += arr[i];

            if (leftSum == rightSum)
                return arr[i + 1];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5};
        System.out.println(findElement(arr, arr.length));
    }
}
