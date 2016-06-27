package com.carlito;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Carlos Zubiran on 6/20/2016.
 */
public class RollerCoaster {

    // ASCII values 65 - 90 Capitals, 97 - 122 LowerCase

    public List<String> changeCaseToRollerCoaster(String stringToBeConverted) {
        int validCharCounter = 0;

        List<String> convertedStringList = new ArrayList();
        StringBuilder tempStringBuilder = new StringBuilder();
        //check to see if there is a is a valid character.
        for (String string: stringToBeConverted.split("\n")) {
            for (Character c: string.toCharArray()) {
                // if the validCharCounter is evenly divisible make it and Capital Letter and if the
                // character is is lower case, capitalize it then increment the counter
                if (validCharCounter % 2 == 0 && (97 <= c.charValue() && c.charValue() <= 122) ) {
                    tempStringBuilder.append(Character.toChars(c.charValue() - 32));
                    validCharCounter++;
                }
                // If the opposite is false do the opposite.
                else if (validCharCounter % 2 != 0 && (65 <= c.charValue() && c.charValue() <= 90)) {
                    tempStringBuilder.append(Character.toChars(c.charValue() + 32) );
                    validCharCounter++;
                }
                // If the character is a non letter A-Z or a-z just add it to the string builder
                else if (!(97 <= c.charValue() && c.charValue() < 122) && !(65 <= c.charValue() && c.charValue() < 90)) {
                    tempStringBuilder.append(Character.toChars(c.charValue()));
                }
                // Just add the char to the string builder
                else {
                    tempStringBuilder.append(c.charValue());
                    validCharCounter++;
                }
            }

            convertedStringList.add(tempStringBuilder.toString());
            tempStringBuilder = new StringBuilder();
            validCharCounter = 0;
        }

        return convertedStringList;
    }
}
