
import java.util.Scanner;
public class Arrays {
   public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myNumbers = getNumbers(5);
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Element " + i + " typed value was " + myNumbers[i]);
        }
        System.out.println("The average is " + getAverage(myNumbers) );
    }

        public static int[] getNumbers(int number) {
            System.out.println("Enter " + number + " int values.\r");
            int[] values = new int[number];

            for (int i = 0; i < values.length; i++) {
                values[i] = input.nextInt();
            }
            return values;
        }

        public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i< array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
        }
            //   int[]numbers = new int[10];
            // for(int i=0; i< numbers.length; i++) {
            //      numbers[i] = i*10;
            //  }
            //     for(int i=0; i< numbers.length; i++) {
            //       System.out.println("Element  "+ i +" , Value is " + numbers[i]);
            //   }

            //  int[]arrayNumbers = {1,3,5,7,9,2,6};
            //for(int i=0; i < arrayNumbers.length; i++){
            //   System.out.println(arrayNumbers[i]);



    }
