package com.programming.strings.geeks4geeks;

/**
 * Given a string S containing lowercase English alphabets. The task is to find the minimum number
 * of characters needed to be removed so that the remaining string contains at most 2 unique characters.
 * https://www.geeksforgeeks.org/minimum-deletions-from-string-to-reduce-it-to-string-with-at-most-2-unique-characters/
 *
 * @author Niloy
 */
public class MinimumDeletion {

    private static int minDeletion(String s) {
        int count[] = new int[26];

        for(char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int minimum = Integer.MAX_VALUE;

        for(int i = 0 ; i < 26; i++)
        {
            for(int j = i + 1;j < 26; j++)
            {
                // Choosing two character
                int z = count[i] + count[j] ;

                // Finding the minimum deletion
                minimum = Math.min(minimum, s.length()-z) ;
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        System.out.println(minDeletion("geeksforgeeks"));
    }
}
