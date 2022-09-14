package com.mayers;
import java.util.Scanner;

public class MayerBridge {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String response;

            int acount = 0;
            int bcount = 0;
            int acount1 = 0;
            int bcount1 = 0;
            int acount2 = 0;
            int bcount2 = 0;
            int acount3 = 0;
            int bcount3 = 0;

            String[][] responses = new String[5][8];
            System.out.println("Please select A or B to answer the following personality test questions:");
            System.out.println();
            System.out.printf("%s%n", "Question 1: \n A. Expend energy, enjoy groups \t B. Conserve energy, enjoy one-one-one");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[0][0] = "A";
                    break;
                case "B", "b":
                    responses[0][1] = "B";
                    break;
            }
            System.out.println();
            System.out.printf("%s%n", "Question 2: \n A. Interpret literally \t B. Look for meaning and possiblities");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[0][2] = "A";
                    break;
                case "B", "b":
                    responses[0][3] = "B";
                    break;
            }
            System.out.println();
            System.out.printf("%s%n", "Question 3: \n A. Logical, thinking, questioning \t B. Empathetic, feeling, accommodating");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[0][4] = "A";
                    break;
                case "B", "b":
                    responses[0][5] = "B";
                    break;

            }
            System.out.println();
            System.out.printf("%s%n", "Question 4: \n A. Organized, orderly \t B. Flexible, adaptable");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[0][6] = "A";
                    break;
                case "B", "b":
                    responses[0][7] = "B";
                    break;
            }
            System.out.println();
            System.out.printf("%s%n", "Question 5: \n A. More outgoing, think out loud \t B. More reserved, think to yourself");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[1][0] = "A";
                    break;
                case "B", "b":
                    responses[1][1] = "B";
                    break;
            }
            System.out.println();
            System.out.printf("%s%n", "Question 6: \n A. Practical, realistic, experimental \t B. Imaginative, Innovative, theoretical");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[1][2] = "A";
                    break;
                case "B", "b":
                    responses[1][3] = "B";
                    break;
            }
            System.out.println();
            System.out.printf("%s%n", "Question 7: \n A. Candid, straight forward, frank \t B. Tactful, kind, encouraging");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[1][4] = "A";
                    break;
                case "B", "b":
                    responses[1][5] = "B";
                    break;
            }
            System.out.println();
            System.out.printf("%s%n", "Question 8: \n A. Plan, schedule \t B. Unplanned, spontaneous");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[1][6] = "A";
                    break;
                case "B", "b":
                    responses[1][7] = "B";
                    break;
            }
            System.out.println();
            System.out.printf("%s%n", "Question 9: \n A. Seek many tasks, public activities, interaction with others \t B. Seek private, solitary activities with quiet to concentrate");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[2][0] = "A";
                    break;
                case "B", "b":
                    responses[2][1] = "B";
                    break;
            }
            System.out.println();
            System.out.printf("%s%n", "Question 10: \n A. Standard, usual, conventional \t B. different, novel, unique");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[2][2] = "A";
                    break;
                case "B", "b":
                    responses[2][3] = "B";
                    break;
            }
            System.out.println();
            System.out.printf("%s%n", "Question 11: \n A. firm, tend to criticize, hold the line \t B. gentle, tend to appreciate, conciliate");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[2][4] = "A";
                    break;
                case "B", "b":
                    responses[2][5] = "B";
                    break;
            }
            System.out.println();
            System.out.printf("%s%n", "Question 12: \n A. Regulated, structured \t B. Easygoing, \"live\" and \"let live\"");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[2][6] = "A";
                    break;
                case "B", "b":
                    responses[2][7] = "B";
                    break;

            }
            System.out.println();
            System.out.printf("%s%n", "Question 13: \n A. External, communicative, express yourself \t B. Internal, reticent, keep to yourself");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[3][0] = "A";
                    break;
                case "B", "b":
                    responses[3][1] = "B";
                    break;

            }
            System.out.println();
            System.out.printf("%s%n", "Question 14: \n A. Focus on here-and-now \t B. Look to the future, global perspective, \"big picture\"");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[3][2] = "A";
                    break;
                case "B", "b":
                    responses[3][3] = "B";
                    break;

            }
            System.out.println();
            System.out.printf("%s%n", "Question 15: \n A. Tough-minded, just \t B. Tender-hearted, merciful");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[3][4] = "A";
                    break;
                case "B", "b":
                    responses[3][5] = "B";
                    break;

            }
            System.out.println();
            System.out.printf("%s%n", "Question 16: \n A. Preparation, plan ahead \t B. Tender-hearted, merciful");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[3][6] = "A";
                    break;
                case "B", "b":
                    responses[3][7] = "B";
                    break;

            }
            System.out.println();
            System.out.printf("%s%n", "Question 17: \n A. Active, initiate \t B. Reflective, deliberate");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[4][0] = "A";
                    break;
                case "B", "b":
                    responses[4][1] = "B";
                    break;

            }
            System.out.println();
            System.out.printf("%s%n", "Question 18: \n A. Facts, things, \"what is\" \t B. Ideas, dreams, \"what could be,\" philosophical");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[4][2] = "A";
                    break;
                case "B", "b":
                    responses[4][3] = "B";

                    break;

            }
            System.out.println();
            System.out.printf("%s%n", "Question 19: \n A. Matter of fact, issue-oriented \t B. Sensitive, people-oriented, compassionate");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[4][4] = "A";
                    break;
                case "B", "b":
                    responses[4][5] = "B";
                    break;

            }
            System.out.println();
            System.out.printf("%s%n", "Question 20: \n A. Control, govern \t B. Latitude, freedom");
            response = input.nextLine();
            switch (response) {
                case "A", "a":
                    responses[4][6] = "A";
                    break;
                case "B", "b":
                    responses[4][7] = "B";
                    break;
            }
            if(acount > bcount){
                String a1 = "You are  an Extrovert";
                System.out.printf("%s",a1);
            } else{
                System.out.println("You are an Introvert");

                if(acount1 > bcount1) {
                    String b1 = "You are an S";
                    System.out.printf("%s",b1);
                }else{
                    System.out.println("You are an N");

                    if(acount2 > bcount2){
                        String a2 = "You are a Thinker";
                        System.out.printf("%s",a2);
                    }else{
                        System.out.println("You are a Feeler");

                        if(acount3 > bcount3) {
                            String b3 = "You are a J";
                            System.out.printf("%s", b3);
                        }else{
                            System.out.println("You are a P");
                        }
                    }
                }
            }



        }
    }

