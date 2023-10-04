package SoftUni.SignOfIntegerNumbers;


import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printNumbers(1, i);
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            printNumbers(1, i);
            System.out.println();
        }
    }

    private static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}