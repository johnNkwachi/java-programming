package chapter15;

import java.io.*;
import java.nio.Buffer;

public class IntroToFiles {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();
    }
}
