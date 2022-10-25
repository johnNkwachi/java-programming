package com.arrays;

public class largestArrayNumber {
    public static void main(String[] args) {

        double[] data = {12, 44, 6, 20, 15};

        double num = highestNumber(data);
        System.out.println(num);

        System.out.println(lowestNumber(data));


    }
    public static double highestNumber(double[]data) {
        double largestGrade = data[0];
        for (int i = 1; i < data.length; i++) {
            double nextValue = data[i];
            if (nextValue > largestGrade)
                largestGrade = nextValue;
        }
        return largestGrade;
    }

    public static double lowestNumber(double[]data){
        double smallNumber = data[0];
        for (int i = 1; i < data.length; i++) {
            double nextValue = data[i];
            if (nextValue < smallNumber)
                smallNumber = nextValue;
        }
        return smallNumber;
    }


}



