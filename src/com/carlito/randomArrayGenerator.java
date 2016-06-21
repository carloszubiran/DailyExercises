package com.carlito;

import java.util.Random;

/**
 * Created by Carlos Zubiran on 6/15/2016.
 */
public class RandomArrayGenerator {

    public int[] returnRandomizedArray(int arraySize, int maximumValue) {

        int randomArray[] = new int[arraySize];

        for (int i = 0; i < randomArray.length; i++) {
            Random randomGenerator = new Random();
            randomArray[i] = randomGenerator.nextInt(maximumValue);
        }
        return randomArray;
    }

    public void printArray(int arrayToBePrinted[]) {
        System.out.print("[");
        for (int i = 0; i < arrayToBePrinted.length ; i++) {
            if (i == arrayToBePrinted.length - 1)
            System.out.println(arrayToBePrinted[i] + "]");
            else
            System.out.print(arrayToBePrinted[i] + ", ");
        }

    }

}
