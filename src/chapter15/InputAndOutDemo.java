package chapter15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.spec.PSSParameterSpec;
import java.util.Scanner;

public class InputAndOutDemo {
    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter output =
                    Files.newBufferedWriter(Paths.get("/home/johnnaas/Desktop/io.text"));
            Scanner input = new Scanner(System.in);

        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");

        }
    }
}
