package chapterSeven;

public class ArrayBackDisplay {
    public static void main(String[] args) {
        int[] myList = {40, 30, 10, 20, 50, 60, 70, 80, 90,22};
        int total =0;

        System.out.printf("%s%8s%n", "Index",  "ArrayValues");


        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
            System.out.printf("The total element is:  %d%n" , total);
            //System.out.printf("%5d%8d%n", i, myList[i]);


    }

}

