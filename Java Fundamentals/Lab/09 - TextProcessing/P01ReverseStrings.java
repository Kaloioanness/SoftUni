package TextProcessing;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            StringBuilder reversed = new StringBuilder(input);
            reversed.reverse();
            System.out.printf("%s = %s\n",input,reversed);


            input = scanner.nextLine();
        }
    }
}