package com.programming.strings.misc;

/**
 * Prints duplicate characters of a given string
 * @author Niloy
 */
public class CheckDuplicateCharInString {

    public static void main(String[] args) {
        checkDuplicate("java");
    }

    private static void checkDuplicate(String word) {
        int[] charCounts = new int[26];
        for (int i = 0; i < word.length(); i++) {
            charCounts[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1)
                System.out.println((char) ('a' + i));
        }
    }
}
