package com.carlito;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 1. Assess weather or not is prime (first 10000 primes numbers)
 *
 * 2. If the number is prime add to collection
 *
 * 3. Sum the numbers which are prime.
 *
 * Prime Number is a number divisible ONLY by itself and 1
 *
 *
 *
 * Created by Carlos Zubiran on 6/8/2016.
 */
public class Primes {

    //region PROPERTIES

    List<Integer> primeList = new ArrayList<>();

    //endregion PROPERTIES

    //region CONSTRUCTORS


    //endregion CONSTRUCTORS

    //region GETTERS / SETTERS


    //endregion GETTERS / SETTERS

    //region CUSTOM METHODS

    public void printPrimeList(int number) {
        // this loop is to iterate trough the num that was
        // given by the user
        for (int i = 1; i <= number; i++) {
            // if a number is has more that two factors it is not prime
            // so keep track how many factors they are per number
            int factors = 0;
        // this loop is the check the number of the previous loop
        // to see if there is a factor
            for (int j = 1; (j <= i) && (factors <= 1); j++) {
                // if the number is factorial, add it the the count of factors
                if ((i % j == 0))
                {
                    factors += 1;
                }
                // if the number has ONLY 2 factors and it it equals itself
                // or if the number is one add it to the list
                if ((factors == 2) && (i == j) || (i == 1))
                {
                    primeList.add(i);
                }

            }
        }

        int total = 0;
        for (Integer integer: primeList) {
            total += integer;
            System.out.println(integer);
        }
        System.out.println("This is the total of all the primes: " + total);
        
    }


    //endregion CUSTOM METHODS


}
