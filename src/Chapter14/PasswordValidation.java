package Chapter14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {


    public static boolean isValidPassword(String password){
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        Pattern p = Pattern.compile(regex);
        if(password == null) {
            return false;
        }

        Matcher m = p.matcher(password);
        return m.matches();

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password");
        String pass = scanner.nextLine();

        System.out.println(isValidPassword(pass));

    }
        
}
