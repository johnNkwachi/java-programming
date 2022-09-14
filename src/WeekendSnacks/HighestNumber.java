package WeekendSnacks;

public class HighestNumber {
    int[] numbers = {30, 20, 2, 17, 69, 22};


    public static int findLargestNumber(int[] numbers) {
        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber)
                maxNumber = numbers[i];
        }
        return maxNumber;
    }

    public static int search(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                return target;
            }

        }
        return 0;
    }


    public static String evenNumbers(int[] numbers) {
       String word = "";
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                word += numbers[i];
            }
        }
        return word;
    }
}