package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputSt {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("test.txt");
            PrintWriter writer = new PrintWriter(fos)){
            writer.println("We are Africans!!!");
        }catch (IOException exception){
            System.out.println(exception.getLocalizedMessage());
        }
    }
}
