package JavaFundamentals.Excercises.Methods;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        midChar(input);
    }
    public static void midChar(String input){
        if (input.length() % 2 != 0){
            char ch = input.charAt(input.length()/2);
            System.out.println(ch);
        }else {
            char ch1 = input.charAt(input.length()/2);
            char ch2 = input.charAt(input.length()/2-1);
            System.out.printf("%c%c",ch2, ch1);
        }
    }
}
