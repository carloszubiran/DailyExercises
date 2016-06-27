package com.carlito;

/**
 * Created by Carlos Zubiran on 6/8/2016.
 */
public class Fibonacci {

    public void printFib(int limit) {

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

        // a   b   c
        // 0 + 1 = 1
        // 1 + 1 = 2
        // 1 + 2 = 3
        // 2 + 3 = 5
        // 3 + 5 = 8
        // 5 + 8 = 13

        for (int a = 0, b = 1, c = 0; c < limit ;) {

            System.out.println(a);

            c = a + b;
            b = a;
            a = c;

        }




    }

}
