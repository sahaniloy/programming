package com.programming.strings.geeks4geeks;

import java.util.ArrayList;
import java.util.List;

/**
 * Print list items containing all characters of a given word
 * https://www.geeksforgeeks.org/print-list-items-containing-all-characters-of-a-given-word/
 * @author Niloy
 */
public class PrintItemContainingAllChars {

    public static final int LOWER_CASE_ALPHABET_COUNT = 26;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sunday");
        list.add("took");
        list.add("unseason");
        for (int i = 0; i < list.size(); i++) {
            check(list.get(i), "sun");
        }
    }

    static void check(String str, String word) {
        int matchedCharCount = 0;
        int[] charCount = new int[LOWER_CASE_ALPHABET_COUNT];

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word.length(); i++) {
            if (charCount[word.charAt(i) - 'a'] >= 1)
                matchedCharCount++;
        }

        if (matchedCharCount == word.length())
            System.out.println(str);
    }
}
