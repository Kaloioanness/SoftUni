package SoftUni.SignOfIntegerNumbers;

import java.util.Locale;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();

        char operator = scanner.next().charAt(0);

        double num2 = scanner.nextDouble();

        double result = calculate(num1, operator, num2);

        // Format the result without trailing zeros with US/English locale
        String formattedResult = String.format(Locale.US, "%.2f", result).replaceAll("0*$", "").replaceAll("\\.$", "");

        System.out.println(formattedResult);
    }

    public static double calculate(double num1, char operator, double num2) {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
        }

        return result;
    }
}