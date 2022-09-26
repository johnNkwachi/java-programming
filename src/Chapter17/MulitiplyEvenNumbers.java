package Chapter17;

import java.util.stream.IntStream;

public class MulitiplyEvenNumbers {
    public static void main(String[] args) {

        int total = 0;
        for (int number = 0; number <= 10; number++) {
            if (number % 2 == 0) {
                total += number * 3;

            }
        }
        System.out.println("Sum of the triples of the even ints from 2 through 10 is: " + total);

        // using lambdas expression in solving the same problem

        System.out.printf(
                "Sum of the triples of the even ints from 2 through 10 is: %d%n", IntStream.rangeClosed(1, 10)
                        .filter(x -> x % 2 == 0)
                        .map(x -> x * 3)
                        .sum());


    }


}

