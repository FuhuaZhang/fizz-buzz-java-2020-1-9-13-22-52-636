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
    void should_return_FizzBuzz_if_the_number_is_multiple_of_3_and_5() {
        String result = fizzBuzz.fizzBuzz(15);
        assertEquals(result, "FizzBuzz");
    }
}
