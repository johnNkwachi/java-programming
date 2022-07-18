package chapterTwoOfNewJava;

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the driving distance: /n Enter miles per gallon: /n Enter price per gallon ");
        double distance = scanner.nextDouble();
        double miles = scanner.nextDouble();
        double price = scanner.nextDouble();

        double costOfDriving = distance + miles + price;
        System.out.print("The cost of driving is: $ " + costOfDriving);

    }
}

// Enter the driving distance: 900.5
//Enter miles per gallon: 25.5
//Enter price per gallon: 3.55
//The cost of driving is $125.36