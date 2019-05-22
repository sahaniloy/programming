package com.programming.crackingcodingiterview;

/**
 * Given a string, check whether the permutation of the characters are in palindrome
 */
public class PermutationIsPalindrome {

    private static boolean isPermutationPalindrome(String s) {
        int[] countTable = new int[26]; //Assuming the characters of string is between a - z
        int oddCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            int charNumber = x - 'a';
            countTable[charNumber]++; //Increment the character count and hold it in an array

            if (countTable[charNumber] % 2 == 1)
                oddCount++;
            else
                oddCount--;
        }

        return oddCount == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationPalindrome("tactoca"));  //true
        System.out.println(isPermutationPalindrome("abbccc"));  //false
    }
}
