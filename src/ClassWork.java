import java.util.Scanner;
//
public class ClassWork {

//        int largest = 0;
//        int lowest = 1_000_000_000;
//
//
//
//
//        for (int i = 0; i <=5; i++) {
//            System.out.printf("Enter input %d%n", i);
//            int numbers = scanner.nextInt();
//            if(numbers > largest){
//                largest = numbers;
//            } else if (numbers < lowest) {
//                lowest = numbers;
//            }
//
//            System.out.printf("The largest num is %d%nThe lowest number is %d%n", largest, lowest);
//        }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number 1: ");
    int user_input = scanner.nextInt();
    int largest_number = user_input;
    int lowest_number = user_input;


      int count = 1;

      while (count < 5){
          System.out.printf("Enter number %d: ", count +1);
          user_input = scanner.nextInt();


      }

    }
}
