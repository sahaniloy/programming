package com.programming.strings.misc;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a set of words (in array) find the anagram words.
 */
public class FindAnagramWords {

    private static void findAnagrams(String[] words) {
        Map<String, String> map = new HashMap<>();

        for (String s : words) {
            String key = getKey(s);
            if (map.containsKey(key)) {
                String a1 = map.get(key);
                System.out.print(a1 + " " + s);
                System.out.println();
            } else {
                map.put(key, s);
            }
        }
    }

    //This method will find the unique key of each word in ascending order
    private static String getKey(String s) {
        String key = "";
        boolean[] chars = new boolean[26];
        for (char x : s.toCharArray()) {
            chars[x - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (chars[i]) {
                key = key + (char) ('a' + i);
            }
        }

        return key;
    }

    public static void main(String[] args) {
        String[] words = {"listen", "man", "silent", "abcd", "abc", "xyz", "dabc"};
        findAnagrams(words);
    }
}
