package com.programming.strings.crackingcodingiterview;

/**
 * Check if two Strings are permutation to each other
 * @author Niloy
 */
public class CheckPermutation {

    private final static int ASCII_CHAR_SET_LENGTH = 128;

    /**
     * Check whether two words content exact same number of character
     *
     * @param s1
     * @param s2
     * @return
     */
    private static boolean isPalindrome(String s1, String s2) {
        int[] counts = new int[ASCII_CHAR_SET_LENGTH];

        //count the each character
        for (int i = 0; i < s1.length(); i++) {
            char x = s1.charAt(i);
            counts[x]++;
        }

        //decrement the character count by 1 while iterating the 2nd word
        for (int i = 0; i < s2.length(); i++) {
            char x = s2.charAt(i);
            counts[x]--;

            if (counts[x] < 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("dog", "gods"));
    }
}
