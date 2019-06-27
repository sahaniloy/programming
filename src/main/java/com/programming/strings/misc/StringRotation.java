package com.programming.strings.misc;

/**
 * Given 2 strings, check one is rotation of other
 * @author Niloy
 */
public class StringRotation {

    public static void main(String[] args) {
        checkRotation("IndiaVsPak", "PakVsIndia");
    }

    private static void checkRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            System.out.println(s1 + " and " + s2 + " are NOT rotation of each other");
        else {
            String concatenated = s1 + s1;
            if (concatenated.indexOf(s2) != -1)
                System.out.println(s1 + " and " + s2 + " are rotation of each other");
            else
                System.out.println(s1 + " and " + s2 + " are NOT rotation of each other");
        }
    }
}
