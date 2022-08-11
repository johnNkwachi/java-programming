package array.sorting;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        SecureRandom secureRandom = new SecureRandom();

       // Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int shuffleNumbers = secureRandom.nextInt(array.length);
            int temp = array[shuffleNumbers];
            array[shuffleNumbers] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    private int nextInt(int length) {
        return 0;
    }
}

