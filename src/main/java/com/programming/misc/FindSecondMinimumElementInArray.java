package com.programming.misc;

/**
 * @author RS Software
 */
public class FindSecondMinimumElementInArray {

    private static int secondMinElement(int[] arr) {
        int min = arr[0];  //say, first element is min
        int min2 = arr[1]; //say, second element is second min

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min2 = min; //If i th element is less than min then second min should be min
                min = arr[i]; //min should be i th element
            } else {
                min2 = arr[i];
            }
        }

        return min2;
    }

    public static void main(String[] args) {
        System.out.println(secondMinElement(new int[]{6, 3, 2, 6, 5, 1, 0}));
    }
}
