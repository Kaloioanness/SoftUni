package JavaFundamentals.Excercises.Methods;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!command.equals("END")){
            System.out.println(isPalindrome(command));
            command = scanner.nextLine();

        }
    }
    public static boolean isPalindrome(String command){
        String reversedCommand = "";
        for (int i = command.length()-1; i >= 0 ; i--) {
            reversedCommand += command.charAt(i);
        }
        return command.equals(reversedCommand);
    }

}
