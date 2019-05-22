package com.programming.crackingcodingiterview;

/**
 * If the input is aaaabbcccdddddd then it will be compressed to a4b2c3d6
 */
public class CompressString {

    private static String compress(String str) {
        int count = 0;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
                builder.append(str.charAt(i));
                builder.append(count);
                count = 0;
            }
        }

        return builder.toString().length() < str.length() ? builder.toString() : str;
    }

    public static void main(String[] args) {
        System.out.println(compress("aaaabbcccdddddd"));
    }
}
