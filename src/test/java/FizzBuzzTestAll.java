

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Bipin on 4/20/2016.
 */
@RunWith(Parameterized.class)
@Suite.SuiteClasses({FizzBuzzTest.class})
public class FizzBuzzTestAll {

    private int value;
    private String expected;

    public FizzBuzzTestAll(int value, String expected) {
        this.value = value;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {2, "2"},
                {3, "Fizz"},
                {4, "4"},
                {5, "Buzz"},
                {6, "Fizz"},
                {7, "7"},
                {8,"8"},
                {9,"Fizz"},
                {10,"Buzz"},
                {11,"11"},
                {12,"Fizz"},
                {13,"13"},
                {14,"14"},
                {15, "FizzBuzz"},
                {100, "Buzz"}
        });
    }

    @Test
    public void fizzBuzzTestAll() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals(expected, fb.evaluate(value));
    }

}