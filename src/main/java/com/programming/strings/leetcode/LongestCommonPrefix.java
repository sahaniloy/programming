package com.programming.strings.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * https://leetcode.com/problems/longest-common-prefix/
 *
 * @author Niloy
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower", "flight", "flow"}));
    }

    private static String longestCommonPrefix(String[] words) {
        if (words.length == 0)
            return "";
        String prefix = words[0];
        for (int i = 1; i < words.length; i++) {
            while ((words[i].indexOf(prefix) != 0)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }
}
