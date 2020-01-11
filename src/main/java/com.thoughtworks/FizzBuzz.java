package com.thoughtworks;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for( int i = 0; i < 120; i++) {
            String result = fizzBuzz.fizzBuzz(i+1);
            System.out.println(result);
        }
    }

    public String fizzBuzz(int i) {
        if (!String.valueOf(i).contains("5")) {
            if (String.valueOf(i).contains("3"))
                return "Fizz";

            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    if (i % 7 == 0)
                        return "FizzBuzzWhizz";
                    return "FizzBuzz";
                }
                if (i % 7 == 0)
                    return "FizzWhizz";
                return "Fizz";
            }
        }
        if (i % 5 == 0){
            if (i % 7 == 0)
                return "BuzzWhizz";
            return "Buzz";
        }
        if (i % 7 == 0)
            return "Whizz";
        return String.valueOf(i);
    }
}
