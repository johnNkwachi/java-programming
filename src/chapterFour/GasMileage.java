package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int miles;
        int gallons;
        int totalMiles;
        int totalGallons;
        double milesPerGallon;

        totalGallons = 0;
        totalMiles = 0;

        System.out.print("Enter miles driven or press -1 to quite: ");
        miles = sc.nextInt();

        System.out.print("Enter gallon driven or press -1 to quite: ");
        gallons = sc.nextInt();

        while (miles != -1 & gallons != -1){

            totalMiles+= miles;
            totalGallons+= gallons;

            System.out.print("Enter miles driven or press -1 to quite: ");
            miles = sc.nextInt();

            System.out.print("Enter gallon driven or press -1 to quite: ");
            gallons = sc.nextInt();
        }
        if(miles != 0 & gallons != 0){

            milesPerGallon = totalMiles / totalGallons;
            System.out.print("Miles per gallon used is: " + milesPerGallon);
        }
        else{
            System.out.print("No miles or gallons entered: ");
        }
    }
}
