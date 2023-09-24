package JavaFundamentals.Excercises.Arrays;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            array1[i] = num1;
            array2[i] = num2;
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(array1[i] + " ");
            }else {
                System.out.print(array2[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(array2[i] + " ");
            } else {
                System.out.print(array1[i] + " ");
            }
        }
    }
}
