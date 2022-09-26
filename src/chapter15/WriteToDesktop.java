package chapter15;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToDesktop {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("/home/johnnaas/Desktop/test.txt")){
            fileWriter.write("Just do it!!");

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
