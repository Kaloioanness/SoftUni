package JavaFundamentals.Excercises.Methods;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (passLength(password) && lettersAndDigits(password) && digitCount(password)){
            System.out.println("Password is valid");
        }
        if (!passLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!lettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!digitCount(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }


    public static boolean passLength (String password){
        int passLength = password.length();
        boolean isValid = true;
        if (passLength < 6 || passLength > 10){
            isValid = false;
        }
        return isValid;
    }
    public static boolean lettersAndDigits (String password){
        boolean isValid = true;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!(ch > 47 && ch < 58 || ch > 64 && ch < 91 || ch > 96 && ch < 123 )){
                isValid = false;
            }
        }
        return isValid;
    }
    public static boolean digitCount (String password) {
        boolean isValid = true;
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if ( ch >= 48 && ch <= 57){
                digitCount += 1;
            }
        }
        if (digitCount < 2){
            isValid = false;
        }
        return isValid;
    }
}
