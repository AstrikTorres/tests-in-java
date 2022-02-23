package com.platzi.java_tests.util;

import org.junit.Test;

import static com.platzi.java_tests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weakWhenHasLessThan8Characters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weakWhenHasOnlyLetters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefghi"));
    }

    @Test
    public void MediumWhenHasLettersAndNumbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcde1234"));
    }

    @Test
    public void StrongWhenHasLettersNumbersAndSymbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abc1234!+"));
    }

}