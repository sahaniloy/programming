package com.programming.strings.crackingcodingiterview;

/**
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 *
 * @author Niloy
 */
public class OneEditAway {

    public static void main(String[] args) {
        String firstString = "apple";
        String secondString = "aple";

        System.out.println(oneEditAway(firstString, secondString));
    }

    private static boolean oneEditAway(String first, String second) {
        if(first.length() == second.length())
            return oneEditReplace(first, second);
        if(first.length() + 1 == second.length())
            return oneEditInsert(first, second);
        if(first.length() - 1 == second.length())
            return oneEditInsert(second, first);
        return false;
    }

    private static boolean oneEditInsert(String first, String second) {
        int index1 = 0;
        int index2 = 0;

        while(index2 < second.length() && index1 < first.length()) {
            if(first.charAt(index1) != second.charAt(index2)) {
                if(index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private static boolean oneEditReplace(String first, String second) {
        boolean foundDifference = false;
        for(int i = 0; i < first.length(); i++) {
            if(first.charAt(i) != second.charAt(i)) {
                if(foundDifference)
                    return false;
                foundDifference = true;
            }
        }
        return true;
    }
}
