package JavaFundamentals.Excercises.Methods;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        topNum(n);
    }
    public static void topNum(int n) {
        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            int startNum = currentNum;
            int sumOfDigit = 0;
            boolean isTopNumber = false;

            while (currentNum > 0) {
                int digit = currentNum % 10;
                sumOfDigit += digit;

                if (digit % 2 != 0) {
                    isTopNumber = true;
                }
                currentNum /= 10;
            }
            if (sumOfDigit % 8 == 0 && isTopNumber) {
                System.out.println(startNum);
            }
        }
    }
}