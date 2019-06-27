package com.programming.strings.crackingcodingiterview;

/**
 * Check whether all characters of a given string is unique or not
 * @author Niloy
 */
public class AllCharacterUnique {

    /**
     * Following method uses additional storage to solve the problem
     *
     * @param s
     * @return
     */
    private static boolean isAllCharUnique(String s) {
        boolean[] chars = new boolean[26]; //assuming all characters are between a - z
        for (char c : s.toCharArray()) {
            if (chars[c - 'a'])
                return false;
            else
                chars[c - 'a'] = true;
        }
        return true;
    }

    /**
     * This method doesn't use additional space to check all characters are unique or not
     *
     * @param str
     * @return
     */
    private static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAllCharUnique("niloyy"));
        System.out.println(isUniqueChars("niloy"));
    }
}
