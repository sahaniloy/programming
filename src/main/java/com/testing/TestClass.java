package com.testing;

import org.apache.commons.lang.StringUtils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Test class
 */
public class TestClass {

    public static void main(String[] args) {
        System.out.println("CPU core count : " + Runtime.getRuntime().availableProcessors());
        System.out.println(getTransactionUUID());
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
