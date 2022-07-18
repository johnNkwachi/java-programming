package chapterTwoOfNewJava;

import java.security.spec.PSSParameterSpec;
import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly saving amount:$ ");
        double monthlyAmount = scanner.nextDouble();

        double interestRate = 0.00417 + 6;
        double profit = monthlyAmount * interestRate + 1;
        System.out.println(" current amount is: " +  profit );
    }
}
