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

        boolean divided3 = i % 3 == 0;
        boolean divided5 = i % 5 == 0;
        boolean divided7 = i % 7 == 0;
        boolean contains3 = String.valueOf(i).contains("3");
        boolean contains5 = String.valueOf(i).contains("5");
        boolean contains7 = String.valueOf(i).contains("7");
        if (contains7){
            contains5 = false;
            divided5 = false;
        }
        if (contains5){
            contains3 = false;
            divided3 = false;
        }
        if (contains3)
            return "Fizz";

        if (divided3){
            result += "Fizz";
        }
        if (divided5){
            result += "Buzz";
        }
        if (divided7)
            result += "Whizz";
        return result;
    }
}
