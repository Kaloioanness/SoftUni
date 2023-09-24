package JavaFundamentals.Excercises.Arrays;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] passengers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            passengers[i] = scanner.nextInt();
            sum += passengers[i];
            System.out.print(passengers[i] + " ");

        }
        System.out.printf("\n%d", sum);
    }
}
