package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamFile {
    public static void main(String[] args) {
        String[]Cars = {"Honda", "Toyota", "Peugeot", "Volvo", "Unicorns"};
        try(FileOutputStream fos = new FileOutputStream("Cars.txt");
            PrintStream printStream = new PrintStream(fos)){
            System.setOut(printStream);
            for(String cars: Cars) {
                System.out.println(cars);
            }
        }catch (IOException exception){
            System.out.println(exception.getLocalizedMessage());
        }
    }
}
