package JavaFundamentals.Excercises.DataTypesAndVariables;

import java.util.Scanner;

public class P02SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println(sum);
    }
}