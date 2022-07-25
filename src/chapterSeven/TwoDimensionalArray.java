package chapterSeven;

import java.util.stream.IntStream;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.printf("Sum of 1 through 10 is: %d%n",
        IntStream.range(1,100)
                .sum());
    }
}