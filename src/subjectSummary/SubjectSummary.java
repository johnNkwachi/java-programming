package subjectSummary;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Scanner;

public class SubjectSummary {
    public static void main(String[] args) {

    }

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> student = new ArrayList<>();
    static ArrayList <Double> score = new ArrayList<>();
    static ArrayList<String> sub = new ArrayList<>();



    static double average;
    static int position;
    static int index = 0;
    static int total = 0;



    public static void student() {
        System.out.printf("%s%n", "Student: ");
        String student = scanner.nextLine();
        student();
    }

    public static void sub(){
        System.out.printf("%s%n" ,"Sbu: ");
       String Sub = scanner.nextLine();

    }
    static void total(){
        return;

    }
    static void generateInvoice(){
        System.out.printf("============================================================================================= %n");

        System.out.printf("%40s%15s%s%s%s%s%s%n" , "subject" , "sub1", "sub2", "sub3", "ToT", "ave", "pos");
        System.out.printf("============================================================================================= %n");
        System.out.printf("%40s%d%d%d%d%f%d15.2f%n" , "Student 1" , score, score, score, total, average, position);
        System.out.printf("=========================================================================================== %n");
        System.out.printf("=========================================================================================== %n");
       Subject SUMMARY;




    }




}
