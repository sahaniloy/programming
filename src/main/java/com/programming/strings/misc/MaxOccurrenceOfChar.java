package com.programming.strings.misc;

/**
 * Prints the character of a given string which has maximum occurrence
 */
public class MaxOccurrenceOfChar {

    private static void findMaxOccurrence(String s) {
        int[] chars = new int[26];
        for (char x : s.toCharArray()) {
            chars[x - 'a']++;
        }

        int maxCount = chars[0];
        int pos = 0;
        for (int i = 0; i < chars.length; i++) {
            if (maxCount < chars[i]) {
                maxCount = chars[i];
                pos = i;
            }
        }
        System.out.println("Max repeating character in " + s + " is : " + (char) (pos + 'a') + " count :" + maxCount);
    }

    public static void main(String[] args) {
        findMaxOccurrence("aaabbbdddddddddddddddddddddddddddddddbcczzzzzzzzzzz");
    }
}
