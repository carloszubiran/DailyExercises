package com.carlito;

import java.util.Dictionary;
import java.util.HashMap;

/**
 * Created by Carlos Zubiran on 6/13/2016.
 *
 * 1. input as string
 * 2. get String length
 * 3. start from char on the "righter most"
 * 4.
 * 5.
 * 6.
 * 7.
 * 8.
 *
 *
 *
 *
 */
public class RomanNumerals {

    // Input a cardinal number
    // convert to Roman numeral
    // exceptions ex: 4, 9 ,49

    HashMap<String, Integer> hashMap = new HashMap<>();
    StringBuilder numberToRoman = new StringBuilder();

    public HashMap<String, Integer> getHashMap() {

        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("M", 1000);

        return hashMap;
    }

    String convertNumToRoman(Integer numToConvert) {

        getHashMap();

        while(numToConvert > 0) {

            if (numToConvert - hashMap.get("M") > 0) {
                numToConvert -= hashMap.get("M");
                numberToRoman.append("M");
            } else if (numToConvert - hashMap.get("C") > 0) {
                numToConvert -= hashMap.get("C");
                numberToRoman.append("C");
            } else if (numToConvert - hashMap.get("L") > 0) {
                numToConvert -= hashMap.get("L");
                numberToRoman.append("L");
            } else if (numToConvert - hashMap.get("X") > 0) {
                numToConvert -= hashMap.get("X");
                numberToRoman.append("X");
            } else if (numToConvert - hashMap.get("V") > 0) {
                numToConvert -= hashMap.get("V");
                numberToRoman.append("V");
            } else if (numToConvert - hashMap.get("I") >= 0) {
                numToConvert -= hashMap.get("I");
                numberToRoman.append("I");
            }

        }

        return numberToRoman.toString();

    }



}
