package com.programming.others.leetcode;

/**
 * @author RS Software
 */
public class IntegerPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12021));
    }

    private static boolean isPalindrome(int x) {
        int originalNumber = x;
        if(x < 0 || (x !=0 && x %10 == 0))
            return false;
        else {
            int revertedInteger = 0;
            while(x > 0) {
                int pop = x % 10;
                x = x / 10;
                revertedInteger = revertedInteger * 10 + pop;
            }

            return originalNumber == revertedInteger;
        }
    }
}
