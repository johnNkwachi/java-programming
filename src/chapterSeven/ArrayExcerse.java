package chapterSeven;

import java.util.Scanner;

public class ArrayExcerse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of students: ");
        int n = scanner.nextInt();

        double [] numbers = new double[n];

       double sum = 0;
        System.out.print("Enter students scores: ");
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

      double average =  sum / n;
        int count = 0;
        for (int i = 0; i < n; i++)
            if(numbers[i] > average);
        count++;



        System.out.println("Average is: " + average) ;
        System.out.println("above average: " + count);

    }
}
