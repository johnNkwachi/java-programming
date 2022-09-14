package grade;

 import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int counter = 1;
        while (counter <= 6) {
            System.out.println("Enter test score");
            int gradeRecorder = input.nextInt();

            switch (gradeRecorder) {
                case 90:
                    System.out.print("A");
                    break;
                case 60:
                    System.out.println("B");
                    break;
                case 50:
                    System.out.println("C");
                    break;
                case 40:
                    System.out.println("D");
                    break;
                case 30:
                    System.out.println("E");
                    break;
                case 20:
                    System.out.println("F");
                    break;
            }
            counter++;
        }
    }
}