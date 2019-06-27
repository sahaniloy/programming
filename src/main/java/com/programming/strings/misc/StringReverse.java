package com.programming.strings.misc;

/**
 * Reverse a String using recursion
 * @author Niloy
 */
public class StringReverse {

    private static String reverse(String s) {
        StringBuilder builder = new StringBuilder();
        if (s == null || s.length() <= 1)
            return s;
        else {
            builder.append(s.charAt(s.length() - 1));
            builder.append(reverse(s.substring(0, s.length() - 1)));
            return builder.toString();
        }

    }

    public static void main(String[] args) {
        System.out.println(reverse("niloy"));
    }
}
