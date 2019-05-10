package com.programming.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Group words with same set of characters. Given a list of words with lower
 * cases. Implement a function to find all Words that have the same unique
 * character set
 */
public class GroupWords {

    private static final int MAX_CHARS = 26;

    private static String getKey(String word) {
        String key = "";
        boolean visited[] = new boolean[MAX_CHARS];
        Arrays.fill(visited, false);

        //Find unique chars
        for (int i = 0; i < word.length(); i++) {
            visited[word.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < MAX_CHARS; i++) {
            if (visited[i]) {
                key = key + (char) ('a' + i);
            }
        }
        return key;
    }

    private static void groupWordsWithUniqueChars(String[] words) {
        int length = words.length;
        Map<String, ArrayList<Integer>> hash = new HashMap<>();

        for (int i = 0; i < length; i++) {
            String key = getKey(words[i]);

            if (hash.containsKey(key)) {
                ArrayList list = hash.get(key);
                list.add(i);
                hash.put(key, list);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                hash.put(key, list);
            }
        }

        for (Map.Entry<String, ArrayList<Integer>> entry : hash.entrySet()) {
            ArrayList<Integer> list = entry.getValue();
            for (Integer i : list) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        String words[] = {"may", "student", "students", "dog", "studentssess", "god", "cat", "act", "tab", "bat",
                "flow", "wolf", "lambs", "amy", "yam", "balms", "looped", "poodle"};

        groupWordsWithUniqueChars(words);
    }
}
