package com.programming.arrays.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * @author RS Software
 */
public class CompareTriplet {

    public static void main(String[] args) {
        System.out.println(compareTriplets(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10)));
    }

    // Complete the compareTriplets function below.
    private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int[] result = {0, 0};

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i))
                result[0]++;
            else if (a.get(i) < b.get(i))
                result[1]++;
            else if (a.get(i) == b.get(i))
                continue;
        }
        return Arrays.asList(result[0], result[1]);
    }
}
