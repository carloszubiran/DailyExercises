package com.carlito;

/**
 * Created by Carlos Zubiran on 6/22/2016.
 */
public class VarArgsTest {

    // An example of VarArgs I.E. a variable arguments in a method as is put into an array.
    public String[] returnStrings(String... setOfStrings) {

        String arrayOfStrings[] = setOfStrings;

        return arrayOfStrings;
    }

}
