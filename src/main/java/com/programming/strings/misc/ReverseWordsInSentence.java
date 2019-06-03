package com.programming.strings.misc;

/**
 * @author RS Software
 */
public class ReverseWordsInSentence {
    public static void main(String[] args) {
        System.out.println(reverseWordsOfSentence("java is good programming language"));
    }

    private static String reverseWordsOfSentence(String line) {
        if (line != null && !line.isEmpty()) {
            String words[] = line.trim().split("\\s");
            StringBuilder builder = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                builder.append(words[i]).append(" ");
            }

            return builder.toString().trim();
        }
        return null;
    }
}
