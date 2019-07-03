package com.programming.arrays.geeks4geeks;

import java.util.HashMap;
import java.util.Map;

/**
 * Find most frequent element in array
 * @author Niloy
 */
public class MostFrequentElement {

    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3,2,3,2,3,5,6};
        System.out.println(mostFrequentElement(arr));
    }

    private static int mostFrequentElement(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int count;

        for (int anArr : arr) {
            if (countMap.containsKey(anArr)) {
                count = countMap.get(anArr);
                countMap.put(anArr, count + 1);
            } else {
                countMap.put(anArr, 1);
            }
        }

        int mostFrequentElement = 0;
        int frequency = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if(frequency < entry.getValue()) {
                frequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        return mostFrequentElement;
    }
}
