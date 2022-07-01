package practice;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {



        int count;

        for (count = 1; count <= 10; count++) { // loop 10 times
            if (count == 5) {
                break; // terminates loop if count is 5
            }
            System.out.printf("%d ", count);
        }
        System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
}
