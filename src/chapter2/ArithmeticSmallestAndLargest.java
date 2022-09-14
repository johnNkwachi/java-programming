package chapter2;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNUmber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        int sum = firstNumber + secondNUmber + thirdNumber;
        System.out.println("Sum of three numbers: " + sum);

        int average = sum / 100;
        System.out.println("Average of numbers: " + average);



    }
}



//(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
//        user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//        shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//        representation of the average. So, if the sum of the values is 7, the average should be 2, not
//        2.3333….]