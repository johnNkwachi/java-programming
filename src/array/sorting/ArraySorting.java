package array.sorting;

public class ArraySorting {
    public static void sort(int[] numbers) {
        int tmp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }

            }
            System.out.println("Array number is: " + numbers[i]);
        }

//        for (int k = 0; k < numbers.length; k++) {
//            System.out.println(numbers[k]);

        }


    public static void main(String[] args) {
        int[]numbers = {1,8,5,2,3};
       sort(numbers);
    }
}
