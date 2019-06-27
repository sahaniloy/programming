package com.testing;

/**
 * Implement singleton class with double null check and locking
 *
 * @author Niloy
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
        // some code to initialize
    }

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
