package asterik;

import java.util.Scanner;

public class Asterik {

        public static void main(String[] args) {
            int i, j, n;
            n = 5;

            System.out.print("Input number of n: ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            for (i = 1; i <= n; i++) {
                for(int k = 1; k <= (n - i); k++){
                    System.out.print(" ");
                }
                for (j = 1; j <= (2 * i) - 1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


