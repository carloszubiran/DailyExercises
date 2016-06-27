package main.java;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by carloszubiran on 6/26/16.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void oneReturnsOne() {
        System.out.println(fizzBuzz.evaluate(1));
        assertEquals("1", fizzBuzz.evaluate(1));
    }

//    @Test









}
