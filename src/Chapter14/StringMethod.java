package Chapter14;

public class StringMethod {
    public static void main(String[] args) {

        String s1 = "Hello  world ";
        String s2 = "HellO world";
        String s3 = "waiting for HTML";

        System.out.println(s1.substring(0 , 5 )  +  s3);
        System.out.println(s1.indexOf("world",6));

        System.out.println(s1.compareTo(s2));
    }
}
