package com.programming.hackerrank;

import java.util.Arrays;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */
public class LeftRotationArray {

    /**
     * Rotate the array for desired count
     *
     * @param arr           given array
     * @param rotationCount rotation count
     * @param lengthOfArray length of the given array
     */
    private static void rotateLeft(int arr[], int rotationCount, int lengthOfArray) {
        for (int i = 0; i < rotationCount; i++)
            rotateLeftByOne(arr, lengthOfArray);
    }

    private static void rotateLeftByOne(int arr[], int lengthOfArray) {
        //Store the first element of the array in a temp variable
        int temp = arr[0], i;
        for (i = 0; i < lengthOfArray - 1; i++)
            arr[i] = arr[i + 1];

        //assign the value of temp variable in last element of the array
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        rotateLeft(arr, 4, 5);
        System.out.println(Arrays.toString(arr));
    }
}
