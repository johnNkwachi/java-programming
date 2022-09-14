package chapterTwoOfNewJava;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter fahrenheit number: ");
        double fahrenheit = scanner.nextDouble();

        // converting fahrenheit ton celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " +" " +  celsius + " in celsius ");

    }
}
