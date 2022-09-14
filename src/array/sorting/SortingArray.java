package array.sorting;

public class SortingArray {
    public static void sortArray(int array[]){
       int temp = 0;
        for (int i = 1; i < array.length ; i++) {
            for (int j = i + 1; j < array.length ; j++) {
               if (array[i] > array[j]){
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }

            }
            System.out.println("array numbers is: " + array[i]);

        }
    }

    public static void main(String[] args) {
        int[] array = {33, 88, 100, 23, 11, 9};
        SortingArray.sortArray(array);
    }
}
