package array.sorting;

public class SortingArray {
    public static void sortArray(int array[]){
       int temp = 0;
        for (int i = 1; i < array.length ; i++) {
            for (int j = i + 1; j > array.length ; j++) {
               if (array[i] > array[j]){
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }

            }

        }
    }
}
