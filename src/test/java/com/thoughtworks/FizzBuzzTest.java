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
}
