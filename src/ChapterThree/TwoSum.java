package ChapterThree;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] array = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array,target)));

    }


    public static int[] twoSum(int [] array, int target){

        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {

                if (array[i] + array[j] == target){
                    return new int [] {i, j};
                }
            }
        }
        return new int[]{};
    }
    }

