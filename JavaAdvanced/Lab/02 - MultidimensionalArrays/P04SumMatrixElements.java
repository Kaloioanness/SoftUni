package SoftUni.JavaAdvanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;
public class P04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = getArray(scanner);
        int rows = arr[0];
        int cols = arr[1];
        int sum = 0;
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] arr1 = getArray(scanner);
            matrix[i] = arr1;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int curr = matrix[i][j];
                sum += curr;
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }

    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
    }
}