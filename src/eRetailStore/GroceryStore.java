package eRetailStore;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GroceryStore {

    public static void main(String[] args) {
        customerInfo();
    }
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> items = new ArrayList<>();
    static ArrayList<Integer> quantities = new ArrayList<>();
    static ArrayList<Integer> unitPrice = new ArrayList<>();

   static Date date = new Date();
   static int total = 0;

   static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SS");
    static String cashierName;
    static String customerName;
    static int index;
    static int subTotal;
    static double vat;
    static double discount;
    static double payment;


    static String scanner(){
        String name = input.nextLine();
        return name;
    }

    static int scannerInt(){
        return input.nextInt();
    }

    public static void customerInfo(){
        System.out.printf("%s%n" , "Enter Customer Name: ");
        customerName = input.nextLine();
        itemsOrder();
    }

    static void liner(){
        System.out.printf("===================================================================================================================================================================== %n");
    }
    public static void itemsOrder(){
        System.out.printf("%s%n" , "What did the Customer buy: ");
        items.add(scanner());

        System.out.printf("%s%n" , "How many Pieces: ");
        quantities.add(scannerInt());

        System.out.printf("%s%n" , "How much per Unit Price: ");
        unitPrice.add(scannerInt());

        addMoreItems();
    }

    static void addMoreItems() {
        System.out.printf("%s%n" , "Add more Items? ");
        scanner();
        switch (scanner()) {
            case "Yes" -> itemsOrder();
            case "No" -> cashierInfo();
        }
    }

    static void cashierInfo() {
        System.out.printf("%s%n" , "Whats the Cashier's in Charge Name ");
        cashierName = scanner();
        System.out.printf("%s%n" , " How much Discount will he get: ");
        int discount = scannerInt();
        generateInvoice();
    }

    static void generateInvoice() {
        System.out.printf("%s%n" , " Pastor Apostle Bishop Evangelist Elder John Stores \n Main Branch \n Location: Sabo Yaba \n Tel: 08099877383");
        System.out.println("Date: " + simpleDateFormat.format(date));
        System.out.printf("Cashier's Name: %s%n" , cashierName);
        System.out.printf("Customer's Name: %s%n" , customerName);

        System.out.printf("=========================================================================================== %n");
        System.out.printf("%30s%10s%10s%15s%n" , "Item" , "Quantity" , "Price" , "Total(NGN)");
        System.out.printf("========================================================================================== %n");

        for(index = 0 ; index < items.size(); index++ ) {
            total = quantities.get(index) * unitPrice.get(index);
            System.out.printf("%30s%10d%10d%10d%n" , items.get(index) , quantities.get(index) , unitPrice.get(index) , total);
            subTotal += total;
        }
        System.out.printf("============================================================================================= %n");

        System.out.printf("%40s%15d%n" , "Sub Total" , subTotal);
        System.out.printf("%40s%15.2f%n" , "Discount" , getDiscount());
        System.out.printf("%40s%15.2f%n" , "VAT @ 17.50%" , getVat());
        System.out.printf("=========================================================================================== %n");

        System.out.printf("%40s%15.2f%n" , "Bill Total" , billTotal());
        System.out.printf("========================================================================================== %n");

        System.out.printf("%40s%.2f%n" , "This is not a receipt kindly pay " , billTotal());
        System.out.printf("==========================================================================================%n");

        System.out.println("How much did the Customer Pay ");
        payment = scannerInt();

        generateReceipt();
    }

    public static double getVat(){
        return (17.50/100 * subTotal);
    }
    public static double getDiscount(){
        return (discount * 100)/ subTotal;
    }

    public static double billTotal(){
        return (subTotal - getDiscount()) + getVat();
    }

    public static void generateReceipt(){

        System.out.printf("%s%n" , " Pastor Apostle Bishop Evangelist Elder John Stores \n Main Branch \n Location: Sabo Yaba \n Tel: 08099877383");
        System.out.println("Date: " + simpleDateFormat.format(date));
        System.out.printf("Cashier's Name: %s%n" , cashierName);
        System.out.printf("Customer's Name: %s%n" , customerName);

        System.out.printf("=========================================================================================== %n");
        System.out.printf("%30s%10s%10s%15s%n" , "Item" , "Quantity" , "Price" , "Total(NGN)");
        System.out.printf("========================================================================================== %n");

        for(index = 0 ; index < items.size(); index++ ) {
            total = quantities.get(index) * unitPrice.get(index);
            System.out.printf("%30s%10d%10d%10d%n" , items.get(index) , quantities.get(index) , unitPrice.get(index) , total);
        }
        System.out.printf("============================================================================================= %n");

        System.out.printf("%40s%15d%n" , "Sub Total" , subTotal);
        System.out.printf("%40s%15.2f%n" , "Discount" , getDiscount());
        System.out.printf("%40s%15.2f%n" , "VAT @ 17.50%" , getVat());
        System.out.printf("=========================================================================================== %n");

        System.out.printf("%40s%15.2f%n" , "Bill Total" , billTotal());
        System.out.printf("%40s%15.2f%n" , "Amount Paid" , payment);
        System.out.printf("%40s%15.2f%n" , "Balance" , payment - billTotal());

        System.out.printf("=========================================================================================== %n");
        System.out.printf("%40s%n" , "Thanks for your Patronage");
        System.out.printf("=========================================================================================== %n");
    }

}
