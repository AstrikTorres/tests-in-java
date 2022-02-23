package com.platzi.java_tests.util;

public class StringUtilTest {
    public static void main(String[] args) {

        myAssertEquals(
                StringUtil.repeat("Hello", 3),
                "HelloHelloHello"
        );

        // exception
        myAssertEquals(
                StringUtil.repeat("Hello", 2),
                "Hello2"
        );
    }

    private static void myAssertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            throw new RuntimeException(actual + " is not equal to expected:  " + expected);
        }
    }

}