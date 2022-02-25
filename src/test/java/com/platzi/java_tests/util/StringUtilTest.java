package com.platzi.java_tests.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    @Test
    public void testStringRepeat() {

        assertEquals(
                "HelloHelloHello",
                StringUtil.repeat("Hello", 3)
        );

        // exception
        assertEquals(
                "Hello2",
                StringUtil.repeat("Hello", 2)
        );
    }

}