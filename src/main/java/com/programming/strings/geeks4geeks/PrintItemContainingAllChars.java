package com.programming.strings.geeks4geeks;

import java.util.ArrayList;
import java.util.List;

/**
 * Print list items containing all characters of a given word
 * https://www.geeksforgeeks.org/print-list-items-containing-all-characters-of-a-given-word/
 */
public class PrintItemContainingAllChars {

    public static final int LOWECASE_ALPHABET_COUNT = 26;

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("sunday");
        list.add("took");
        list.add("unseason");
        for (int i = 0; i < list.size(); i++) {
            check(list.get(i), "sun");
        }
    }

    static void check(String str, String ron) {
        int matchedCharCount = 0;
        int[] a = new int[LOWECASE_ALPHABET_COUNT];

        for (int i = 0; i < str.length(); i++) {
            a[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ron.length(); i++) {

            if (a[ron.charAt(i) - 'a'] >= 1)
                matchedCharCount++;
        }

        if (matchedCharCount == ron.length())
            System.out.println(str);
    }
}
