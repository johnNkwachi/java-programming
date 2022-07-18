package chapterTwoOfNewJava;

import java.util.Scanner;

public class Chapter2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your radius number: ");
        double radius = scanner.nextDouble();

        double area = radius * radius / 3.14159;
        System.out.print("area of the radius circle is " + "radius "  +  " is "  + area);
    }
}
