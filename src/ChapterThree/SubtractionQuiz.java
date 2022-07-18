package ChapterThree;
import java.util.Scanner;
import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            temp = number2;
        }
            // 3. Prompt the student to answer ”What is number1 – number2?”
            System.out.print
                    ("What is " + number1 + " - " + number2 + "? ");
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
// 4. Grade the answer and display the result
            if (number1 - number2 == answer)
                System.out.println("You are correct!");
            else {
                System.out.println("Your answer is wrong.");
                System.out.println(number1 + " - " + number2 +
                        " should be " + (number1 - number2));

        }
    }
}