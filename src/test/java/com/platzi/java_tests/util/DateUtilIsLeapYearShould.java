package com.platzi.java_tests.util;

import org.junit.Test;

import static com.platzi.java_tests.util.DateUtil.isLeapYear;
import static org.junit.Assert.*;

public class DateUtilIsLeapYearShould {

    /*
        Requirements
        All years divisible by 400 Are leap years (1600, 2000, 2400...).
        All years divisible by 100 but not by 400 are NOT leap years (1700, 1800, 1900...).
        All years divisible by 4 but not by 100 ARE leap years (1996, 2004, 2008...).
        All years not divisible by 4 are NOT leap years (2017, 2018, 2019...).
     */

    @Test
    public void returnTrueWhenYearIsDivisibleBy400() {
        assertTrue( isLeapYear(1600) );
        assertTrue( isLeapYear(2000) );
        assertTrue( isLeapYear(2400) );
    }

    @Test
    public void returnFalseWhenYearIsNotDivisibleBy400() {
        assertFalse( isLeapYear(1700) );
        assertFalse( isLeapYear(1800) );
        assertFalse( isLeapYear(1900) );
    }

    @Test
    public void returnTrueWhenYearIsDivisibleBy4ButNotBy100() {
        assertTrue( isLeapYear(1996) );
        assertTrue( isLeapYear(2004) );
        assertTrue( isLeapYear(2008) );
    }

    @Test
    public void returnFalseWhenYearIsNotDivisibleBy4() {
        assertFalse( isLeapYear(2017) );
        assertFalse( isLeapYear(2018) );
        assertFalse( isLeapYear(2019) );
    }

}