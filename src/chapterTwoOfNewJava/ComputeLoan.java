package chapterTwoOfNewJava;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the annual interest rate: "  );
        double annualInterestRate = scanner.nextDouble();

      double  monthlyInterestRate = annualInterestRate/1200;

      // enter number of years
        System.out.print("Enter number of years: ");
        int numberOfYears = scanner.nextInt();

        //  enter loan amount
        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        // calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1-1/ Math.pow(1+ monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        // display result;

        System.out.println("the monthly payment is $: " + monthlyPayment * 100 / 100.0);
        System.out.println("The total payment is $: " + totalPayment * 100 / 100.0);


    }

}
