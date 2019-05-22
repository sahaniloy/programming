package com.testing;

import org.apache.commons.lang.StringUtils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Test class
 */
public class TestClass {

    public static void main(String[] args) {
//        System.out.println("CPU core count : " + Runtime.getRuntime().availableProcessors());
//        System.out.println(getTransactionUUID());
        unmodifiableCollectionDemo();
    }

    private static void unmodifiableCollectionDemo() {
        final List<String> modifiable = new ArrayList<>();
        modifiable.add("Java");
        modifiable.add("is");

        final List<String> unmodifiable = Collections.unmodifiableList(new ArrayList<>(modifiable));
        System.out.println("Before modification: " + unmodifiable);

        modifiable.add("the");
        modifiable.add("best");

        System.out.println("After modification: " + unmodifiable);
    }

    public static String getTransactionUUID() {
        String transId = null;
        try {
            SecureRandom uniqueRandom = SecureRandom.getInstance("SHA1PRNG");
            String ranNumber = String.valueOf(Math.abs(uniqueRandom.nextLong())); //NOSONAR
            transId = StringUtils.rightPad(ranNumber, 19, '0');
        } catch (NoSuchAlgorithmException e) {
            //need not to do anything
        }
        return transId;
    }
}
