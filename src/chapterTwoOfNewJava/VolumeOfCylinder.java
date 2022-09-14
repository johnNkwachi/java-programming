package chapterTwoOfNewJava;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius and length: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = radius * radius * 1.609;
        double volume = area * length;
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    }
}
