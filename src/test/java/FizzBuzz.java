/**
 * Created by carloszubiran on 6/26/16.
 */
public class FizzBuzz {

    public FizzBuzz() {
    }

    public String evaluate(int num) {

        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(num);
    }

}
