package JavaFundamentals.Excercises.DataTypesAndVariables;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumAscii = 0;
        for (int i = 0; i < n ; i++) {
            String input = scanner.nextLine();
            sumAscii += input.charAt(0);
        }
        System.out.printf("The sum equals: %d", sumAscii);
    }
}
