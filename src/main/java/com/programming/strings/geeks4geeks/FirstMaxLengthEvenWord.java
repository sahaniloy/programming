package com.programming.strings.geeks4geeks;

/**
 * Find first max even length word of a given string.
 * e.g. if the string is "This is test string" then first max even length string is "string"
 *
 * @author Niloy
 */
public class FirstMaxLengthEvenWord {

    public static void main(String[] args) {
        String s1 = "You are given an array of n numbers";
        String s2 = "This is test string";
        System.out.println(findMaxLengthEvenWord(s1));
    }

    private static String findMaxLengthEvenWord(String sentence) {
        int i = 0;
        int len = sentence.length();
        int currLen = 0; //current length of the word
        int maxLen = 0;  //max length of the word
        int startIndex = -1;

        while (i < len) {
            if (sentence.charAt(i) == ' ') { //If we encounter space then we know this is end of one word
                if (currLen % 2 == 0) {
                    if (maxLen < currLen) {
                        maxLen = currLen;
                        startIndex = i - currLen;
                    }
                }
                currLen = 0; //re-initialize for the next word
            } else {
                currLen++;
            }
            i++;
        }

        //Check length of last word
        if (currLen % 2 == 0) {
            if (maxLen < currLen) {
                maxLen = currLen;
                startIndex = i - currLen;
            }
        }

        if (startIndex == -1) //No even length word found
            return "-1";

        return sentence.substring(startIndex, startIndex + maxLen);
    }
}
