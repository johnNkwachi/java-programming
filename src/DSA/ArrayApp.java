package DSA;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[]intArray = new int[5];
        intArray[0] = 49;
        intArray[1] = 99;
        intArray[2] = 66;
        intArray[3] = 40;
        intArray[4] = 41;
//        searchElement(intArray);
//        System.out.println(bubbleSort(intArray));
        bubble2(intArray);
//        System.out.println(bubble2(intArray));

    }
    public static int searchElement(int[]intArray){
        int searchKey = 49;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == searchKey){ System.out.println("Found " + searchKey);
            break;
        }
        else{
                if (intArray[i] != searchKey)
                    System.out.println(searchKey + " not found");
            }

        }
        return searchKey;
    }

    public static int bubbleSort(int[]intArray){
        int firstElement = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            int otherElement = intArray[i];
            if (firstElement > otherElement){
                firstElement = otherElement;

            }

        }
        return firstElement;
    }
   public static void bubble2(int[]intArray) {
       int temp = 0;
       for (int i = 0; i < intArray.length; i++) {
           for (int j = i + 1; j < intArray.length; j++) {
               if (intArray[i] > intArray[j]){
                   temp = intArray[i];
                   intArray[i] = intArray[j];
                   intArray[j] = temp;
               }
           }
           System.out.println(Arrays.toString(intArray));
       }
   }

}
