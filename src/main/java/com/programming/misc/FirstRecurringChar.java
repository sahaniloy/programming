package com.programming.misc;

import java.util.HashMap;

/**
 * Prints first duplicate character of a given string.
 */
public class FirstRecurringChar {

    private static char findFirstRecurringCharacter(String s) {
        char c = ' ';
        HashMap<Character, Integer> charCount = new HashMap<>();
        int count = 0;
        for (char x : s.toCharArray()) {
            if (charCount.containsKey(x))
                return x;
            charCount.put(x, count++);
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(findFirstRecurringCharacter("ABBCC"));
    }
}
