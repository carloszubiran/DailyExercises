import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

// https://logging.apache.org/log4j/2.x/manual/configuration.html

/**
 * Created by carloszubiran on 6/26/16.
 */
public class FizzBuzzTest {

    //Get Logger to work with the console and log to a file.
    private static final Logger logger = LoggerFactory.getLogger(FizzBuzzTest.class);

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void oneReturnsOne() {
        assertEquals("1", fizzBuzz.evaluate(1));
    }

    @Test
    public void twoReturnsTwo() {
        assertEquals("2", fizzBuzz.evaluate(2));
    }

    @Test
    public void threeReturnsFizz() {
        assertEquals("Fizz", fizzBuzz.evaluate(3));
    }

    @Test
    public void fourReturnsFour() {
        assertEquals("4", fizzBuzz.evaluate(4));
    }

    @Test
    public void fiveReturnsBuzz() {
        assertEquals("Buzz", fizzBuzz.evaluate(5));
    }

    @Test
    public void sixReturnsFizz() {
        assertEquals("Fizz", fizzBuzz.evaluate(6));
    }

    @Test
    public void fifteenReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
    }

    @Test
    public void runOneToOneHundred() {

        for(int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                logger.info(i + " == " + fizzBuzz.evaluate(i));
                assertEquals("FizzBuzz", fizzBuzz.evaluate(i));
            } else if (i % 3 == 0) {
                logger.info(i + " == " + fizzBuzz.evaluate(i));
                assertEquals("Fizz", fizzBuzz.evaluate(i));
            } else if (i % 5 == 0) {
                logger.info(i + " == " + fizzBuzz.evaluate(i));
                assertEquals("Buzz", fizzBuzz.evaluate(i));
            } else if (Integer.toString(i).equals(fizzBuzz.evaluate(i))) {
                logger.info(i + " == " + fizzBuzz.evaluate(i));
            }
        }
    }








}
