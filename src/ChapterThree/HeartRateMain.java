package ChapterThree;

import java.util.Scanner;

public class HeartRateMain {
    public static void main(String[] args) {
//        TargetHeartRateCalculator heartRateCalculator = new TargetHeartRateCalculator("name","name",
//                1999,4,17);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String fName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lName = scanner.nextLine();

        System.out.print("Enter Date of birth dd mm yyyy: ");
        int[] tmpdob = new int[3];

        for(int i=0; i<3; i++){
            tmpdob[i] = scanner.nextInt();
        }
         TargetHeartRateCalculator user1 = new TargetHeartRateCalculator(fName, lName, tmpdob[0], tmpdob[1], tmpdob[2]);

        printInfo(user1);
    }
    private static void printInfo(TargetHeartRateCalculator user){
        System.out.printf("%s %s\n%s - %d years of age\nMax HeartRate: %d\n",
                user.getFirstName(), user.getLastName(), user.getDOB(),
                user.getAge(), user.getMaxHeartRate());

        System.out.printf("Target Heart Rate Range: %s\n", user.getTargetHeartRate());
    }

}
