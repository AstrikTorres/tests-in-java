package com.platzi.java_tests.romanNumeralsChallenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsShould {

     /*
        Requirements:
        Convert a number to its roman equivalent
        arabicToRoman(1) ⇒ "I"
        arabicToRoman(2) ⇒ "II"
        arabicToRoman(3) ⇒ "III"
        arabicToRoman(5) ⇒ "V"
        arabicToRoman(6) ⇒ "VI"
        arabicToRoman(7) ⇒ "VII"
        arabicToRoman(10) ⇒ "X"
        arabicToRoman(11) ⇒ "XI"
        arabicToRoman(15) ⇒ "XV"
        arabicToRoman(16) ⇒ "XVI"
        arabicToRoman(50) ⇒ "L"
        arabicToRoman(51) ⇒ "LI"
        arabicToRoman(55) ⇒ "LV"
        arabicToRoman(56) ⇒ "LVI"
        arabicToRoman(60) ⇒ "LX"
        arabicToRoman(70) ⇒ "LXX"
        arabicToRoman(80) ⇒ "LXXX"
        arabicToRoman(81) ⇒ "LXXXI"
        arabicToRoman(85) ⇒ "LXXXV"
        arabicToRoman(86) ⇒ "LXXXVI"
        arabicToRoman(126) ⇒ "CXXVI"
        arabicToRoman(2507) ⇒ "MMDVII"
     */

    @Test
    public void returnIWhenTheNumberIs1() {
        assertEquals("I", RomanNumerals.arabicToRoman(1));
    }
    @Test
    public void returnIIWhenTheNumberIs2() {
        assertEquals("II", RomanNumerals.arabicToRoman(2));
    }
    @Test
    public void returnIIIWhenTheNumberIs3() {
        assertEquals("III", RomanNumerals.arabicToRoman(3));
    }

    @Test
    public void returnVWhenTheNumberIs5() {
        assertEquals("V", RomanNumerals.arabicToRoman(5));
    }
    @Test
    public void returnVIWhenTheNumberIs6() {
        assertEquals("VI", RomanNumerals.arabicToRoman(6));
    }
    @Test
    public void returnVIIWhenTheNumberIs7() {
        assertEquals("VII", RomanNumerals.arabicToRoman(7));
    }

    @Test
    public void returnXWhenTheNumberIs10() {
        assertEquals("X", RomanNumerals.arabicToRoman(10));
    }
    @Test
    public void returnXIWhenTheNumberIs11() {
        assertEquals("XI", RomanNumerals.arabicToRoman(11));
    }
    @Test
    public void returnXVWhenTheNumberIs15() {
        assertEquals("XV", RomanNumerals.arabicToRoman(15));
    }
    @Test
    public void returnXVIWhenTheNumberIs16() {
        assertEquals("XVI", RomanNumerals.arabicToRoman(16));
    }
    @Test
    public void returnXXWhenTheNumberIs20() {
        assertEquals("XX", RomanNumerals.arabicToRoman(20));
    }
    @Test
    public void returnXXXWhenTheNumberIs30() {
        assertEquals("XXX", RomanNumerals.arabicToRoman(30));
    }

    @Test
    public void returnLWhenTheNumberIs50() {
        assertEquals("L", RomanNumerals.arabicToRoman(50));
    }
    @Test
    public void returnLIWhenTheNumberIs51() {
        assertEquals("LI", RomanNumerals.arabicToRoman(51));
    }
    @Test
    public void returnLVWhenTheNumberIs55() {
        assertEquals("LV", RomanNumerals.arabicToRoman(55));
    }
    @Test
    public void returnLVIWhenTheNumberIs56() {
        assertEquals("LVI", RomanNumerals.arabicToRoman(56));
    }

    @Test
    public void returnLXWhenTheNumberIs60() {
        assertEquals("LX", RomanNumerals.arabicToRoman(60));
    }
    @Test
    public void returnLXXWhenTheNumberIs70() {
        assertEquals("LXX", RomanNumerals.arabicToRoman(70));
    }
    @Test
    public void returnLXXXWhenTheNumberIs80() {
        assertEquals("LXXX", RomanNumerals.arabicToRoman(80));
    }
    @Test
    public void returnLXXXIWhenTheNumberIs81() {
        assertEquals("LXXXI", RomanNumerals.arabicToRoman(81));
    }
    @Test
    public void returnLXXXVWhenTheNumberIs85() {
        assertEquals("LXXXV", RomanNumerals.arabicToRoman(85));
    }
    @Test
    public void returnLXXXVIWhenTheNumberIs86() {
        assertEquals("LXXXVI", RomanNumerals.arabicToRoman(86));
    }

    @Test
    public void returnCWhenTheNumberIs100() {
        assertEquals("C", RomanNumerals.arabicToRoman(100));
    }
    @Test
    public void returnCCXXVIWhenTheNumberIs226() {
        assertEquals("CCXXVI", RomanNumerals.arabicToRoman(226));
    }
    @Test
    public void returnMMDVIIWhenTheNumberIs2507() {
        assertEquals("MMDVII", RomanNumerals.arabicToRoman(2507));
    }

    @Test
    public void returnIVWhenTheNumberIs4() {
        assertEquals("IV", RomanNumerals.arabicToRoman(4));
    }
    @Test
    public void returnIXWhenTheNumberIs9() {
        assertEquals("IX", RomanNumerals.arabicToRoman(9));
    }
    @Test
    public void returnXLWhenTheNumberIs40() {
        assertEquals("XL", RomanNumerals.arabicToRoman(40));
    }
    @Test
    public void returnXCWhenTheNumberIs90() {
        assertEquals("XC", RomanNumerals.arabicToRoman(90));
    }
    @Test
    public void returnCDWhenTheNumberIs400() {
        assertEquals("CD", RomanNumerals.arabicToRoman(400));
    }
    @Test
    public void returnCMWhenTheNumberIs900() {
        assertEquals("CM", RomanNumerals.arabicToRoman(900));
    }

}