package com.carlito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static Primes primes = new Primes();
    public static Fibonacci fib = new Fibonacci();

    public static void main(String[] args) {

//        primes.printPrimeList(1000);
//        fib.printFib(1000);

//        RomanNumerals romanNumerals = new RomanNumerals();
//
//        System.out.println(romanNumerals.convertNumToRoman(2439));

//        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator();
//
//        int randomArray[];
//
//        randomArray = randomArrayGenerator.returnRandomizedArray(10, 100);
//        randomArrayGenerator.printArray(randomArray);

//        RollerCoaster rollerCoaster = new RollerCoaster();
//
//        List<String> wordList = new ArrayList<>();
//
//        String testString1 = "To be, or not to be: that is the question.\n" +
//                "Whether 'tis nobler in the mind to suffer.\n" +
//                "The slings and arrows of outrageous fortune.\n" +
//                "Or to take arms against a sea of troubles.\n" +
//                "And by opposing end them, to die: to sleep.";
//
//        String testString2 = "H@ppy Birthday!";
//
//        for (String string : rollerCoaster.changeCaseToRollerCoaster(testString1)) {
//            System.out.println(string + " ");
//        }

    }

    // An example of VarArgs I.E. a variable arguments in a method as is put into an array.
    public String[] returnStrings(String... setOfStrings) {

        String arrayOfStrings[] = setOfStrings;

        return arrayOfStrings;
    }


}
