package chapterTwoOfNewJava;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
       double annualInterestRate = 3.5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter balance and interest: ");
        double balance = scanner.nextDouble();
        double interest = scanner.nextDouble();

        interest = balance * (annualInterestRate/1200);

        System.out.print("The interest is: " + interest );
    }
}
