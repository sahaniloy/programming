package com.programming.strings.hackerrank;

/**
 * @author RS Software
 */
public class CountingValley {
    private static int getCountingValley(String steps) {
        int valleyCount = 0;
        int currentLevel = 0;

        for (char c : steps.toCharArray()) {
            if (c == 'U') ++currentLevel;
            if (c == 'D') --currentLevel;

            if (currentLevel == 0 && c == 'U')
                ++valleyCount;
        }

        return valleyCount;
    }

    public static void main(String[] args) {
        System.out.println(getCountingValley("DDUUUUDD"));
    }
}
