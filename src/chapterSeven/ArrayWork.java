package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWork {
    public static void main(String[] args) {

//        int sum = 0;
       Scanner scanner = new Scanner(System.in);
//
//        System.out.println("enter numbers in int: ");
//        int n = scanner.nextInt();
//        int [] numbers = new int[n];
//
//        System.out.println("Enter the numbers: ");
//
//        for (int i = 0; i < n; i++) {
//             numbers[i] = scanner.nextInt();
//            sum += numbers[i];
//
//        }
//
//        int average = sum/ n;
//        int count = 0;
//        for (int i = 0; i <n; i++)
//            if(numbers [i] > average)
//                count++;
//
//        System.out.println("Average is: " + average);
//        System.out.println(" numbers of element is: " + count);

        int [][] array = new int[10][10];
        System.out.println("Enter number: " + array.length + " array rows and " + array[0].length + " columns");
        for (int  row= 0; row < array.length; row++) {
            for (int coloumn = 0; coloumn < array[row].length; coloumn++) {
                array[row][coloumn] = scanner.nextInt();

            }

        }

    }
}
