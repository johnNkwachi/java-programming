package phonebook;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Float.SIZE;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name[] = new String[SIZE];
        String address[] = new String[SIZE];
        String telephone[] = new String[SIZE];
        String email[] = new String[SIZE];

        System.out.println("Enter " + SIZE + "name address telephone and email");

        for (int i = 0; i < SIZE; i++) {
            System.out.print("name: ");
            name[i] = scanner.nextLine();
            System.out.print("address: ");
            address[i] = scanner.nextLine();
            System.out.print("telephone: ");
            telephone[i] = scanner.nextLine();
            System.out.print("email: ");
            email[i]  = scanner.nextLine();
            scanner.nextLine();

        }
    }
}
