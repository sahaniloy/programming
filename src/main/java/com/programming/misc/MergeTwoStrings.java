package com.programming.misc;

/**
 * If the input s1 = "niloy" and input s2 = "saha". Then output will be "nsialhoay"
 */
public class MergeTwoStrings {

    private static String mergeTwoStrings(String s1, String s2) {
        StringBuilder builder = new StringBuilder();

        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            builder.append(s1.charAt(i++));
            builder.append(s2.charAt(j++));
        }

        if (i != s1.length())
            builder.append(s1.substring(i));

        if (j != s2.length())
            builder.append(s2.substring(j));

        return builder.toString();
    }

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "forgeeks";
        System.out.println(mergeTwoStrings(s1, s2));
    }
}
