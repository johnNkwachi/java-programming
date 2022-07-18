package chapterTwoOfNewJava;

import java.util.Scanner;

public class chapterTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        double average  = (number1 + number2 + number3) / 3;
        System.out.print("your average is " + number1 + " " +number2 + "  "  + number3 + " is "  + average);
    }
}
