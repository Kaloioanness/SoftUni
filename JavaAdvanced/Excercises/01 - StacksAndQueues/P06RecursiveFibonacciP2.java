package SoftUni.JavaAdvanced.Excercises.StacksAndQueues;

import java.util.Scanner;

public class P06RecursiveFibonacciP2 {
    public static int getFibonacci(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(getFibonacci(n));
    }
}


