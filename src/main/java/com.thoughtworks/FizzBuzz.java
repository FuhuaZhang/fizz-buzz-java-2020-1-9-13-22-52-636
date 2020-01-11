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
        String result = handleSignalDigit(i);

        if(result.equals(""))
            return String.valueOf(i);
        else return result;
    }

    private String handleSignalDigit(int i) {
        String result = "";
        if ( String.valueOf(i).contains("3"))
            return  "Fizz";
        if (i % 3 == 0){
            result += "Fizz";
        }
        if (i % 5 == 0){
            result += "Buzz";
        }
        if (i % 7 == 0)
            result += "Whizz";
        return result;
    }
}
