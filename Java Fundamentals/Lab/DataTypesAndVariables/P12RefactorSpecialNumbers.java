package SoftUni.DataTypesAndVariables;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            int currentNumber = number;
            int sumOfDigits = 0;

            while (currentNumber > 0) {
                sumOfDigits += currentNumber % 10;
                currentNumber /= 10;
            }

            boolean isSpecial = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);

            String formattedResult = isSpecial ? "True" : "False";

            System.out.printf("%d -> %s%n", number, formattedResult);
        }

        scanner.close();
    }
}