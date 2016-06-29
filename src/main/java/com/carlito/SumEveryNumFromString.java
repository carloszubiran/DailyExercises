package com.carlito;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carlos Zubiran on 6/29/2016.
 */
public class SumEveryNumFromString {


    public static void main(String[] args) {

        String testString = "fdas2342fdas2";
        SumEveryNumFromString sumEveryNumFromString = new SumEveryNumFromString();

        System.out.println( sumEveryNumFromString.parseIntsFromString(testString));
    }

    public String parseIntsFromString(String input) {

                List<Integer> listOfIntegers = new ArrayList<>();
        char charArray[] = input.toCharArray();
        int calculation = 0;
        for (int i = 0; i < input.toCharArray().length; i++) {
            if (charArray[i] >= '0' && charArray[i] <= '9') {
                listOfIntegers.add(Integer.parseInt("" + charArray[i]));
            }
        }
        for (Integer integer: listOfIntegers) {
            calculation += integer;
        }
        return "" + calculation;
    }


}

