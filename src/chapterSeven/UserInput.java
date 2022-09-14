package chapterSeven;

import java.util.Scanner;
import java.util.Arrays;
public class UserInput {
    public static void main(String[] args) {
        int scores = 0;

        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter 10 numbers ");
            int score = scanner.nextInt();
            numbers[i] = score;
        }

      //  System.out.print("The min number is: " + Math.min(65,78));
       // Arrays.sor






    }
}




//Write a test program that prompts the user to enter ten numbers, invokes this
//method to return the minimum value, and displays the minimum value. Here is a
//sample run of the program: