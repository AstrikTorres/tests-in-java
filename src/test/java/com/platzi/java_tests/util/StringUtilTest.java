package com.platzi.java_tests.util;

public class StringUtilTest {
    public static void main(String[] args) {

        String result = StringUtil.repeat("Hello", 3);
        if (!result.equals("HelloHelloHello")) {
            System.err.println("ERROR");
        }

        String result2 = StringUtil.repeat("Hello", 2);
        if (!result2.equals("HelloHello")) {
            System.err.println("ERROR");
        }
    }

}