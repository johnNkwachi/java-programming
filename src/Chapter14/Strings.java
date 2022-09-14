package Chapter14;

public class Strings {
    public static void main(String[] args) {
        String s1 = "Hello world";

        System.out.println("characters in s1: " + s1);

        int length = s1.length();
        System.out.println("the length of characters in s1 is: " + s1.length());

        // print reverse character in s1 by looping through.
        System.out.printf("%nThe string reversed is: ");


        for (int count = s1.length()-1; count >=0 ; count--) {
            System.out.printf("%c ", s1.charAt(count) );


          //  System.out.println( s1.concat(s1));

        }
    }
}
