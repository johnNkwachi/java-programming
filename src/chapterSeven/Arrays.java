package chapterSeven;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months = {"January", "February", "December"};
        System.out.print("Enter a month number (1 to 12): ");
        int monthNumber = scanner.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);
    }
}
