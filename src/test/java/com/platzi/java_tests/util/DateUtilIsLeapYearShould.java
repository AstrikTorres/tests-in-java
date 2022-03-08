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

}