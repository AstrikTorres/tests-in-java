package com.platzi.java_tests.FizzBuzzChallenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    /*
        Requirements:
        If the number is divisible by 3 return "Fizz"
        If the number is divisible by 5 return "Buzz"
        If the number is divisible by 3 and 5 return "FizzBuzz"
        In other case return the same number
     */

    @Test
    public void returnFizzWhenTheNumberIsDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void returnBuzzWhenTheNumberIsDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void returnBuzzWhenTheNumberIsDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void returnSameNumberWhenIsNotDivisibleBy3Or5() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("11", FizzBuzz.fizzBuzz(11));
        assertEquals("98", FizzBuzz.fizzBuzz(98));
    }
}