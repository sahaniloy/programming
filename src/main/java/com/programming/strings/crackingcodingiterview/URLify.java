package com.programming.strings.crackingcodingiterview;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string.
 *
 * @author Niloy
 */
public class URLify {

    public static void main(String[] args) {
        String name = "Mr John Smith      ";
        char[] strArr = name.toCharArray();
        replaceChars(strArr, 13);
        System.out.println(new String(strArr));
    }

    private static void replaceChars(char[] str, int trueLength) {
        int spaceCount = 0, index, i;

        for(i = 0; i < trueLength; i++) {
            if(str[i] == ' ')
                spaceCount++;
        }

        index = trueLength + spaceCount * 2;

        for(i = trueLength - 1; i >=0; i--) {
            if(str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}
