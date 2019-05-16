package com.programming.geeksforgeeks;

/**
 * Find whether an array is subset of another array
 */
public class CheckArrayIsSubset {

    private static boolean isSubset(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        int i = 0, j = 0;
        for (i = 0; i < len2; i++) {
            for (j = 0; j < len1; j++) {
                if (arr2[i] == arr1[j])
                    break;
            }

            if (j == len1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};

        System.out.println(isSubset(arr1, arr2));
    }
}
