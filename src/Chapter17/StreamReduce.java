package Chapter17;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.printf("Sum of 1 through 10 is:  %d%n", IntStream.rangeClosed(1, 10).sum());
        // rangeClose will produce value from (1,9) without including 10 the last number
        // that is the major difference btw rangeClose and rangeClosed.
        //  doing it without lambdas expression
        // the processing step perform by Sum is known as reduction cos it reduces the values from 1 to 10 to a single number55

        int total = 0;
        for (int number = 1; number <= 10; number++) {
            total+=number;

        }
        System.out.println("sum of 1 to 10 is: "+ total);
    }
}
