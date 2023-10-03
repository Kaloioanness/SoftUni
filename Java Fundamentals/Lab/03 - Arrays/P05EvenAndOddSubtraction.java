package SoftUni.Arrays;

import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        int sumPositive = 0;
        int sumNegative = 0;
        for (int i = 0; i < numbers.length ; i++) {
            int number = Integer.parseInt(numbers[i]);

            if (number % 2 == 0){
                sumPositive += number;
            }else {
                sumNegative += number;
            }
        }
        int subtraction = sumPositive - sumNegative;
        System.out.println(subtraction);
    }
}
