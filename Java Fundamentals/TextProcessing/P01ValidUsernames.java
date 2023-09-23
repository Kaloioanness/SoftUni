package JavaFundamentals.Excercises.TextProcessing;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");
        for (int i = 0; i < usernames.length; i++) {
            String currentName = usernames[i];
            if (isLengthValid(currentName) && isSymbolsValid(currentName)){
                System.out.println(currentName);
            }
        }
    }
    public static boolean isLengthValid (String name){
        boolean isValid = false;
        if (name.length() > 3 && name.length() < 16){
            isValid = true;
        }
        return isValid;
    }
    public static boolean isSymbolsValid(String name){
        boolean isValid = true;
        for (int i = 0; i < name.length(); i++) {
            char symbol = name.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '_' && symbol != '-'){
                isValid = false;
            }

        }
        return isValid;
    }
}
