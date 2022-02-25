package com.platzi.java_tests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void repeatStringOnce() {
        assertEquals(
                "Hello",
                StringUtil.repeat("Hello", 1)
        );
    }

    @Test
    public void repeatStringMultipleTimes() {
        // exception
        assertEquals(
                "HelloHello",
                StringUtil.repeat("Hello", 2)
        );
    }

    @Test
    public void repeatStringZeroTimes() {
        assertEquals("", StringUtil.repeat("Hello", 0));
    }

    // exception expected when times are negative
    @Test(expected = IllegalArgumentException.class)
    public void repeatStringNegativeTimes() {
        StringUtil.repeat("Hello", -1);
    }

    // isEmpty() tests
    @Test
    public void NotEmptyWhenItContainsAnyString() {
        assertFalse(StringUtil.isEmpty("not empty"));
    }

    @Test
    public void isEmptyWhenEmpty() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void isEmptyWhenIsNull() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void isEmptyWhenThereAreOnlySpaces() {
        assertTrue(StringUtil.isEmpty(" "));
    }
}