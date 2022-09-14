package chapter2;

import java.util.Scanner;

public class Bmi {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your weight:  ");
        double weight = scanner.nextDouble();
        System.out.println("(L)bs or (K)g: ");
        String input = scanner.next();

//        public static double cal
            if (input == "L") {
                double converted = weight * 0.45;
                System.out.println("You are " + converted);

            }
        

        }
    }
//    private static void unit() {
//      String input = scanner.nextLine();
//    }

