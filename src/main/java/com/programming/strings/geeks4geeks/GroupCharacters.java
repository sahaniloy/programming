package com.programming.strings.geeks4geeks;

/**
 * Given a string of lowercase characters, the task is to print the string in a manner such that a character
 * comes first in string displays first with all its occurrences in string
 */
public class GroupCharacters {
    private static void groupChars(String s) {
        int count[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            while (count[s.charAt(i) - 'a'] != 0) {
                System.out.print(s.charAt(i));
                count[s.charAt(i) - 'a']--;
            }
        }

    }

    public static void main(String[] args) {
        groupChars("geeksforgeeks");
    }
}
