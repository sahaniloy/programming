package com.programming.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of positive integers. All numbers occur even number of times except
 * one number which occurs odd number of times. Find the number in O(n) time & constant space
 * <p>
 * https://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
 */
public class OddOccurrence {

    //Following is the brute force algo, complexity is O(n*n)
    private static int findOddOccurrence(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }

        return -1;
    }

    private static int findOddOccurrenceEfficient(int[] arr) {
        Map<Integer, Integer> hash = new HashMap<>();
        int count;

        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])) {
                count = hash.get(arr[i]);
                count++;
                hash.put(arr[i], count);
            } else {
                count = 1;
                hash.put(arr[i], count);
            }
        }

        for (Integer i : hash.keySet()) {
            if (hash.get(i) % 2 != 0)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(findOddOccurrence(new int[] {1, 2, 3, 2, 3, 1, 3}));
        System.out.println(findOddOccurrenceEfficient(new int[]{1, 2, 3, 2, 3, 1, 3}));
    }
}
