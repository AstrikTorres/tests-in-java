package com.platzi.java_tests.romanNumeralsChallenge;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {

    public static String arabicToRoman(int n) {
        List<String> romanNumerals = new ArrayList<>();
        int remaining = n;

        if (remaining >= 1000 && remaining <= 4999) {
            for (int i = 1000; i <= remaining; remaining-=i) {
                romanNumerals.add("M");
            }
        }

        if (remaining >= 500 && remaining <= 999) {
            romanNumerals.add("D");
            remaining -= 500;
        }

        if (remaining >= 100 && remaining <= 499) {
            for (int i = 100; i <= remaining; remaining-=i) {
                romanNumerals.add("C");
            }
        }

        if (remaining >= 50 && remaining <= 99) {
            romanNumerals.add("L");
            remaining -= 50;
        }

        if (remaining >= 10 && remaining <= 49) {
            for (int i = 10; i <= remaining; remaining-=i) {
                romanNumerals.add("X");
            }
        }

        if (remaining >= 5 && remaining <= 9) {
            romanNumerals.add("V");
            remaining -= 5;
        }

        if(remaining >= 1 && remaining <= 4) {
            for (int i = 1; i <= remaining; remaining--) {
                romanNumerals.add("I");
            }
        }
        String result = String.join("", romanNumerals);
        result = result.replaceAll("IIII", "IV");
        result = result.replaceAll("VIV", "IX");
        result = result.replaceAll("XXXX", "XL");
        result = result.replaceAll("LXL", "XC");
        result = result.replaceAll("CCCC", "CD");
        result = result.replaceAll("DCD", "CM");

        return result;
    }
}
