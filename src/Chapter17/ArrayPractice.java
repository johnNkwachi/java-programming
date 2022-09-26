package Chapter17;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.printf("Min of values: %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max of values: %d%n", IntStream.of(values).max().getAsInt());
        System.out.println("Summary of values:" + IntStream.of(values).summaryStatistics());
        System.out.println("Sorted values:" + IntStream.of(values).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")));

    }
}
