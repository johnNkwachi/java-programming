package chapter2;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number:  ");
        int input = scanner.nextInt();

        int divisible = input % 3;
        System.out.println("result of input: " + divisible);

    }
}
//(Divisible by 3) Write an application that reads an integer and determines and prints
//        whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
//        it’s divided by 3 with a remainder of 0.]