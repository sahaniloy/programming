package com.programming.strings.misc;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author RS Software
 */
public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedChar("hello"));
    }

    private static char findFirstNonRepeatedChar(String word) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>(word.length());

        for (char c : word.toCharArray()) {
            charCountMap.put(c, charCountMap.containsKey(c) ? charCountMap.get(c) + 1 : 1);
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : charCountMap.entrySet()) {
            if (characterIntegerEntry.getValue() == 1)
                return characterIntegerEntry.getKey();

        }
        throw new RuntimeException("didn't find any non repeated Character");
    }
}
