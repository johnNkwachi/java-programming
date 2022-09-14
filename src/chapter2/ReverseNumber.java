package chapter2;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {

       int  numbers = 21815;
       int reverseNumber = 0;

       while (numbers !=0) {
           int number = numbers % 10;
           reverseNumber = reverseNumber * 10 + number;

           numbers /= 10;
       }

        System.out.println("reversed number: " + reverseNumber);



    }
//    public static void reverseNumber(numbers){
//        int num = 0;
//        int halfOfNumbers = 0;
//        for(int i = 0; i > halfOfNumbers; i++){
//            int temp = halfOfNumbers;
//            numbers[i] = numbers[index -1]
        }



