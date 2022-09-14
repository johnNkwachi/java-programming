package chapter2;

import java.util.Scanner;

public class IntegerNUmber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();


        if(input > 100){
            System.out.println("input is greater than 100");
        }

        if(input == 100){
            System.out.println("input is equal to 100");
        }

        if(input != 100){
            System.out.println("input is not equal to 100");
        }

        if(input < 100){
            System.out.println("input is less than 100");
        }

    }
}




///(Comparing Integers) Write an application that asks the user to enter one integer, obtains
//        it from the user and displays whether the number and its square are greater than, equal to, not equal
//        to, or less than the number 100. Use the techniques