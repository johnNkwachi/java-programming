package com.assignment.diary;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text. *;
import java.time.*;

public class Diary {


    private DataStoring dataStoring;
    private Scanner scanner = new Scanner(System.in);
    private String text;
    private String dateTime;

    public Diary() {
        dataStoring = new DataStoring();
    }

    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/y HH:mm");
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/y");

     @Override
     public String toString() {
         return dateTime.format ("Diary.dateTimeFormatter") + " " +  text;
     }

    private LocalDateTime readDateTime() {
        System.out.println("Enter date and time as mm/dd/yyyy hh:mm");
        LocalDateTime dateTime;
        try {
            dateTime = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        } catch (DateTimeParseException e) {
            System.out.println("Error. please try again.");
            return readDateTime();
        }
        return dateTime;
    }

    private LocalDate readDate() {
        System.out.println("Enter date and time as mm/dd/yyyy hh:mm");
        LocalDate date;
        try {
            date = LocalDate.parse(scanner.nextLine(), dateFormatter);
        } catch (DateTimeParseException e) {
            System.out.println("Error. please try again.");
            return readDate();
        }
        return date;
    }

    public void printEntries(LocalDate day) {
        ArrayList<DataEntry> entries = dataStoring.findDataEntry(day.atStartOfDay(), false);
        for (DataEntry entry : entries) {
            System.out.println(entry);
        }
    }

    public void addEntry() {
        LocalDateTime dateTime = readDateTime();
        System.out.println("Enter the entry text");
        String text = scanner.nextLine();
        dataStoring.addEntry(dateTime, text);

    }

    public void searchEntries() {
        LocalDateTime dateTime = readDate().atStartOfDay();
        ArrayList<DataEntry> entries = dataStoring.findDataEntry(dateTime, false);
        if (entries.size() > 0) {
            System.out.println("Entries found: ");
            for (DataEntry entry : entries) {
                System.out.println(entry);
            }
        } else {
            System.out.println("No entries were found. ");
        }
        scanner.nextLine();
    }

    public void deleteEntries() {
        System.out.println("Entries with the same date and time will be deleted. ");
        LocalDateTime dateTime = readDateTime();
        dataStoring.deleteEntries(dateTime);
    }

    public void printHomeScreen() {
        System.out.println();
        System.out.println();
        System.out.println("Welcome to your personaal diary! ");
        System.out.println("Today is: " + LocalDateTime.now().format(dateTimeFormatter));
        System.out.println();
        System.out.println("Today:\n.........");
        printEntries(LocalDate.now());
        System.out.println();
        System.out.println("Tomorrow:\n..................");
        printEntries(LocalDate.now().plusDays(1));
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diary diary = new Diary();
        String choice = "0";

        while (!choice.equals("4")) {
            diary.printHomeScreen();
            System.out.println();
            System.out.println("Choose an action: ");
            System.out.println("1 - Add an entry");
            System.out.println("2 - Search an entries");
            System.out.println("3 - Delete an entry");
            System.out.println("4 - End");
            choice = scanner.nextLine();
            System.out.println();

            switch (choice) {
                case "1":
                    diary.addEntry();
                case "2":
                    diary.searchEntries();
                case "3":
                    diary.deleteEntries();
                case "4":
                    System.out.println("press any key to quite the program....");
                    break;
                default:
                    System.out.println("Error. press any key to choose another action.");
                    break;
            }

        }

    }
}


