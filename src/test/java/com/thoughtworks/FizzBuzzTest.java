package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void should_return_the_number_in_order() {
        String result = fizzBuzz.fizzBuzz(1);
        assertEquals(result, String.valueOf(1));
    }

    @Test
    void should_return_Fizz_if_the_number_is_multiple_of_3() {
        String result = fizzBuzz.fizzBuzz(3);
        assertEquals(result, "Fizz");
    }

    @Test
    void should_return_Buzz_if_the_number_if_multiple_of_5() {
        String result = fizzBuzz.fizzBuzz(5);
        assertEquals(result, "Buzz");
    }

    @Test
    void should_return_Whizz_if_the_number_is_multiple_of_7() {
        String result = fizzBuzz.fizzBuzz(7);
        assertEquals(result, "Whizz");
    }

    @Test
    void should_return_FizzBuzz_if_the_number_is_multiple_of_3_and_5_and_not_contains_5() {
        String result = fizzBuzz.fizzBuzz(60);
        assertEquals(result, "FizzBuzz");
    }

    @Test
    void should_return_FizzWhizz_if_the_number_is_multiple_of_3_and_7() {
        String result = fizzBuzz.fizzBuzz(21);
        assertEquals(result, "FizzWhizz");
    }

    @Test
    void should_return_Buzz_whizz_if_the_number_is_multiple_of_5_and_7_and_not_contains_3() {
        String result = fizzBuzz.fizzBuzz(140);
        assertEquals(result, "BuzzWhizz");
    }

    @Test
    void should_return_FizzBuzz_whizz_if_the_number_is_multiple_of_3_and_5_and_7_and_not_contains_5() {
        String result = fizzBuzz.fizzBuzz(210);
        assertEquals(result, "FizzBuzzWhizz");
    }

    @Test
    void should_return_Fizz_given_number_contains_3() {
        String result = fizzBuzz.fizzBuzz(13);
        assertEquals(result, "Fizz");
    }

    @Test
    void should_return_BuzzWhizz_given_number_contains_5() {
        int digit = 35;
        String actual = fizzBuzz.fizzBuzz(digit);
        assertEquals(actual, "BuzzWhizz");
    }

    @Test
    void should_return_Fizz_given_input_is_75_contains_7() {
        int digit = 75;
        String actual = fizzBuzz.fizzBuzz(75);
        assertEquals(actual, "Fizz");
    }
}
