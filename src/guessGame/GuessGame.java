package guessGame;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = input.nextInt();

            if(number == 50){
                System.out.println("You are correct");
            }
            if(number > 50){
                System.out.println("You are wrong");
            }

            if(number < 50){
                System.out.println("Number too small");
            }


    }
}
