import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GroceryListTest {
    public static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
    while(!quit){
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice){
            case 0:
                printInstruction();
                break;
            case 1:
                groceryList.printGroceryList();
                break;
            case 2:
                addItems();
                break;
            case 3:
                modifyItems();
                break;
            case 4:
                removeItemsItems();
                break;
            case 5:
                serachforItems();
                break;
            case 6:
                quit = true;
                break;
          }


      }

    }
     public static void printInstruction(){
         System.out.println("\npress ");
         System.out.println("\t 0 - To print choice options. ");
         System.out.println("\t 1 - To print the list in the grocery items. ");
         System.out.println("\t 2 - To add an item to the list. ");
         System.out.println("\t 3 - To modify an item in the list. ");
         System.out.println("\t 4 - To remove an item from the list. ");
         System.out.println("\t 5 - To search for an item in the list. ");
         System.out.println("\t 6 - To quit the application. ");
     }
     public static void addItems(){
         System.out.print("Please enter the grocery items: ");
         groceryList.addGroceryItem(scanner.nextLine());
     }
     public static void modifyItems(){
         System.out.print("Enter item number: ");
         int itemNo = scanner.nextInt();
         scanner.nextInt();
         System.out.print("Enter replacement item: ");
         String newItem = scanner.nextLine();
         groceryList.modifyGroceryItems(itemNo-1, newItem);
     }
    public static void removeItemsItems() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextInt();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void serachforItems(){
        System.out.print("Item search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) !=null) {
            System.out.println("Found" + searchItem +" in our grocery list");
        } else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}