package chapter2;
import java.util.Scanner;

public class Chapter2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      //  System.out.println("Enter first number: ");
       // int number1 = input.nextInt();

      //  System.out.println("Enter second number: ");
      //  int number2 = input.nextInt();

     //   if (number1 == number2) ;
      //  System.out.printf("%d%n", number1, number2);

    //    if (number1 <= number2) ;
    //    System.out.printf("\"%d%n\", number1, number2");

        //question 2.17
      //  System.out.print("Enter first number: ");
      //  int num1 = input.nextInt();

      //  System.out.print("Enter second number: ");
       // int num2 = input.nextInt();

      //  int sum = num1 + num2;
       // System.out.printf("sum of numbers %d%n", num1, num2);

        // Exercise 2.33

        System.out.print("WeighInKilogram: ");
        double num1 = input.nextDouble();

        System.out.print("HeightInMeters: ");
        double num2 = input.nextDouble();

       double BMI = num1 * 703/ num2;

        System.out.printf("Your BMI %d%n");


    }

}
