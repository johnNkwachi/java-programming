package ChapterThree;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            temp = number2;
        }
        System.out.print("What is " +  number1  + " + " + number2 + " ? ");
        int answer = scanner.nextInt();

        if(number1 + number2 == answer)
        System.out.print("You are correct");
        else{
            System.out.print("You are wrong");
        }
    }
}