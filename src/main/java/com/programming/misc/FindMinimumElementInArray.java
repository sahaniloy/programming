package com.programming.misc;

/**
 * Find min element in array
 */
public class FindMinimumElementInArray {

    private static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(minElement(new int[]{6, 3, 2, 6, 5, 1}));
    }
}
