package com.programming.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

/**
 * @author RS Software
 */
public class GroupIntegers {
    private static void groupInts(int[] arr) {
        int length = arr.length;
        Map<Integer, Integer> hash = new HashMap<>();

        //Iterate the array and count the occurrences of each element
        for (int i = 0; i < length; i++) {
            Integer count = hash.get(arr[i]);
            if (count == null)
                hash.put(arr[i], 1);
            else
                hash.put(arr[i], count + 1);
        }

        //print the array in group as per first occurrence.
        for (int i = 0; i < length; i++) {
            Integer count = hash.get(arr[i]);
            if (count != null) {
                for (int j = 0; j < count; j++)
                    System.out.print(arr[i] + " ");
                hash.remove(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        groupInts(new int[]{4, 6, 9, 2, 3, 4, 9, 6, 10, 4});
    }
}
