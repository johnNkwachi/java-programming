package chapterSeven;

import java.util.Scanner;

public class NoOFScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 , scores = 0;
        int [] grade = new int[100];

        while(scores != -1) {
            for (int i = 0; i < grade.length; i++) {
                System.out.print("Enter the score numbers: ");
                scores = sc.nextInt();
                if (scores == -1)
                    break;
                grade[i] = scores;
                sum += grade[i];
            }
        }
        double average =  (double) sum / 10;
        int countBelow = 0 , countAbove = 0;
        for (int i = 0; i < grade.length ; i++) {
            if (grade[i] > average) {
                countBelow++;
            }
            if (grade[i] > average) {
                countAbove++;
            }
        }
        System.out.printf("The total Average Number is: %f%n" , average);
        System.out.printf("The total below Average is: %d%n" , countBelow);
        System.out.printf("The total below Below is: %d%n" , countAbove);
    }
}


//(Analyze scores) Write a program that reads an unspecified number of scores and
//determines how many scores are above or equal to the average and how many
//scores are below the average. Enter a negative number to signify the end of the
//input. Assume that the maximum number of scores is 100.
